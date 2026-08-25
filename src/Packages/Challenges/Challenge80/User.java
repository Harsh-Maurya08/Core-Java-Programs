package Packages.Challenges.Challenge80;

public class User {
    public static void main(String[] args) {
        Book ob = new Book();
        ob.checkout();
        ob.returnItem();
        Magazine mg = new Magazine();
        mg.checkout();
        mg.returnItem();
        DVD dvd = new DVD();
        dvd.checkout();
        dvd.returnItem();
    }
}
