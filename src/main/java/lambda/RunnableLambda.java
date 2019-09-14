package lambda;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(String.format("HelloWorld%d - %s", i, Thread.currentThread().getName()));
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread.start();
        thread.join();
        thread1.start();
    }
}
