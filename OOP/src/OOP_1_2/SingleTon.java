package OOP_1_2;

public class SingleTon {
    private SingleTon() {

    }

    private static SingleTon instance;

    public static SingleTon getInstance(){
        // if no object is not created currently
        // then simply make one
        if (instance == null){
            instance = new SingleTon();
        }
        // if object is already created just return that created object
        return instance;
    }
}
