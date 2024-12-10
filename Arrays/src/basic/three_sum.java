package basic;

import java.util.*;

public class three_sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3 ) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        Set<List<Integer>> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length -2; i++) {

            int tar = nums[i];

            int s = i + 1;
            int e = nums.length-1;
            while (s < e){
                int sum = tar + nums[s] + nums[e];
                if (sum == 0){
                    hashSet.add(List.of(tar, nums[s], nums[e]));
                    s++;
                    e--;
                } else if (sum < 0) {
                    s++;
                }else {
                    e--;
                }

            }
        }
        return new ArrayList<>(hashSet);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }


//import java.util.*;
//    class Solution {
//        List<List<Integer>> res;
//        public List<List<Integer>> threeSum(int[] nums) {
//            return new AbstractList<List<Integer>>() {
//                public List<Integer> get(int i) {init(); return res.get(i);}
//                public int size() {init(); return res.size();}
//                void init() {
//                    if (res != null) return;
//                    Arrays.sort(nums);
//                    res = new ArrayList<>();
//                    int n=nums.length, j=0, k=0, sum=0;
//                    for (int i=0; i<n-2; i++) {
//                        if (i > 0 && nums[i] <= 0 && nums[i] == nums[i-1]) {
//                            continue;
//                        }
//                        if (nums[i] > 0) break;
//                        j=i+1; k=n-1;
//                        while ( j < k ) {
//                            sum = nums[i] + nums[j] + nums[k];
//                            if (sum == 0) {
//                                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                                while (j<k && nums[j] == nums[j+1]) j++;
//                                while (j<k && nums[k] == nums[k-1]) k--;
//                                j++; k--;
//                            } else if (sum < 0){
//                                j++;
//                            } else {
//                                k--;
//                            }
//                        }
//                    }
//                }
//            };
//        }
//    }
//
}
