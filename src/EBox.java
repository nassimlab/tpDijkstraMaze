
public class EBox extends Mbox {
	
	public EBox(int x, int y, Maze maze) {
		
		super(x, y, maze);
	}
	
	public boolean IsAccessible() {
		return true;
	}
	
	public String getLabel() {
		return "E";
	}

	@Override
	public boolean IsDifferentFrom(VertexInterface r) {
		// TODO Auto-generated method stub
		return false;
	}

}
