package pset5;

import static org.junit.Assert.*;

import java.util.TreeSet;
import java.util.Set;

import org.junit.Test;

public class GraphTester
{
    // tests for method "addEdge" in class "Graph"
    @Test
    public void tae0()
    {
        Graph g = new Graph(2);
        g.addEdge(0, 1);
        System.out.println(g);
        assertEquals(g.toString(), "numNodes: 2\nedges: [[false, true], [false, false]]");
    }
    // your tests for method "addEdge" in class "Graph" go here
    // you must provide at least 4 test methods;
    // each test method has at least 1 invocation of addEdge;
    // each test method creates exactly 1 graph
    // each test method creates a unique graph w.r.t. "equals" method
    // each test method has at least 1 test assertion;
    // your test methods provide full statement coverage of your
    // implementation of addEdge and any helper methods
    // no test method directly invokes any method that is not
    // declared in the Graph class as given in this homework

    // Test tae1 and tae2 test adding from an illegal node to a valid one
    // Node is illegal if its value is <0
    @Test
    public void tae1()
    {
        Graph g = new Graph(2);
        g.addEdge(-1, 0);
        System.out.println(g);
        assertEquals(g.toString(), "numNodes: 2\nedges: [[false, false], [false, false]]");
    }

    // Node is illegal if its value is >= the size of the graph
    @Test
    public void tae2()
    {
        Graph g = new Graph(2);
        g.addEdge(1,1);
        // 2 is an illegal node
        g.addEdge(2, 0);
        System.out.println(g);
        assertEquals(g.toString(), "numNodes: 2\nedges: [[false, false], [false, true]]");
    }

    // Tests tae3 and tae4 test adding from an valid node to an illegal one
    // Node is illegal if its value is <0
    @Test
    public void tae3()
    {
        Graph g = new Graph(3);
        // -1 is a illegal node
        g.addEdge(0, -1);
        System.out.println(g);
        assertEquals(g.toString(), "numNodes: 3\nedges: [[false, false, false], [false, false, false], [false, false, false]]");
    }

    // Node is illegal if its value is >= the size of the graph
    @Test
    public void tae4()
    {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,3);
        // 5 is an illegal node
        g.addEdge(0, 5);
        System.out.println(g);
        assertEquals(g.toString(), "numNodes: 4\nedges: [[false, true, false, false], [false, false, false, true], [false, false, false, false], [false, false, false, false]]");
    }

    // Tests tae5 and tae6 test adding from an illegal node to an illegal one
    // Node is illegal if its value is <0
    @Test
    public void tae5()
    {
        Graph g = new Graph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        // 4 is an illegal node
        g.addEdge(4,4);
        assertEquals(g.toString(), "numNodes: 3\nedges: [[false, true, false], [false, false, true], [false, false, false]]");
    }

    // Tests for adding from an illegal node to an illegal one
    // Node is illegal if its value is <0
    @Test
    public void tae6()
    {
        Graph g = new Graph(3);
        g.addEdge(0,1);
        g.addEdge(0,2);
        // -4 and -2 are illegal nodes
        g.addEdge(-4,-2);
        assertEquals(g.toString(), "numNodes: 3\nedges: [[false, true, true], [false, false, false], [false, false, false]]");
    }
    // ...
    // tests for method "reachable" in class "Graph"
    @Test
    public void tr0()
    {
        Graph g = new Graph(1);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        assertTrue(g.reachable(nodes, nodes));
    }

    // your tests for method "reachable" in class "Graph" go here
    // you must provide at least 6 test methods;
    // each test method must have at least 1 invocation of reachable;
    // each test method must have at least 1 test assertion;
    // at least 2 test methods must have at least 1 invocation of addEdge;
    // your test methods must provide full statement coverage of your
    // implementation of reachable and any helper methods
    // no test method directly invokes any method that is not
    // declared in the Graph class as given in this homework
    // ...

    @Test
    public void tr1()
    {
    }

    @Test
    public void tr2()
    {
    }

    @Test
    public void tr3()
    {
    }

    @Test
    public void tr4()
    {
    }

    @Test
    public void tr5()
    {
    }

    @Test
    public void tr6()
    {
    }
}
