package threads.task4;

import java.util.*;

public class Philosopher extends Thread{

    private final String name;
    private final String food;

    private static final Deque<Fork> forks = new ArrayDeque<>(List.of(Fork.values()));

    public Philosopher(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public void run() {
        while(true) {
            synchronized (forks) {
                if (forks.size() >= 2) {
                    Fork forkLeft = forks.pop();
                    Fork forkRight = forks.pop();
                    System.out.printf("%s takes %s and %s then starts eating %s\n",
                            name, forkLeft.getName(), forkRight.getName(), food);
                    try {
                        forks.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    forks.add(forkLeft);
                    forks.add(forkRight);
                    System.out.printf("%s ate and put down the forks\n", name);
                    try {
                        forks.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.printf("%s meditates\n", name);
                    try {
                        forks.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
