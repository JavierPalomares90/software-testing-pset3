package pset5;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class Graph
{
    private int numNodes; // number of nodes in the graph
    private boolean[][] edges; // edges[i][j] is true if and only if there is an edge from node i to node j

    // class invariant: fields "edges" is non-null;
    // "edges" is a square matrix;
    // numNodes is number of rows in "edges"
    public Graph(int size)
    {
        numNodes = size;
        // your code goes here // ...
        // Initialize the matrix of edges
        edges = new boolean[size][size];
    }

    public String toString()
    {
        return "numNodes: " + numNodes + "\n" + "edges: " + Arrays.deepToString(edges);
    }

    public boolean equals(Object o)
    {
        if (o.getClass() != Graph.class) return false;
        return toString().equals(o.toString());
    }

    private boolean isIllegalNode(int node)
    {
        /*
         * Node must be in the range [0,numNodes-1]
         */
        if( node < 0 )
        {
            return true;
        }else if( numNodes <= node )
        {
            return true;
        }
        return false;
    }

    public void addEdge(int from, int to)
    {
        // postcondition: adds a directed edge "from" -> "to" to this graph
        // your code goes here //...

        // Ignore illegal nodes
        if( isIllegalNode(from) )
        {
            return;
        }
        if( isIllegalNode(to) )
        {
            return;
        }
        edges[from][to] = true;
    }

    /*
     * Iterate over the graph using depth first search
     */
    private boolean isReachable(int source, int target)
    {
        if(source == target)
        {
            return true;
        }
        Stack<Integer> s = new Stack<>();
        s.push(source);
        while(s.empty() == false)
        {
            /**
             * TODO: check if this should be peek or pop
             */
            int curr = s.pop();
            if(curr == target)
            {
                // Found the target
                return true;
            }
            for (int j = 0; j < numNodes; j++)
            {
                // Add all nodes reachable from the current node
                if(edges[curr][j] == true)
                {
                    s.push(j);
                }
            }
        }
        // Finished iterating over the graph
        // Did not find a path from source to target
        return false;
    }

    public boolean reachable(Set<Integer> sources, Set<Integer> targets)
    {
        if (sources == null || targets == null) throw new IllegalArgumentException();
        // postcondition: returns true if
        // (1) "sources" does not contain an illegal node,
        // (2) "targets" does not contain an illegal node, and
        // (3) for each node "m" in set "targets", there is some
        // node "n" in set "sources" such that there is a directed
        // path that starts at "n" and ends at "m" in "this"; and
        // false otherwise
        // your code goes here //...

        for (int target: targets)
        {
            if(isIllegalNode(target))
            {
                return false;
            }
            boolean isReachable = false;
            for (int source : sources)
            {
                if(isIllegalNode(source))
                {
                    return false;
                }

                boolean foundPath = isReachable(source,target);
                if(foundPath == true)
                {
                    // Found a directed path from source to the target
                    isReachable = true;
                    break;
                }
            }
            if(isReachable == false)
            {
                // Searched all the sources and did not find a path to the target.
                return false;
            }

        }
        return true;
    }
}
