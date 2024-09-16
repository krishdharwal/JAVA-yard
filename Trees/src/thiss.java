public class thiss {
    public int data;

    thiss(int data){
        this.data = data;
    }

    public int print(int daata){

        // some similar things

//        this.print(990);
//       return print(33);


//       return this.print(2,"hello");
        return print(2,"hello");
    }

    public int print(int data,String s){
       return this.print(12);
    }

    public static void main(String[] args) {
        thiss obj = new thiss(0);
        obj.print(11);
    }
}
