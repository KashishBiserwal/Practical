package Thread;

/*public class RunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread running...");
    }

    public static void main(String[] args) {
        RunnableInterface r = new RunnableInterface();
        Thread t = new Thread(r);
        t.start();
    }
}*/

public class RunnableInterface implements Runnable{
    public void run(){
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        Runnable r = new RunnableInterface();
        Thread t = new Thread(r, "Krish");
        t.start();
        String s = t.getName();
        System.out.println(s);
    }
}

