package OOP_3;

public class hirerical_parent {
    int age;
    static int population = 12121212;

    void human() {
        System.out.println("in parent");
    }

    hirerical_parent(int age) {
        super();
        this.age = age;
    }

    hirerical_parent() {
        this.age = 0;
    }

    hirerical_parent(hirerical_parent obj) {
        this.age = obj.age;
    }
}
