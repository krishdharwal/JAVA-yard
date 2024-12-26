package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KthLargest {

    public List<Integer> list;
    public int k;

    private int parent(int idx){
        return (idx - 1) / 2;
    }

    private int left(int idx){
        return idx * 2 + 1;
    }

    private int right(int idx){
        return idx * 2 + 2;
    }


    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.list = new ArrayList<>();
        if (nums.length <= 0){
            return;
        }
        Arrays.sort(nums);
        int sub = nums.length - k;
        int j = Math.max(sub, 0); 
        int[] arr = Arrays.copyOfRange(nums,j,nums.length);
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }
    
    public int add(int val) {
        if (list.size() < k){
            list.add(val);
            BottomUpHeapForMinHeap(list.size()-1);
        } else if (!list.isEmpty() && list.get(0) < val) {
            removeTop(val);
        }
        System.out.println(list.get(0));
        return list.get(0);
    }


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

    public void swap(int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b,temp);
    }

    void removeTop(int val){
        if (list.isEmpty()){
            return;
        }
        // removing the first element
        list.set(0,val);
        TopBottomMinHeap(0);
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
        int[] arr = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(2 ,new int[]{0});
        System.out.println(kthLargest.list);
//        kthLargest.add(0);
        kthLargest.add(-1); // return 4
        kthLargest.add(1); // return 5
        kthLargest.add(-2); // return 5
        kthLargest.add(-4); // return 8
        kthLargest.add(3); // return 8
        System.out.println(kthLargest.list);
    }
}