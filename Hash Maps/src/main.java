import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"krish");
        map.put(2,"sujal");
        map.put(3,"shivam");

        System.out.println(map.keySet() + "  " + map.values());

        System.out.println(map);

    }
}
