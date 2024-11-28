// hash code is an simple code consist of integer values (unique)
// and by some internal implementation of formula hashcode give us value
// which the code represents the object
// by code hashmap can able to get the object in constant time O(1);


public class hash_code {
    public static void main(String[] args) {
        String name = "krish";
        int hashcode = name.hashCode();
        System.out.println(hashcode);
    }
}
