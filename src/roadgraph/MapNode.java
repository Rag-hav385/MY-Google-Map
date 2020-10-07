package roadgraph;

import java.util.ArrayList;
import java.util.List;

import geography.GeographicPoint;

/**
 * 
 * 
 * A class which represents the info about the node of the graph.
 * It has the value of location x,location y,list of neighbours. 
 * it has all the getters and setters for the private instance variables.
 */

public class MapNode extends GeographicPoint implements Comparable<MapNode> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private instance variables
	
	private List<MapEdge> edges = new ArrayList<>();
	
	private double distancefromstart;
	private double straightdistancetogoal;
	//constructors
	
	
	public MapNode(double lat , double lon) {
		super(lat , lon);
		
	}
	
	public static MapNode fromGeographicPoint(GeographicPoint point) {
		return new MapNode(point.x , point.y);
	}

	public void addEdge(MapNode to, String roadName, String roadType, double length) {
		MapEdge me = new MapEdge(to , roadName, roadType, length);
		edges.add(me);
	}
	//getters and setters
	
	
	
	public List<MapEdge> getEdges() {
		return edges;
	} 

	public int numOfEdges() {
		return edges.size();
	}
	
	public double getDistanceFromStart() {
		return distancefromstart;
	}
	
	public void setDistanceFromStart(double distance) {
		this.distancefromstart = distance;
	}
	
	public double getStraightDistanceToGoal() {
		return this.straightdistancetogoal;
	}
	
	public void setStraightDistanceToGoal(GeographicPoint goal) {
		 this.straightdistancetogoal = distance(goal);
	}
	public void setStraightDistanceToGoal(double dist) {
		this.straightdistancetogoal = dist;
		
	}
	public double getMinDisEdge(MapNode node) {
		double min = 0;
		for(MapEdge me : node.getEdges()) {
			if(me.getDistance() < min) {
				min = me.getDistance();
				
			}
		}
		return min + node.getDistanceFromStart();
	}
	
	public int compareTo(MapNode node) {
		double result = this.distancefromstart + this.straightdistancetogoal;
		
		return result < 0 ? -1 : result == 0 ? 0 : 1;
		
	}
}
