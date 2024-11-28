package Car_Structure_project_using_interface_and_class;

public class car_Order {
    public static void main(String[] args) {
        Car_manufacture alto = new Car_manufacture();
        alto.start();
        alto.objE = new Electric();
        alto.start();
        alto.startMusic();

    }
}


//class djd extends Electric{
//    public static void main(String[] args) {
//        Electric obj = new djd();
//        obj.start();
//    }
//
//}
