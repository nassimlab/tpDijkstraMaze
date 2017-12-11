
public class DBox extends Mbox {
	
	public DBox(int x, int y, Maze maze) {
		
		super(x, y, maze);
	}
	
	public String getLabel() {
		return "D";
	}

	@Override
	public boolean IsDifferentFrom(VertexInterface r) {
		// TODO Auto-generated method stub
		return false;
	}

}
