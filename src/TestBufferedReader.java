import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {
	public static void main(String[] args) {
	
	//public final void initFromTextFile(String fileName) {
		File file = new File("fileName.txt"); 
		
		{ 
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			
			System.out.println(line);
		} catch (FileNotFoundException e) {
			System.err.println("Le fichier est introuvable");
		} catch (IOException e) { 
			System.err.println("Impossible de lire le fichier");
		}
}
}
}