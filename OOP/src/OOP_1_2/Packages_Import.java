package OOP_1_2;

import OOP_1_2.A;

import static OOP_experiment.Import.message;

public class Packages_Import {
    public static void main(String[] args) {

        //  if the class is in the same package you can access it easily
        A num1 = new A(11);
        System.out.println(num1.num);

     message();
    }
}
