package ss18_threading.thuc_hanh;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread thObj = new Thread(r);
        thObj.start();
    }
}
