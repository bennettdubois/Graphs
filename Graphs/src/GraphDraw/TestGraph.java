package GraphDraw;
import GraphTypes.*;

import java.util.ArrayList;

/**
 * TestGraph.java -- class to execute tests and display generic points, segments, and graphs
 *    for data in a unit-square
 *
 * A. Thall
 * CSC 240 W12
 * 2/25/2012
 */


import java.awt.*;
import javax.swing.*;

/**
 * @author Bennett DuBois
 * 
 * For implementing AdjMatrixGraph and AdjListGraph using breadth-first and depth-first search methods
 *
 */
public class TestGraph extends JFrame
{
    Renderer drawing;
    
    public TestGraph() {
        
        Container content = this.getContentPane();  // get content pane
        content.setLayout(new BorderLayout());      // set its layout
        drawing = new Renderer(this);  // Create a drawing window in the pain
        content.add(drawing, BorderLayout.CENTER);  // center expands
        
        this.setTitle("Swell Graph Renderer");
        this.pack();             // finalize window layout
    }
    
    int choice = 0;
    GraphADT mat = null;
    final int NUMCHOICES = 1;
    
    public void createAndShowPoints() {

    	drawing.clearPoints();
    	drawing.clearEdges();

    	if (choice == 0) {
    		mat = new AdjMatrixGraph(20);
    		mat.createGraph();
    		drawing.addGraph(mat);
    		choice = (choice + 1) % NUMCHOICES;
    		this.setTitle("Adjacency Matrix Graph: BFS");
    	}
    	if (choice == 1) {
    		mat.bfsGraph();
    		drawing.addGraph(mat);
    		choice = (choice + 1) % NUMCHOICES;
    	}

    }

    /**
     * driver method 
     */
    public static void main(String []args) {
        
        JFrame window = new TestGraph();
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
    }
}