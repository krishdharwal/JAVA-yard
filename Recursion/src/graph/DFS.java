package graph;

import java.util.*;

public class DFS  {
    DFS(){
    }

    public void depthFirstSearch(int startingVertex,Map<Integer, List<Integer>> map){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.add(startingVertex);

        System.out.println("DFS");
        while (!stack.isEmpty()){

            int currentNode = stack.pop();
            if (visited.contains(currentNode)){
                continue;
            }
            visited.add(currentNode);
            System.out.print(currentNode + " -> ");

            for(int ele : map.getOrDefault(currentNode,new LinkedList<>())){
                if (!visited.contains(ele)){
                    stack.add(ele);
                }
            }


        }
    }
}
