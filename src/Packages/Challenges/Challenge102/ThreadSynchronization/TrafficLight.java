package Packages.Challenges.Challenge102.ThreadSynchronization;

public enum TrafficLight {
    RED(4000),
    YELLOW(2000),
    GREEN(3000);

     private int timming;

    TrafficLight(int timming) {
        this.timming = timming;
    }

    public int getTimming() {
        return timming;
    }
}
