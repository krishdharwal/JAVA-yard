package Learning;

import java.util.ArrayList;
import java.util.List;
             //  ------------- Min Heap -------------------
public class MinHeap {
    private List<Integer> list;

    MinHeap(){
        this.list = new ArrayList<>();
    }

    int parent(int idx){
        return (idx - 1) / 2;
    }

    int left(int idx){
        return idx * 2 + 1;
    }

    int right(int idx){
        return idx * 2 + 2;
    }

    public void add(int val){
        list.add(val);
        BottomUpHeapForMinHeap(list.size() - 1);
    }

    // for min Learning.heap swap , always minimum value in the top
    public void BottomUpHeapForMinHeap(int idx){
        if (idx == 0){
            return;
        }
        int parent = parent(idx);
        if (list.get(idx) - list.get(parent) < 0){
            swap(idx, parent);
        }
        BottomUpHeapForMinHeap(parent);
    }

    public void display(){
        System.out.println(list);
    }

    public void swap(int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b,temp);
    }

    int removeTop(){
        if (list.isEmpty()){
            return 0;
        }
        // removing the first element
        int topElement = list.get(0);
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);
        TopBottomMinHeap(0);
        return topElement;
    }

    void TopBottomMinHeap(int idx){
        if (idx >= list.size()){
            return;
        }
        int ptr = idx;
        int size = list.size();
        int left = left(idx);
        int right = right(idx);
            if (left < size && list.get(left) - list.get(idx) < 0) {
                idx = left;
            }
            if (right < size && list.get(right) - list.get(idx) < 0) {
                idx = right;
            }
            if (ptr != idx){
            swap(idx,ptr);
            TopBottomMinHeap(idx);
          }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        heap.add(12);
        heap.add(3);
        heap.add(5);
        heap.add(11);

//        Learning.heap.removeTop();
        heap.add(2);
//        Learning.heap.removeTop();
//        Learning.heap.removeTop();

        heap.display();
        heap.sortHeap();
    }


    void sortHeap(){
        List<Integer> temp = new ArrayList<>();
        while (!list.isEmpty()) {
            temp.add(this.removeTop());
        }
        System.out.println(temp);
    }
}
