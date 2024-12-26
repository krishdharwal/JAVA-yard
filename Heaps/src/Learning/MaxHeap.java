package Learning;

import java.util.ArrayList;
import java.util.List;

// Max Heap
// taking the first index as "1"
public class MaxHeap {
    private List<Integer> list;
    MaxHeap(){
        this.list = new ArrayList<>();
    }

    int parent(int i){
        return i / 2;
    }

    int left(int i){
        return i * 2;
    }

    int right(int i){
        return i * 2 + 1;
    }

    void add(int val){
        list.add(val);
        BottomUpHeapForMaxHeap(list.size()-1);
    }

     void BottomUpHeapForMaxHeap(int idx) {
        if (idx <= 0){
            return;
        }

        while (idx > 0) {
            int parent = parent(idx);
            if (list.get(parent) - list.get(idx) < 0) {
                swap(idx, parent);
            }
            idx = parent;
        }
    }

    public void swap(int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b,temp);
    }


    public void display(){
        System.out.println(list);
    }

    void removeTopMaxHeap(){
        if(list.isEmpty()){
            return;
        }
        list.set(0,list.get(list.size()-1));
        list.remove(list.get(list.size()-1));
        TopBottomMaxHeap(0);
    }

    void TopBottomMaxHeap(int idx) {
        if (idx >= list.size()){
            return;
        }
        int size = list.size();
        int ptr = idx;
        int left = left(idx);
        int right = right(idx);
        if (left < size && list.get(idx) - list.get(left) < 0){
            idx = left;
        }
        if (right < size && list.get(idx) - list.get(right) < 0){
            idx = right;
        }
        if (idx != ptr){
            swap(idx , ptr);
            TopBottomMaxHeap(idx);
        }
    }

        public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.add(12);
        heap.add(3);
        heap.add(5);
        heap.add(11);
        heap.add(9);
        heap.add(99);
        heap.removeTopMaxHeap();
        heap.display();
    }

}
