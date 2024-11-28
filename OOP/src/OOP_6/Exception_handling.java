package OOP_6;

public class Exception_handling extends Exception {

    Exception_handling(String txt){
        super(txt);
    }
}


class Exception_call{
    public static void main(String[] args) {
        Exception_handling obj = new Exception_handling("hello");

//        try {
//            String name  = "hello";
//            if (name.equals(obj) == "hello"){
//
//            }
//        }

    }
}