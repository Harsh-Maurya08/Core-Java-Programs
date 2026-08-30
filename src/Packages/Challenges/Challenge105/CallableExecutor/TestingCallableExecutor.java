package Packages.Challenges.Challenge105.CallableExecutor;

import java.util.ArrayList;
import java.util.concurrent.*;

public class TestingCallableExecutor {
    static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        ArrayList<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            FactorialCalculator task = new FactorialCalculator(i);
            FactorialCalculator task1 = new FactorialCalculator((char)i);

            list.add(service.submit(task));
        }

        for (Future<Integer> integerFuture : list) {
            System.out.printf("\nThe factorial is: %d",integerFuture.get());
        }
        service.shutdown();

        if(!service.awaitTermination(10,TimeUnit.SECONDS)){
            System.out.println("Emergency Termination");
            service.shutdownNow();
        }
    }
}
