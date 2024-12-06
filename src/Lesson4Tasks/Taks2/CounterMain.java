package Lesson4Tasks.Taks2;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println(Counter.getInstanceCount());

        Counter counter2 = new Counter();
        System.out.println(Counter.getInstanceCount());

        Counter counter3 = new Counter();
        System.out.println(Counter.getInstanceCount());
    }
}
