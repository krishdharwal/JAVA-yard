package Car_Structure_project_using_interface_and_class.car;

public class NiceCar {
    private Media engine;

    public NiceCar(Media engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        engine.startM();
    }

    public void stopMusic() {
      engine.stopM();
    }

    public void breakk(){
        engine.brake();
    }



}

class call{
    public static void main(String[] args) {
        NiceCar alto = new NiceCar(new PowerEngine());
        alto.start();
        alto.startMusic();
        alto.breakk();
        alto.stop();

        System.out.println();

        NiceCar tataEVo = new NiceCar(new ElecticEngine());
        tataEVo.start();
        tataEVo.startMusic();
        tataEVo.breakk();
        tataEVo.stop();

        
    }
}