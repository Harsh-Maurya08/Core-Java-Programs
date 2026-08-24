package Packages.Challenges.Challenge77.geometry;
public class Rectangel {
    private final float length;
    private final float breadth;

    public Rectangel(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        if(length<=0){
            System.out.println("Invalid length input...");
        }
        return length;
    }

    public float getBreadth() {
        if(breadth<=0)
            System.out.println("Invalid breadth input");
        return breadth;
    }
}