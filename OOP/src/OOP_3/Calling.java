package OOP_3;

public class Calling {
    public static void main(String[] args) {
//        // for multilevel
//        multival_3 obj1 = new multival_3(12,"krish",7.8f);
//        System.out.println(obj1.age + " " + obj1.name + " " + obj1.cgpa);
//        greet();
//
//        // for hirerical structure
//        hirerical_child1 obj2 = new hirerical_child1(12,"arav");
//        hirerical_child2 obj3 = new hirerical_child2(8,"visa");
//        System.out.println(obj2.name + " " + obj3.name + " " + hirerical_parent.population);

//
//       overriding obj = new override_2();
//        obj.overridee();

        hirerical_parent obj3 = new hirerical_child1();
        obj3.human();

        int a = 12;
        String b = "hello";
//        System.out.println(a + b);

        System.out.println(obj3.toString());

        // doing method overloading
        polymorrphism obj6 = new polymorrphism();
        // this demonstrating how we are using same refrence and using it in different methods
        // and getting different outputs as we have given
        System.out.println(obj6.add(3,3));
        System.out.println(obj6.add("krish " , "dharwal"));
        System.out.println(obj6.add(3,"hello"));

    }
    public String addy(int a, String b){
        return a + b;
    }
}
