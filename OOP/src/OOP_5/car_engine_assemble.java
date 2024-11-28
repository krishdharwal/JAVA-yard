package OOP_5;

public class car_engine_assemble implements car_engine{

    @Override
    public void startCar() {
        System.out.println("norml engine start");
    }

    @Override
    public void stopCar() {
        System.out.println("normal engine stop");

    }
}

class call {
    public static void main(String[] args) {

        car_engine_assemble car = new car_engine_assemble();
//        carStructure.car.disel();
//        carStructure.car.playerStart();
        car.startCar();
    }
}