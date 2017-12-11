public class MazeReadingException extends Exception

{

	private static final long serialVersionUID = 1L;

	public MazeReadingException(String filename, int errorline, String errormsg) {

		super("Impossible de lire la ligne " + errorline + " dans le fichier  " + filename + " : " + errormsg);

	}
}
