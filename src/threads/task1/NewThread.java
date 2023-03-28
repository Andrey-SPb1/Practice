package threads.task1;

public class NewThread extends Thread{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s was called %s times\n", Thread.currentThread().getName(), i + 1);
        }
    }
}
