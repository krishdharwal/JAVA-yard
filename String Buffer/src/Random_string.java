import java.util.Arrays;
import java.util.Random;

public class Random_string {

    public static void generate(int size){
        StringBuffer text = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
           int random_num = (int ) (random.nextFloat() * 26);
            text.append((char)('a' + random_num));
        }
        System.out.println(text);
    }

    public static void main(String[] args) {
//        generate(25);
        String name = "hello my name is krisj";
//       String hi = name.replaceAll("\\s","");
//        System.out.println(hi);

        String[] arr = name.split("\\s");
        System.out.println(Arrays.toString(arr));
    }

}
