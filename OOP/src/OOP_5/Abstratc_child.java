package OOP_5;

public class Abstratc_child extends Abstract_method {

    @Override
    void name(String name){
        System.out.println(name + "  hwello");
    }
}

class calkl{
    public static void main(String[] args) {
        // you can also make refrence type of parent
        Abstract_method obj = new Abstratc_child();
        // and also of child
        Abstratc_child obj2 = new Abstratc_child();

        obj.name("krish");
        obj2.name("hole lu ya");
    }
}