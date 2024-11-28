public class findasds {
        public static void main(String[] args) {
//            int[] arr = {12,33,45,66,78,99,100};
            int[] arr2 = { 90,87,65,43,32,21,11};

            int tar = 21;
            System.out.println(cla(arr2,tar));
        }
        static int cla(int[] arr,int tar){
            int start = 0;
            int end = arr.length -1;

            boolean asc = arr[start] < arr[end];

            int mid;
            while(start <= end){
                mid = start + (start - end) / 2;

                if(arr[mid] == tar){
                    return mid;
                }
                if(asc){
                    if(tar < arr[mid]){
                        end = mid -1;
                    }
                    else{
                        start = mid + 1;
                    }

                }
                else {

                    if (tar > arr[mid])
                    {
                        end = mid -1;

                    }
                    else {
                        start = mid + 1;
                    }

                }
            }
            return -1;
        }
    }

