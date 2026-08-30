package Packages.Challenges.Challenge103.SingleThreadExecutor;

public class RuunableClass implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }
}
