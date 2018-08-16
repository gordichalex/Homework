package task16;

import java.util.Deque;

import static task16.RandomUtil.generate;

public class Factory implements Runnable {
    private final Deque<Object> deque;
    private static int detailsStart = 20;

    @Override
    public void run() {
        StartDetails();
        for (int i = 0; i < 100; i++) {
            synchronized (deque) {
                deque.add(generate());
                deque.add(generate());
                deque.add(generate());
                deque.add(generate());
                System.out.println(Thread.currentThread().getName() + " выбросила на свалку детали");
                System.out.println("Количество элементов на свалке: " + deque.size());
                System.out.println("Элементы на свалке: " + deque);
                try {
                    deque.wait(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void StartDetails() {
        for (int i = 0; i < detailsStart; i++) {
            deque.add(generate());
        }
    }

    public Factory(Deque<Object> deque) {
        this.deque = deque;
    }
}