package Car_Structure_project_using_interface_and_class.car;

public class Main {
    public static void main(String[] args) {
//        Engine carStructure.car = new Car();
//        carStructure.car.a;
//        carStructure.car.acc();
//        carStructure.car.start();
//        carStructure.car.stop();
//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar car = new NiceCar(new ElecticEngine());

        car.start();
        car.startMusic();
        car.start();
    }
}
