package Packages.Challenges.Challenge102.ThreadSynchronization;

public class Road {
    static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficLight.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficLight.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficLight.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
    }
}
