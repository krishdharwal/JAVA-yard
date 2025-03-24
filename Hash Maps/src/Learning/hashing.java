package Learning;

public class hashing {
    public static void main(String[] args) {
        String A = "krish";
        int hashing_code = A.hashCode() % 10;
        System.out.println("Before Learning.hashing -> " + A.hashCode() + "\n" + " After Learning.hashing -> "+ hashing_code);
    }
}
