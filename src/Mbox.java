
public abstract class Mbox implements VertexInterface {
	
	private int x;
	private int y; 
	private Maze maze;
	
	/**
	 * TODO : revoir la conception 
	 * 
	 * @param x
	 * @param y
	 * @param maze
	 */
	public Mbox(int x, int y, Maze maze) {
		this.x=x;
		this.y=y;
		this.maze=maze;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public abstract String getLabel();

	@Override
	public String toString() {
		return this.getLabel();
	}
	
	
	

}
