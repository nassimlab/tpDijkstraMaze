import java.util.ArrayList;

public interface GraphInterface {
	
	public ArrayList<VertexInterface> getVertexList();
	public ArrayList<VertexInterface> getSuccessorsList(VertexInterface pivot);
	
	

}
