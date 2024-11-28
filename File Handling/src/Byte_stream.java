import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Byte_stream {
    public static void main(String[] args) {

        /* editing file */
        try {
            FileWriter A = new FileWriter("name.txt");
            A.write("hello my name is krish dharwal.");
            A.write("hola lenua a");
            A.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        /* read the file */
        try {
            BufferedReader B = new BufferedReader(new FileReader("name.txt"));
            while (B.ready()){
                System.out.print( (char) (B.read()) );
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
