package Packages.Challenges.Challenge99.Thread;

public class ThreadingTask extends Thread{
    @Override
    public void run() {
        String current = Thread.currentThread().getName();
        for(int i=1;i<=10;i++){
            System.out.printf("(%d) Hello from thread %s\n",i,current);
        }
    }

}
