package OOP_6;

import java.util.Arrays;

public class Object_cloning implements Cloneable{
    public int age;
    public int[] arr;

    Object_cloning(int age){
        this.age = age;
        arr = new int[]{12,232,21};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object_cloning copy = (Object_cloning) super.clone();
        copy.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy.arr[i] = this.arr[i];
        }
        return copy;
    }
}

class ObjCall{
    public static void main(String[] args) throws CloneNotSupportedException {
        Object_cloning obj1 = new Object_cloning(12);
        Object_cloning obj2 = (Object_cloning) obj1.clone(); // this is shallow coping

        System.out.println(Arrays.toString(obj1.arr));
        System.out.println(Arrays.toString(obj2.arr));

        obj1.arr[0] = 99;
        System.out.println();


        System.out.println(Arrays.toString(obj1.arr));
        System.out.println(Arrays.toString(obj2.arr));
    }
}