package OOP_experiment;

public class singletonAgain {
    public static void main(String[] args) {
        st obj1 = st.instance2();
        st obj2 = st.instance2();
        System.out.println(obj1.number);
        System.out.println(obj2.number);

    }
}

