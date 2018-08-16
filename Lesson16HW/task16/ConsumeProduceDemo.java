package task16;

import java.util.Deque;
import java.util.LinkedList;

public class ConsumeProduceDemo {

    public static void main(String[] args) {
        Deque<Object> integers = new LinkedList<>();
        Thread factory = new Thread(new Factory(integers));
        Thread consumer = new Thread(new Consumer(integers));
        Thread consumer2 = new Thread(new Consumer2(integers));

        factory.start();
        consumer.start();
        consumer2.start();

        factory.setName("фабрика");
        consumer.setName("первый прислужник");
        consumer2.setName("второй прислужник");

        try {
            factory.join();
            consumer.join();
            consumer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
