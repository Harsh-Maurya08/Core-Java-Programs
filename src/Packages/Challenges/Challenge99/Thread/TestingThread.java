package Packages.Challenges.Challenge99.Thread;

public class TestingThread{
    public static void main(String[] args) throws InterruptedException {
        ThreadingTask t1 = new ThreadingTask();
        ThreadingTask t2 = new ThreadingTask();
        t1.start();
        t2.start();
    }
}
