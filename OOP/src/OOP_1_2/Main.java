package OOP_1_2;

public class Main {
    public static void main(String[] args) {
        student krish = new student(12,"krish dharwal",7.55f);
        System.out.println(krish.age + krish.name );
        System.out.println(krish.height);
    }
}
    class student{
        int age;
        String name;
        float height;

        student(){
            this (0,"default",00.0f);
        }

        student(int age,String name ,float height){
            this.age = age;
            this.name = name;
            this.height = height;
        }
    }

