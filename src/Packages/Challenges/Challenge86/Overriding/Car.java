package Packages.Challenges.Challenge86.Overriding;

public class Car extends Vehicle {

    public void service(){
        super.service();
        System.out.printf("Your car need servicing total running distance is %d",super.TotalKm);
    }
    public static void main(String[] args){
        Vehicle veh  = new Vehicle();
        Car car = new Car();
        veh.service();
        car.service();
    }
}
