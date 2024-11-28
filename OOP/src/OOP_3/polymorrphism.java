package OOP_3;

public class polymorrphism {
        // means many way to represent a constructor or method


    // the first type is method overloading
    // in this we have created methods and they will simply do Addition but in different ways
    // and this is known as method overloading
    int a;
    int b;
    String s1;
    String s2;

    public int add(int a,int b){
        return a + b;
    }

    public String add(String a,String b){
        return a + b;
    }

    public String add(int a, String b){
        return a + b;
    }


}
