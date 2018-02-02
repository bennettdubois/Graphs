package GraphTypes;

import java.util.ArrayList;

import GraphDraw.Point;
import GraphDraw.Segment;

public class AdjListGraph extends GraphADT {

	//arrayList of arrayList to store edges
	
	public AdjListGraph() {
		super();
	}

	public AdjListGraph(int nVerts) {
		super(nVerts);
		// TODO Auto-generated constructor stub
	}

	public AdjListGraph(int nVerts, ArrayList<Point> coords) {
		super(nVerts, coords);
		// TODO Auto-generated constructor stub
	}

	public void createGraph() {
		
	}
	
	@Override
	public Iterable<Segment> segmentIterable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addVertex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addEdge(int v0, int v1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRandomEdge() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasEdge(int v0, int v1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPath(int v0, int v1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean connected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIsomorphic(GraphADT g) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GraphADT dfsGraph() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphADT bfsGraph() {
		//starts search at first point of list
		super.marked = new ArrayList<Point>();
		Point p = coords.get(0);
		
		super.marked.add(p);
		Point current = coords.get(1);
		
		while(super.marked.size() < coords.size()){
			for(int i=0; i<coords.size(); i++){
				
				if(p.dist(current) > p.dist(coords.get(i))
						&& !super.marked.contains(coords.get(i))
						&& !coords.get(i).equals(current)
						&& !coords.get(i).equals(p))
	//					|| p.equals(current))
					current = coords.get(i);
			}
		
		
	//	this.segments.add(new Segment(p, current));

	//	adjMatrix[coords.indexOf(p)][coords.indexOf(current)] = true;
		super.marked.add(current);
		
	//	System.out.println(segments.size());
		p = current;
		
		//final check if any points have not been visited
		for(int i = 0; i < coords.size(); i++) {
				if(!marked.contains(coords.get(i)) && !coords.get(i).equals(p)) {
					current = coords.get(i);
				}
			
			}
		
		}
		
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}