package Packages.Challenges.Challenge104.FixedThreadExecutor;

public class ThreadTask implements Runnable{
    @Override
    public void run() {
        System.out.printf("Name :- %s\n",Thread.currentThread().getName());
        try {
            Thread.sleep(randomNum()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static  int randomNum(){
        return (int)(Math.random()*5+1);
    }
}
