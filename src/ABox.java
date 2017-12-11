
public class ABox extends Mbox {
	
	public ABox(int x, int y, Maze maze) 
	{
		super(x, y, maze); 
	}
	
	public String getLabel() {
		return "A";
	}

	@Override
	public boolean IsDifferentFrom(VertexInterface r) {
		// TODO Auto-generated method stub
		return false;
	}

}
