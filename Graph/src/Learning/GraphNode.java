package Learning;

public class GraphNode {
    int source;
    int destination;
    int weight;

    GraphNode(){

    }

    public GraphNode(int source, int destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
