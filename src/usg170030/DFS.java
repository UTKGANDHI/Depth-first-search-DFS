/** Starter code for SP8
 *  @author
 */

// change to your netid
package usg170030;

import rbk.Graph;
import rbk.Graph.Vertex;
import rbk.Graph.GraphAlgorithm;
import rbk.Graph.Factory;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DFS extends GraphAlgorithm<DFS.DFSVertex> {

    public static final int INFINITY = Integer.MAX_VALUE;
    Vertex src;
    List<Vertex> finishList;


    public static class DFSVertex implements Factory {

        boolean seen;
        DFSVertex parent;
        int distance;  // distance of vertex from source


        public DFSVertex(Vertex u) {
            seen = false;
            parent = null;
            distance = INFINITY;
        }
        public DFSVertex make(Vertex u) { return new DFSVertex(u); }
    }

    public DFS(Graph g) {
        super(g, new DFSVertex(null));
        finishList = new LinkedList<>();

    }

    public static DFS depthFirstSearch(Graph g) {

        

        return null;
    }

    public void dfs_visit(Vertex src)
    {
        this.src = src;
        for(Vertex u: g) {
            get(u).seen = false;
            get(u).parent = null;
            get(u).distance = INFINITY;
        }



    }


    // Member function to find topological order
    public List<Vertex> topologicalOrder1() {

        return finishList;
    }


    // Find topological oder of a DAG using DFS. Returns null if g is not a DAG.
    public static List<Vertex> topologicalOrder1(Graph g) {
        DFS d = new DFS(g);
        return d.topologicalOrder1();
    }


    public static void main(String[] args) throws Exception {
        String string = "7 8   1 2 2   1 3 3   2 4 5   3 4 4   4 5 1   5 1 7   6 7 1   7 6 1 0";
        Scanner in;
        // If there is a command line argument, use it as file from which
        // input is read, otherwise use input from string.
        in = args.length > 0 ? new Scanner(new File(args[0])) : new Scanner(string);

        // Read graph from input
        Graph g = Graph.readGraph(in);
        g.printGraph(false);



    }
}