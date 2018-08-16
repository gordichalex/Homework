package task16;

import java.util.Deque;
import java.util.LinkedList;

public class Consumer implements Runnable {

    private final Deque<Object> deque;
    private Deque<Object> deque2 = new LinkedList<>();
    private int robots = 0;

    @Override
    public void run() {
        synchronized (deque) {
            for (int i = 0; i < 100; i++) {
                if (!deque.isEmpty()) {
                    Object item1 = deque.remove();
                    Object item2 = deque.remove();
                    Object item3 = deque.remove();
                    Object item4 = deque.remove();
                    System.out.println(Thread.currentThread().getName() + " получил  " + item1 + " " + item2 + " " + item3 + " " + item4);
                    deque2.add(item1);
                    deque2.add(item2);
                    deque2.add(item3);
                    deque2.add(item4);
                    System.out.println("Детали первого ученого: " + deque2);
                    CreateRobot();
                    System.out.println("Количество элементов на свалке: " + deque.size());
                }
                try {
                    deque.wait(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Роботов собрано первым ученым: " + robots);
    }

    private void CreateRobot() {

        if (deque2.contains(Detail.HEAD)) {
            if (deque2.contains(Detail.BODY)) {
                if (deque2.contains(Detail.LEFT_ARM)) {
                    if (deque2.contains(Detail.RIGHT_ARM)) {
                        if (deque2.contains(Detail.LEFT_LEG)) {
                            if (deque2.contains(Detail.RIGHT_LEG)) {
                                if (deque2.contains(Detail.CPU)) {
                                    if (deque2.contains(Detail.HDD)) {
                                        if (deque2.contains(Detail.RAM)) {

                                            deque2.remove(Detail.HEAD);
                                            deque2.remove(Detail.BODY);
                                            deque2.remove(Detail.LEFT_ARM);
                                            deque2.remove(Detail.RIGHT_ARM);
                                            deque2.remove(Detail.LEFT_LEG);
                                            deque2.remove(Detail.RIGHT_LEG);
                                            deque2.remove(Detail.CPU);
                                            deque2.remove(Detail.HDD);
                                            deque2.remove(Detail.RAM);
                                            robots++;
                                            System.out.println("Количество роботов первого ученого :" + robots);
                                            System.out.println("  Первый ученый собрал робота!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public Consumer(Deque<Object> deque) {
        this.deque = deque;
    }
}















