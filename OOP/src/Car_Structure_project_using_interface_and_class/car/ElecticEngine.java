package Car_Structure_project_using_interface_and_class.car;

public class ElecticEngine implements Media{

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void brake() {
        System.out.println("brake hitted in electric");

    }


    @Override
    public void startM() {
        System.out.println("Music start");
    }

    @Override
    public void stopM() {
        System.out.println("Music stop");
    }
}
