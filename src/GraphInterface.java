import java.util.*;

public interface GraphInterface
{
	/* * * * * * * * * * * * * * * * * * * * * * * *
	* 				Properties  
	* * * * * * * * * * * * * * * * * * * * * * * */
	public LinkedList<Vertex> verts = new LinkedList<Vertex>();

	/* * * * * * * * * * * * * * * * * * * * * * * *
	* 				Accessors  
	* * * * * * * * * * * * * * * * * * * * * * * */
	public int numVerts();
	public int numEdges();
	public LinkedList<Vertex> getAllVerts();
	public LinkedList<Edge> getAllEdges();
	public Vertex getVertex(String city, boolean printNotFound);
	public int getDegree(String city);
	public LinkedList<Edge> getEdges(String city);
	public LinkedList<Vertex> getAdjacent(String city);

	/* * * * * * * * * * * * * * * * * * * * * * * *
	* 				Mutators  
	* * * * * * * * * * * * * * * * * * * * * * * */
	public void addVertex(String city);
	public void addEdge(Vertex end1, Vertex end2, int weight);
	public void sortEdges();

}