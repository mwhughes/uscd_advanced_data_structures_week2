package roadgraph;

import geography.GeographicPoint;

public class GeoEdge {
	
	
	private GeoVertex toVertex;
	private GeoVertex fromVertex;
	private String roadNameE;
	private double lengthE;
	private String roadTypeE;
	
	public GeoEdge(GeographicPoint from, GeographicPoint to, String roadName,
			String roadType, double length)
	{
		
		this.roadNameE = roadName;
		this.lengthE = length;
		this.roadTypeE = roadType;
		
	}
	
	public GeographicPoint getToPoint()
	{
		return toVertex.getPoint();
	}
	public GeographicPoint getFromPoint()
	{
		return fromVertex.getPoint();
	}
	public double getLength()
	{
		return lengthE;
	}
	
	public String getRoadNameE()
	{
		return roadNameE;
	}
	
	public String getRoadType()
	{
		return roadTypeE;
	}
	
	public void setToVertex(GeoVertex v)
	{
		this.toVertex = v;
	}
	
	public void setFromVertex(GeoVertex v)
	{
		this.fromVertex = v;
	}
	
	public GeoVertex getToVertex()
	{
		return toVertex;
	}
	public GeoVertex getFromVertex()
	{
		return fromVertex;
	}

}
