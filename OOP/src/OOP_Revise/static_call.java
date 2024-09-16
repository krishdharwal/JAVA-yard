package OOP_Revise;

public class static_call {
    public static int age = 9;
    public int room;

    static_call(){
        this.room = 0;
    }

    static_call(int room){
        this.room = room;
    }

public static void main(String[] args) {
    // we can use static's variable's in static without making their object
    // we can access them via -- class name (dot) instance --
    System.out.println(static_call.age);

    // to access non static we c=have to make theirt objects
    static_call obj = new static_call(22);
    System.out.println(obj.room);
}
}
