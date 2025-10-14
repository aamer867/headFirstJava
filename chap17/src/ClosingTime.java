import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(new LongJob("Long Job", 15000));
        threadPool.execute(() -> System.out.println("FU"));
        threadPool.shutdown();

        try {
            boolean finished = threadPool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Finished? " + finished);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        threadPool.shutdownNow();
    }
}
