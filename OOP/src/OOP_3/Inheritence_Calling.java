package OOP_3;

public class Inheritence_Calling {
    public static void main(String[] args) {
        // CASE 1
        // in this child class is creating its object
        Inheritence_2 obj1 = new Inheritence_2(1,3,1,2);
        System.out.println(obj1.h + " " + obj1.l + " " + obj1.w + " " + obj1.scale );

        // CASE 2
        // here parent class have object of child
        // where child know the members of parent but parent doesn't know about child members
        Inheritence_Super obj2 = new Inheritence_2(2,4,2,2);
        // thats why we are able to access the members of parent but not child
 //       System.out.println(obj2.h + " " + obj2.l + " " + obj2.w + " " + obj2.scale );

        //CASE 3
        // int this case child class have object of parent class
        // int this case child know the members of parent but parent class does'nt know about members of child class
        // another example -> that the upper class ( parent ) dose'nt know that lower class ( child ) even exist
//        Inheritence_2 obj3 = new Inheritence_Super();
    }
}
