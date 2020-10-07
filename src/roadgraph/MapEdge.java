package roadgraph;
/**
 * 
 * 
 * A class which represents the info about the edge of the graph.
 * It has the value of start point,end point,street name,distance. 
 * it has all the getters and setters for the private instance variables.
 */

import geography.GeographicPoint;

public class MapEdge {
	//private instance variables
	
	private MapNode end;
	private String streetname;
	private String streettype;
	private double distance;
	
	//constructors
	public MapEdge() {
		//to create an empty map edge
	}
	
	public MapEdge( MapNode en , String name ,String type, double dist) {
		
		this.end = en;
		this.streetname = name;
		this.streettype = type;
		this.distance = dist;
	}
	
	//getters and setters
	
	public MapNode getEnd() {
		return end;
	}

	public void setEnd(MapNode end) {
		this.end = end;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public String getStreettype() {
		return streettype;
	}

	public void setStreetType(String streettype) {
		this.streetname = streettype;
	}
	
	
}
