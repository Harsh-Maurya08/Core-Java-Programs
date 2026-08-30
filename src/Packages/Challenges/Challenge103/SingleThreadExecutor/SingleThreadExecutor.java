package Packages.Challenges.Challenge103.SingleThreadExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        RuunableClass task1 = new RuunableClass();
        service.submit(task1);
        service.shutdown();
    }
}
