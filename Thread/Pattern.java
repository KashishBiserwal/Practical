package Thread;

public class Pattern extends Thread {
    public void run(){
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Pattern t1 = new Pattern();
        Pattern t2 = new Pattern();
        Pattern t3 = new Pattern();

        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
