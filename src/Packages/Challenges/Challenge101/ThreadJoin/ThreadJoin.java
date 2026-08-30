package Packages.Challenges.Challenge101.ThreadJoin;

public class ThreadJoin extends Thread{

    private final int threadNumber;

    public ThreadJoin(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",
                Thread.currentThread().getState(),threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread Ending-%d\n",
                Thread.currentThread().getState(),threadNumber);
    }
}
