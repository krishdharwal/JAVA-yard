package OOP_4;
// using protected inside the package
public class Protected_child extends Protected{
    String name;

    Protected_child(int age,String name){
        super(age);
        this.name = name;
    }

    public static void main(String[] args) {
        Protected_child obj = new Protected_child(22,"helkko");
        int a = obj.age;
    }
}
