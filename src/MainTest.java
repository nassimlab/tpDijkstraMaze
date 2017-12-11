import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, MazeReadingException, Exception {
		
		Maze maze = new Maze(10, 10);
		
		maze.initFromTextFile("data/labyrinthe.txt");
		
	}
	
	

}
