public class Thread_impl extends Thread {

    @Override
    public void run() {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread_impl thread_1= new Thread_impl();
        thread_1.start();

    }
}
