package Car_Structure_project_using_interface_and_class;

public class Car_manufacture {
    public Engine objE;
    public car_feature feature = new featurea();
    Car_manufacture(){
        this.objE = new Pertol();
    }

    Car_manufacture(Engine engine){
        this.objE  = engine;
    }

    void start(){
        objE.start();
    }
    void stop(){
        objE.stop();
    }

    void startMusic(){
        feature.start();
    }

}
