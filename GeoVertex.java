package roadgraph;

import java.util.*;

import geography.GeographicPoint;
/*
 * The GeoVertex class is used to represent graphs of GeographicPoints
 * 
 * The class includes methods to construct a vertex of a 
 */


public class GeoVertex {
	
	private GeographicPoint vPoint;
	private HashMap<GeoVertex, GeoEdge> neighbors;
	private HashMap<GeoVertex, GeoEdge> neighborsIn;
	
	
	public GeoVertex(GeographicPoint p)
	{
		this.vPoint = p;
		this.neighbors = new HashMap<GeoVertex, GeoEdge>();
		this.neighborsIn = new HashMap<GeoVertex, GeoEdge>();
	
	}
	
	public GeographicPoint getPoint()
	{
		return vPoint;
	}
	
	/*
	 * This method returns the set of neighbors that can be 
	 * accessed from this vertex in the graph
	 */
	public Set<GeoVertex> getNeighbors()
	{
		return neighbors.keySet();
	}
	/*
	 * This method returns the set of neighbors that can reach this vertex in the graph
	 */
	public Set<GeoVertex> getNeighborsIn()
	{
		return neighborsIn.keySet();
	}
	
	/*
	 * This method is called when we add an edge to the graph on the
	 *  to and from vertices of the edge by the MapGraph class.
	 *  
	 * The method determines whether the vertex the method has been called on is a to or from-point
	 * of the edge. 
	 * 
	 * If the Vertex that the method is called on is a from-point of the edge e, 
	 * then the method maps the to-point to the edge in the neighbors map,
	 * otherwise the method maps the from-point to the edge in the neighborsIn map.
	 * 
	 *  We thus keep track of all of the neighbors in and out and maintain access to the associated edges
	 *  so that we can access that information if we want to access the properties of the paths in the graph.
	 * 
	 */
	public void addEdge( GeoEdge e)
	{
		//write this method to add an edge depending on whether this vertex is in or out
		if (this.getPoint().equals( e.getFromPoint() ))
		{
			this.neighbors.put(e.getToVertex(), e);
			
		}
		if (this.getPoint().equals( e.getToPoint() ))
		{	
			this.neighborsIn.put(e.getFromVertex(), e);			
		}
	}
	
	/*
	 * Getter method that returns the map to all of out or in-edges depending on the boolean input to the method.
	 * 
	 * This method will allow us to access the Edge objects associated with each out or in Neighbors, and thus access
	 * all of the properties of paths that we have found in the graph.
	 * 
	 * Set wantOutEdges to true to access the map of out-edges, and false to access the map of in-edges.
	 */
	
	public HashMap<GeoVertex, GeoEdge> getMapofEdges(boolean wantOutEdges)
	{
		if (wantOutEdges)
		{
		return neighbors;
		}
		return neighborsIn;
	}
	

	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
