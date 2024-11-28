package OOP_5;

import static OOP_5.INterface_call.greet;

// to merge interfaces we use " inplements "
// merge classes we use " extends "
public class INterface_call implements interfacee , interface_child1 ,interfasce_child2{

    static  int name;

    static void greet(){
        System.out.println("hello motherfuvekmr");
    }
    @Override
    public String  name(String name){
    return name;
    }

    public void room(int room )
    {
        System.out.println(room);
    }

    public void rollno(int rno){
        System.out.println(rno);
    }

    public void planet(String planet){
        System.out.println(planet);
    }

}


   class Main{
     public static void main(String[] args) {
         INterface_call.name  = 99;
         System.out.println(INterface_call.name);

         INterface_call obj = new INterface_call();
         System.out.println(obj.name("jelle"));
         obj.planet("pluto");
         obj.room(99);
         obj.rollno(121212);

         greet();
     }

}

// ? why i put public in the methods
// why i am not able to put access modifier in 2nd class