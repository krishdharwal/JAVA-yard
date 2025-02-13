package graph;

import java.util.*;

public class BFS {
    BFS(){}

    public void breadthFirstSearch(int startingVertex, Map<Integer, List<Integer>> map) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        queue.add(startingVertex);

        System.out.println("BFS");
        while (!queue.isEmpty()){

            int currentVertex = queue.poll();
            if (set.contains(currentVertex)){
                continue;
            }
            set.add(currentVertex);
            System.out.print(currentVertex + " -> ");

            for(int ele : map.getOrDefault(currentVertex,new LinkedList<>())){
                if (!set.contains(ele)){
                    queue.offer(ele);
                }
            }
        }
    }

}
