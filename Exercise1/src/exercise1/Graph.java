package exercise1;
import java.util.Iterator;

/** DO NOT MODIFY THIS CLASS - MAKE SUBCLASS AS NEEDED */

public interface Graph {
	
	int getNumberOfVertices();
	
	boolean isDirected();
	
	void insert(Edge e);
	
	boolean isEdge(int source, int destination);
	
	Edge getEdge(int source, int destination);
	
	Iterator<Edge> egdeIterator(int source);
	
}
