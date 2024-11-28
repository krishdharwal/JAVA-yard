package OOP_6;
// lambda expression are used in single method of the class
// in lambda expression we simply do
// object refrence = (argument) -> (statement);


 class doing {

    public static void main(String[] args) {
        // single method
        lambda_expression obj = (name) -> System.out.println("hello " + name);
        obj.greet("krish");

        // multiple methods
        lambda_expression obj2 = (name) -> {
            System.out.println("oh yeH");
            System.out.println("motherfucking cold cuts");
            System.out.println("you gonna do it david");
            System.out.println(name);
        };

        obj2.greet("krish");
    }
}

public interface lambda_expression {
    void greet(String name);
}