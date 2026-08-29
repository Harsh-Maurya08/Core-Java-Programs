package Packages.Challenges.Challenge100.ThreadStates;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadTask t1 = new ThreadTask();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(2000);
        System.out.printf("Name-%s and State-%s\n",t1.getName(),t1.getState());


        ThreadTask t2 = new ThreadTask();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        Thread.sleep(3000);
        System.out.printf("Name-%s and State-%s ",t2.getName(),t2.getState());
    }
}
