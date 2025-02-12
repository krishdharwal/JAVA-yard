package graph;

import java.util.Arrays;

public class AdjasencyMatrix {
    private int matrixNodes;
    private int[][] matrix;

    public AdjasencyMatrix(){

    }

    public void buildMatrix(int matrixNodes){
        this.matrixNodes = matrixNodes;
        this.matrix = new int[matrixNodes][matrixNodes];
    }

    public void display(){
        for(int[] arr : this.matrix){
            System.out.println(Arrays.toString(arr));
        }
    }

    public void add(int i,int j){
        matrix[i-1][j-1] = 1;
        matrix[j-1][i-1] = 1;
    }

    public void add(int i,int j,int weight){
        matrix[i-1][j-1] = weight;
        matrix[j-1][i-1] = weight;
    }

    public void remove(int i , int j){
       matrix[i-1][j-1] = 0;
       matrix[j-1][i-1] = 0;
    }

    // remove last index of matrix
    public void removeNode(){
        int[][] rebuildMatrix = new int[matrixNodes-1][matrixNodes-1];

        for (int i = 0; i < matrixNodes-1; i++) {
            for (int j = 0; j < matrixNodes-1; j++) {
                rebuildMatrix[i][j] = matrix[i][j];
            }
        }

        matrix = rebuildMatrix;
        matrixNodes -= 1;
    }

    public static void main(String[] args) {
        AdjasencyMatrix matrix = new AdjasencyMatrix();
        matrix.buildMatrix(5);
        matrix.add(1,2);
        matrix.add(1,3);
        matrix.add(3,2);
        matrix.add(2,4);
        matrix.add(3,5);
        matrix.add(5,4);
        matrix.removeNode();
        matrix.display();
    }



}
