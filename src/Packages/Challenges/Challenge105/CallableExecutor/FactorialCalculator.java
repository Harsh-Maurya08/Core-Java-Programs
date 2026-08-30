package Packages.Challenges.Challenge105.CallableExecutor;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {

    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        if(number <= 1){
            return 1;
        }

        int result=1 ;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
