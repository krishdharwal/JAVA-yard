package OOP_experiment;
public class st{
    int number;

    st (){
        this.number = -1;
        System.out.println("object created only one time");
    }
    private static st instance;

    public static st instance2(){
        if(instance == null) {
            instance = new st();

        }
        // else
        return instance;
    }


}

