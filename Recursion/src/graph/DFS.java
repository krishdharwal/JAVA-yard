package graph;

import java.util.*;

public class DFS  {
    DFS(){
    }

    public void depthFirstSearch(int startingVertex,Map<Integer, List<Integer>> map){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startingVertex);

        while (!queue.isEmpty()){

            int currentNode = queue.poll();
            if (visited.contains(currentNode)){
                continue;
            }
            visited.add(currentNode);
            System.out.println(currentNode);

            for(int ele : map.getOrDefault(currentNode,new LinkedList<>())){
                if (!visited.contains(ele)){
                    queue.add(ele);
                }
            }


        }
    }
}
