package Car_Structure_project_using_interface_and_class.car;

// Enging <- Brake <- Media
// we can access all the Enging abstract classes by using Media

public interface Engine {

    static final int PRICE = 78000;

    void start();
    void stop();
}
