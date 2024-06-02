package june.multithreading;

public class TH03 {
    //Task 1 - Go from 1 to 5 - WorkerTh03 will serve the purpose
    //Task 2 - Go from 1 to 100 - need to create another class
    public static void main(String[] args) {

        ThreadGroup threadGroup =  new ThreadGroup("Workers");

        WorkerTh03 w1 = new WorkerTh03(threadGroup,"W1");
        w1.start();

        WorkerTh03 w2 = new WorkerTh03(threadGroup,"W2");
        w2.start();

        //Thread by main
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

//Thread by Class

class WorkerTh03 extends Thread {
    public WorkerTh03(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}