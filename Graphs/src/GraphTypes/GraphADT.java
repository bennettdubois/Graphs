package GraphTypes;
/**
 * GraphADT.java -- parent class for simple graph-manipulation project
 * CSC 230 Fall 2013
 * 
 * 11/8/17:  A. Thall -- Refactored:  renamed GraphADT from older MyGraph
 * 11/9/17:  Added boolean isIsomorphic(GraphADT g); interface for isomorphism test (Molina request)
 *    other stuff, too
 */

import GraphDraw.*;

import java.util.ArrayList;

/**
 * SpatiallyMapped stores array of positions (Points) and has vertex and edge iteratables
 */
public abstract class GraphADT implements SpatiallyMapped {

	/**
	 * What's a Graph?
	 */
	
	int nVerts;
	int nEdges;
	
	public ArrayList<Point> coords;//needed for spatiallymapped
	
	public GraphADT() {
		
		nVerts = 0;
		nEdges = 0;
		coords = new ArrayList<Point>();
		
	}
	
	public GraphADT(int nVerts) {
		this.nVerts = nVerts;
		this.nEdges = 0;
		coords = new ArrayList<Point>();
		for (int i = 0; i < nVerts; i++)
			coords.add(new Point());
	}
	
	public GraphADT(int nVerts, ArrayList<Point> coords) {
		this.coords = coords;
		this.nVerts = nVerts;
		this.nEdges = 0;
	}

	public int numEdges() { return nEdges; }
	public int numVerts() { return nVerts; }
	public Point loc(int i) { return coords.get(i); }
	
	public Iterable<Point> vertexIterable() {
		return coords;
	}
	
	public abstract Iterable<Segment> segmentIterable();
	
	public abstract int addVertex();
	public abstract void addEdge(int v0, int v1);//guarantee any child will have an addEdge
	//public abstract void removeEdge(int v0, int v1);//need to add this to every one
	public abstract void addRandomEdge();
	
	public abstract boolean hasEdge(int v0, int v1);
	public abstract boolean hasPath(int v0, int v1);
	public abstract boolean connected(); //can you reach every vertex from any other one?
	public abstract boolean isIsomorphic(GraphADT g);
	public abstract GraphADT dfsGraph();
	public abstract GraphADT bfsGraph();
	public abstract void createGraph();
	
	ArrayList<Point> marked;
	
	public boolean marked(int v){
		return marked.contains(v);
	}
	
	
	public static void main(String []args) {
		
		GraphADT thisG = null;
		//can't do GraphADT thisG = new GraphADT(); because it is an abstract class.
		//   You can define it and you can assign child classes to this pointer, but you can't 
		//   instantiate it
		
		System.out.println("This does absolutely nothing");
	}
	

}