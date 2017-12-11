import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Maze implements GraphInterface {

	private Mbox[][] M;
	private int nblines;
	private int nbcolumns;

	public Maze(int nblines, int nbcolumns) {
		this.nblines = nblines;
		this.nbcolumns = nbcolumns;
		
		M = new Mbox[nblines][nbcolumns];  // TODO A revoir
	}

	public ArrayList<VertexInterface> getVertexList() {
		ArrayList<VertexInterface> L = new ArrayList<VertexInterface>();
		for (int i = 0; i < nblines; i++) {
			for (int j = 0; j < nbcolumns; j++) {
				L.add(M[i][j]);

			}
		}

		return L;

	}

	public ArrayList<VertexInterface> getSuccessorsList(VertexInterface vertex) {
		ArrayList<VertexInterface> L = new ArrayList<VertexInterface>();
		Mbox box = (Mbox) vertex;
		int x = box.getX();
		int y = box.getY();

		if (M[x + 1][y].getLabel().equals("E")) {
			L.add(M[x + 1][y]);
		}

		if (M[x][y + 1].getLabel().equals("E")) {
			L.add(M[x][y + 1]);
		}

		if (M[x - 1][y].getLabel().equals("E")) {
			L.add(M[x - 1][y]);
		}

		if (M[x][y - 1].getLabel().equals("E")) {
			L.add(M[x][y - 1]);
		}

		return L;

	}

	public int getWeight(VertexInterface src, VertexInterface dst) {

		ArrayList<VertexInterface> L = this.getSuccessorsList(src);
		Mbox bdst = (Mbox) dst;
		for (VertexInterface r : L) {
			Mbox box = (Mbox) r;
			if (box.getX() == bdst.getX() && box.getY() == bdst.getY()) {
				return 1;
			}
		}

		return 0;
	}

	public final void initFromTextFile(String fileName) throws MazeReadingException {

		// test nullité du nom de fichier
		if(fileName == null) {
			throw new MazeReadingException("", -1, "Nom de fichier indéfini");
		}
		
		File file = new File(fileName);
		
		BufferedReader bufferedReader = null;
		try {
		FileReader fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		
		
		for(int i=0; i < nblines; i++) {
			String line = bufferedReader.readLine();

			// Test ligne vide ou null
			if(line == null) {
				throw new MazeReadingException(fileName, i, "Le fichier contient seulement " + i +1 + " ligne(s)");
			}
			int j = 0;
			for(j=0; j < nbcolumns; j++) {
				
				Character c = line.charAt(j);
				String s = c.toString();
			
				if(s.equals("A")) {
					M[i][j]= new ABox(i,j,this);
					
				} else if(s.equals("D")) {
					System.out.println("i = " + i);
					System.out.println("j = " + j);
					M[i][j]= new DBox(i,j,this);
					
				} else if(s.equals("E")) {
					M[i][j]= new EBox(i,j,this);
					
				} else if(s.equals("W")) {
					M[i][j]= new WBox(i,j,this);
					
				} else {
					// Cas impossible throw
				}
			}
			
			// Test nombre de colone traité pour la ligne en cours
			if(j < nbcolumns - 1) {
				// Throw ... Mo
			}
		}
		} catch (FileNotFoundException e) {
//			throw new MazeReadingException
		} catch (IOException e) {
			
		} finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new MazeReadingException()
				} // TODO : entourer d'un try catch
			}
		}
		
		
		
		
	}
	

	public int getNblines() {
		return nblines;
	}

	public void setNblines(int nblines) {
		this.nblines = nblines;
	}

	public int getNbcolumns() {
		return nbcolumns;
	}

	public void setNbcolumns(int nbcolumns) {
		this.nbcolumns = nbcolumns;
	}

	/*
	 * try { FileReader fileReader = new FileReader(file); bufferedReader = new
	 * BufferedReader(fileReader);
	 * 
	 * String line; while((line = bufferedReader.readLine()) != null) {
	 * System.out.println(line); }
	 * 
	 * 
	 * } catch (FileNotFoundException e) {
	 * System.err.println("Le fichier est introuvable"); } catch (IOException e) {
	 * System.err.println("Impossible de lire le fichier"); }
	 * 
	 * try { bufferedReader.close(); } catch(IOException e) {
	 * System.err.print("Impossible de fermer le fichier"); }
	 * catch(NullPointerException e) {
	 * 
	 * }
	 */

}