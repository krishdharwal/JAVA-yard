package OOP_experiment;

public class Staticc_2 {
    static int a = 12;
    static int b;

   static class person{
        String p1;
        person(String p1){
            this.p1 = p1;
        }
    }

    public static void main(String[] args) {
        b  = 21;
//        System.out.println(b);

        person krish = new person("krish");
        person kd = new person("kd");

        System.out.println(krish.p1 + " " + kd.p1);
    }
}
