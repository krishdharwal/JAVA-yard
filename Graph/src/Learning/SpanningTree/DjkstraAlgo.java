package Learning.SpanningTree;

import Learning.GraphNode;


import java.util.*;

public class DjkstraAlgo {
    DjkstraAlgo() {
    }

    public void djkstraAlgo(Map<Integer, List<GraphNode>> map){

        PriorityQueue<GraphNode> queue = new PriorityQueue<>(Comparator.comparing(GraphNode::getWeight));
        queue.addAll(map.get(1));

        // add the starting Node
        Map<Integer,Integer>  ans = new HashMap<>();


        for (Map.Entry<Integer,List<GraphNode>> mapEmtry : map.entrySet() ) {
            ans.put(mapEmtry.getKey(), Integer.MAX_VALUE);
        }
        ans.put(1,0);

        while (!queue.isEmpty()){
            GraphNode currentNode = queue.poll();


            // add the current Node edges in queue
            queue.addAll(map.get(currentNode.getSource()));



        }


    }

}
