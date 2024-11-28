  package OOP_6;

// comparable is an pre defined interface which allows us to compare two objects
// we done this by giving generic type of that class
public class Compareable<T extends Comparable> implements Comparable<Compareable>  {
    public int age;
    public float marks;

    Compareable(int age , float marks){
        this.age = age;
        this.marks  = marks;
        
    }

    // this is the part where we compare the objects
    @Override
    public int compareTo(Compareable o) {
        // this wll do
        // when you subtract the value from the given object instance and
        // the compared object instance
        // this will subtract that if it will lesser than "0" means "o.marks" is greater
        // if the value is positive than it will give this.marks greater

//        return (int) (this.marks - o.marks);
        return this.age - o.age;
    }
}
class assemblee{
    public static void main(String[] args) {
        Compareable krish = new Compareable(20,123.2f);
        Compareable shivam = new Compareable(19,129.2f);

        if (krish.compareTo(shivam) < 0){
            System.out.println(krish.compareTo(shivam));
            System.out.println("shivam have more");
        }
        else System.out.println("krish have more");
    }
}
