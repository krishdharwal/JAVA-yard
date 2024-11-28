package OOP_6;

public class Lambda_functions {
    public int operation(int a, int b, lambda op) {
        return op.operation(a,b);
    }

    public static void main(String[] args) {

        lambda sum = (a , b) -> a + b;
        lambda sub = (a  , b) -> a - b;
        lambda div = (a , b) -> a / b;

        Lambda_functions obj = new Lambda_functions();
       int ans = obj.operation(12,22,sum);
        System.out.println(ans);
    }
}


// when we do this like making more classes or interfaces
// there is no need for implements and extends
interface lambda{
     int operation(int a,int b);
}