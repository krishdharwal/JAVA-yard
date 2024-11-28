
import java.util.ArrayList;

public class heap  {
    private ArrayList<Integer> list;

    heap(){
        list = new ArrayList<>();
    }

    private int parent(int idx){
        return (idx - 1) / 2;
    }

    private int left(int idx){
        return idx * 2 + 1;
    }

    private int rightt(int idx){
        return idx * 2 + 2;
    }

     // adding elements as per heap large small criteria or index criteria
    private void add(int data){
        list.add(data);
        upheap(list.size()-1);
    }

    private void upheap(int idx) {
        if (idx == 0){
            return;
        }
        int parent = parent(idx);
        if (list.get(idx) - list.get(parent) < 0){
            // means parent is great so SWAP
            swap(idx,parent);
        }
        upheap(parent);
    }


    // removing elements as per the context
    public int remove(){
        if (list.isEmpty()){
            return 0;
        }

        int temp = list.get(0);
        int last = list.remove(list.size()-1);

        if (!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }

        return temp;
    }

    private void downHeap(int idx) {

        int min = idx;
        int left = left(idx);
        int right = rightt(idx);
        if (left < list.size() && list.get(left) - list.get(min) < 0 ){
            min = left;
        }
        if (right < list.size() && list.get(right) - list.get(min) < 0 ){
            min = right;
        }
        if (min != idx){
            swap(min,idx);
            downHeap(min);
        }
    }


    public void swap(int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public void display(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        heap tree = new heap();
        tree.add(34);
        tree.add(45);
        tree.add(22);
        tree.add(86);
        tree.add(11);
//        tree.add(6);
//        tree.add(7);
//        tree.add(3);
//        tree.remove();
        tree.display();
//        tree.HeapSort();
        tree.Max_Heap();
    }


                      // ----------HEAP SORT------------


    // IN heap sort , display the elements in left right order
    private void HeapSort(){
        ArrayList<Integer> list2 = new ArrayList<>();
        while (!list.isEmpty()) {
            list2.add(this.remove());
        }
        System.out.print(list2);
    }


                        // --------MAX HEAP-------



    // Max HEap -> in this the child of the parent's are smaller or equal to the parent
    // PARENT >= CHILD

    private void Max_Heap(){
        for (int i = list.size() / 2 ; i >= 0; i--) {
            downHeap_MAX(i);
        }
        display();
    }

    private void downHeap_MAX(int idx) {

        int min = idx;
        int left = left(idx);
        int right = rightt(idx);
        if (left < list.size() && list.get(left) - list.get(min) > 0 ){
            min = left;
        }
        if (right < list.size() && list.get(right) - list.get(min) > 0 ){
            min = right;
        }
        if (min != idx){
            swap(min,idx);
            downHeap_MAX(min);
        }
    }
}
