package gfl.graph;

import java.util.ArrayList;
import java.util.List;

public class MyGraph {

    private int nodes;

    private List<Integer> [] array = null;

    public MyGraph(int nodes) {
        this.nodes = nodes;
        array = new List [nodes];
        for (int i = 0; i < nodes; i++) {
            array[i] = new ArrayList<>();
        }
    }

    public void addEdge(int sourceNode, int childNode){
        List<Integer> paths = array[sourceNode];
        paths.add(childNode);

    }

    public void printGraph(){
        for (int i = 0; i < array.length; i++) {
            List<Integer> paths = array[i];
            System.out.println(i+"-->"+paths);
        }
    }

    public List<Integer> getPathFromNode(int sourceNode){
        return array[sourceNode];
    }

}
