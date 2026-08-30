package Packages.Challenges.Challenge101.ThreadJoin;

import Packages.Challenges.Challenge100.ThreadStates.ThreadTask;

public class Main {
    public static void main() throws InterruptedException {
        ThreadJoin t1 = new ThreadJoin(1);
        ThreadJoin t2 = new ThreadJoin(2);
        ThreadJoin t3 = new ThreadJoin(3);

        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println(t1.getState());

        System.out.println(t2.getState());
        t2.start();
        t2.join();
        System.out.println(t2.getState());


        System.out.println(t3.getState());
        t3.start();
        System.out.println(t1.getState());
    }
}
