package threads.task3;

public class NewThread extends Thread {

    final StringBuilder stringBuilder;

    public NewThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder);
                stringBuilder.append(1);
            }
        }
    }

}
