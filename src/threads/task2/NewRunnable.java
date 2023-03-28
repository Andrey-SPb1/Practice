package threads.task2;

public class NewRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%10 == 0) {
                System.out.printf
                        ("%s printed the number %s and fell asleep for %d seconds\n",
                                Thread.currentThread().getName(), i, i/10);
                try {
                    Thread.sleep(i * 100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
