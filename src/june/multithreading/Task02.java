package june.multithreading;

public class Task02 {

    public static void main(String[] args) throws InterruptedException {

        //Thread is a class which implements Runnable interface
        Thread t = Thread.currentThread();
        //currentThread() - is a native method i.e. it is not called from java but some another language e.g.C++
        System.out.println(t);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + t.getName());
            System.out.println(i + " - " + t.getPriority());
            Thread.sleep(5000);
        }
    }
}
