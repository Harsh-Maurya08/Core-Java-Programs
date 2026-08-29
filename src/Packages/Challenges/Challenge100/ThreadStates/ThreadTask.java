package Packages.Challenges.Challenge100.ThreadStates;

public class ThreadTask extends Thread {
    @Override
    public void run() {
        System.out.printf("Thread inside %s", getState());
    }
}
