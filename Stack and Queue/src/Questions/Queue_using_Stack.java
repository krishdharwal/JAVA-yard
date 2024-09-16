package Questions;
import java.util.Stack;

//Q -> Make Stacks working as a Queue using only PEAK , POP , PUSH , REMOVE ?

public class Queue_using_Stack{

    private Stack<Integer> first;
    private Stack<Integer> second;

    public Queue_using_Stack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    // adding efficient
    public void add(int data){
        first.push(data);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }


    // removing efficient
    public int remove2(){
        int removed = first.pop();
        return removed;
    }

    public void add2(int data){
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(data);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int peek(){
        return first.peek();
    }

    private void display() {
        System.out.println(first);

    }

    public static void main(String[] args) {
        Queue_using_Stack obj = new Queue_using_Stack();
//        obj.add(1);
//        obj.add(2);
//        obj.add(3);
//        obj.remove();

        obj.add2(1);
        obj.add2(2);
        obj.add2(3);
        System.out.println( obj.peek());
        obj.remove2();

        obj.display();
    }


}
