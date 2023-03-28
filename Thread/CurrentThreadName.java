package Thread;

public class CurrentThreadName extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CurrentThreadName obj1 = new CurrentThreadName();
        CurrentThreadName obj2 = new CurrentThreadName();
        obj1.start();
        obj2.start();
    }
}
