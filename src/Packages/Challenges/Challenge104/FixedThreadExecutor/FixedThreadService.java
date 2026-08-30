package Packages.Challenges.Challenge104.FixedThreadExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadService {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(2)){
            ThreadTask task = new ThreadTask();
            for (int i = 0; i < 10; i++) {
                service.submit(task);
            }
            service.shutdown();

            if(!service.awaitTermination(30, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
