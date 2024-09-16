package OOP_Revise;

public class call {
   public int code;

   call(){
       super();
       this.code = 0;
   }

    public static void main(String[] args) {
        without_Extend obj = new without_Extend(22);
        System.out.println(obj.age);
    }
}
