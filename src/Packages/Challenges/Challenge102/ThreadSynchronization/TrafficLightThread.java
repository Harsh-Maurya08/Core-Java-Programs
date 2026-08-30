package Packages.Challenges.Challenge102.ThreadSynchronization;

public class TrafficLightThread extends Thread{
    final TrafficLight color;

    public TrafficLightThread(TrafficLight color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active signal\n",color);
        try {
            Thread.sleep(color.getTimming());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s inactive signal\n",color);
    }
}
