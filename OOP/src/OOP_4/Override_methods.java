package OOP_4;
public class Override_methods {
    public Override_methods() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // toString means the string representation of an object
    @Override
    public String toString() {
        return super.toString();
    }

    // finalize means to perform some function at the time of garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

class implementing {
    public static void main(String[] args) {
        Override_methods obj = new Override_methods();
        Override_methods obj2 = new Override_methods();


        // hashcode is just an unique identifier of the object in java ,
        // by the way its not an address
//        System.out.println(obj.hashCode());
        System.out.println(obj.toString());

        // the equals method check the hashcode of the given objects and then give the bool result
        System.out.println(obj.equals(obj2));


    }
}