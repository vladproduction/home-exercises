package gfl.graph;

import java.util.List;
import java.util.Stack;

public class MyDFS {

    public void traverseGraph(MyGraph graph, int startPoint) {

        Stack<Integer> stack = new Stack<>();
        stack.push(startPoint);

        while (!stack.isEmpty()) {
            int sourceNode = stack.pop();
            System.out.println(sourceNode);
            List<Integer> paths = graph.getPathFromNode(sourceNode);
            for (int i = 0; i < paths.size(); i++) {
                int lastIndex = paths.size() - 1;
                int nodeNumber = paths.get(lastIndex - i);
                stack.push(nodeNumber);
            }
        }
    }
}
