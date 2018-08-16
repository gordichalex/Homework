package task16;

import java.util.Deque;
import java.util.LinkedList;

public class Consumer2 implements Runnable {

    private final Deque<Object> deque;
    private Deque<Object> deque3 = new LinkedList<>();
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
                    deque3.add(item1);
                    deque3.add(item2);
                    deque3.add(item3);
                    deque3.add(item4);
                    System.out.println("Детали второго ученого: " + deque3);
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
        System.out.println("Роботов собрано вторым ученым: " + robots);
    }

    private void CreateRobot() {

        if (deque3.contains(Detail.HEAD)) {
            if (deque3.contains(Detail.BODY)) {
                if (deque3.contains(Detail.LEFT_ARM)) {
                    if (deque3.contains(Detail.RIGHT_ARM)) {
                        if (deque3.contains(Detail.LEFT_LEG)) {
                            if (deque3.contains(Detail.RIGHT_LEG)) {
                                if (deque3.contains(Detail.CPU)) {
                                    if (deque3.contains(Detail.HDD)) {
                                        if (deque3.contains(Detail.RAM)) {
                                            deque3.remove(Detail.HEAD);
                                            deque3.remove(Detail.BODY);
                                            deque3.remove(Detail.LEFT_ARM);
                                            deque3.remove(Detail.RIGHT_ARM);
                                            deque3.remove(Detail.LEFT_LEG);
                                            deque3.remove(Detail.RIGHT_LEG);
                                            deque3.remove(Detail.CPU);
                                            deque3.remove(Detail.HDD);
                                            deque3.remove(Detail.RAM);
                                            robots++;
                                            System.out.println("Количество роботов второго ученого :" + robots);
                                            System.out.println("  Второй ученый собрал робота!");
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

    public Consumer2(Deque<Object> deque) {
        this.deque = deque;
    }
}

