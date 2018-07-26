package pset5;
import org.junit.Test;
import java.util.Set;import java.util.TreeSet;import static org.junit.Assert .*;

public class GraphTesterSolution
{


    boolean testGraph1[][] = new boolean[][]{{false, true, false, false, false, false, false, false, false, true}, {true, false, true, true, false, false, false, false, false, false}, {false, false, false, false, false, false, false, true, false, false}, {false, false, false, false, false, true, false, false, true, false}, {false, false, false, false, false, false, false, false, false, true}, {false, true, false, false, false, false, false, false, false, false}, {false, false, true, false, false, false, false, true, false, false}, {false, false, false, false, false, false, false, false, false, false}, {false, false, false, false, false, false, false, false, false, false}, {false, false, false, false, false, false, false, false, false, false}};
    boolean testGraph2[][] = new boolean[1000][1000];
    boolean testGraph3[][] = new boolean[][]{{false, true, false, false, false, false, false, false, false, false}, {false, false, false, false, false, false, false, true, false, false}, {false, false, false, false, false, false, false, false, false, false}, {false, false, false, false, false, true, false, false, true, false}, {false, false, false, true, false, false, false, false, false, false}, {false, false, true, false, false, false, false, true, false, false}, {true, false, false, false, false, false, false, false, false, false}, {false, false, false, false, false, false, true, false, false, false}, {false, false, false, false, false, false, false, false, false, false}, {false, false, true, false, false, false, false, false, false, false}};

    @Test
    public void tr0()
    {
        Graph g = new Graph(10);
        g.edges = testGraph1;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        targets.add(1);
        targets.add(3);
        targets.add(6);
        assertFalse(g.reachable(sources, targets));
    }

    @Test
    public void tr1()
    {
        Graph g = new Graph(10);
        g.edges = testGraph1;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        sources.add(9);
        sources.add(5);
        sources.add(0);
        assertTrue(g.reachable(sources, targets));
    }

    @Test
    public void tr2()
    {
        Graph g = new Graph(10);
        g.edges = testGraph1;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        sources.add(5);
        sources.add(0);
        targets.add(-1);
        assertFalse(g.reachable(sources, targets));
    }

    @Test
    public void tr3()
    {
        Graph g = new Graph(1000);
        for (int x = 0; x < 1000; x++)
        {
            for (int y = 0; y < 1000; y++)
            {
                testGraph2[x][y] = false;
            }
        }
        g.edges = testGraph2;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        for (int x = 0; x < 1000; x++)
        {
            sources.add(x);
            targets.add(x);
        }
        assertTrue(g.reachable(sources, targets));
    }

    @Test
    public void tr4()
    {
        Graph g = new Graph(10);
        g.edges = testGraph1;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        sources.add(3);
        sources.add(5);
        sources.add(8);
        targets.add(9);
        targets.add(7);
        targets.add(8);
        assertTrue(g.reachable(sources, targets));
    }

    @Test
    public void tr5()
    {
        Graph g = new Graph(10);
        g.edges = testGraph1;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        sources.add(5);
        sources.add(2);
        targets.add(7);
        targets.add(8);
        targets.add(3);
        targets.add(5);
        targets.add(0);
        targets.add(9);
        targets.add(6);
        assertFalse(g.reachable(sources, targets));
    }

    @Test
    public void tr6()
    {
        Graph g = new Graph(10);
        g.edges = testGraph3;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();
        sources.add(4);
        sources.add(8);
        sources.add(9);
        targets.add(1);
        targets.add(2);
        targets.add(3);
        targets.add(4);
        targets.add(5);
        targets.add(6);
        targets.add(7);
        targets.add(8);
        targets.add(9);
        assertTrue(g.reachable(sources, targets));
    }

    @Test
    public void tr7()
    {
        Graph g = new Graph(10);
        g.edges = testGraph3;
        Set<Integer> sources = new TreeSet<Integer>();
        Set<Integer> targets = new TreeSet<Integer>();

    }
}
