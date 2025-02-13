package graph;

// in this we represent the graph using [ List of List ] or [ List of Linked List ] or [ MAP of Linked List ]

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


// I am using Map of Linked list;
public class AdjacencyList {

    private Map<Integer,List<Integer>> map;

    AdjacencyList(){
        this.map = new HashMap<>();
    }

    public void addVertex(int vertex){
        map.put(vertex,new LinkedList<>());
    }

    public void addValues(int a , int b){
        map.get(a).add(b);
        map.get(b).add(a);
    }

    public void display(){
        System.out.println(map);
    }

    public void deleteNode(int delNode){
        if (!map.containsKey(delNode)){
            return;
        }

        List<Integer> list = new LinkedList<>(map.get(delNode));
        for (int child : list){
         deleteNodeHelper(child,delNode);
        }
        map.remove(delNode);
    }

    private void deleteNodeHelper(int findInKey , int delNode){
        if (!map.containsKey(findInKey)){
            return;
        }
        for (int i = 0; i <  map.get(findInKey).size(); i++) {
            if (map.get(findInKey).get(i).equals(delNode)){
                map.get(findInKey).remove(i);
                break;
            }
        }
    }





    public static void main(String[] args) {
        AdjacencyList listGraph = new AdjacencyList();
        for (int i = 0; i < 5; i++) {
            listGraph.addVertex(i);
        }
        listGraph.addValues(1,2);
        listGraph.addValues(1,4);
        listGraph.addValues(2,3);
        listGraph.addValues(3,4);

        listGraph.display();

//        listGraph.deleteNode(2); queue.add(ele);


        DFS dfs = new DFS();
        dfs.depthFirstSearch(1,listGraph.map);

        BFS bfs = new BFS();
        bfs.breadthFirstSearch(1,listGraph.map);
    }
}