package OOP_5;

public class car_featuress implements car_features{

    @Override
    public void mediaPlayer(){
        System.out.println("your carStructure.car have media player in built");
    }

    @Override
    public void playerStart(){
        System.out.println("music started");
    }

    @Override
    public void playerStop(){
        System.out.println("music stopped");
    }
}
