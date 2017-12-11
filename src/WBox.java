
public class WBox extends Mbox {
	
	public WBox(int x, int y, Maze maze) {
		
		super(x, y, maze);
	}

	public boolean isAccessible() {
		return false;
	}
	
	public String getLabel() {
		return "W";
	}

	@Override
	public boolean IsDifferentFrom(VertexInterface r) {
		// TODO Auto-generated method stub
		return false;
	}
}
