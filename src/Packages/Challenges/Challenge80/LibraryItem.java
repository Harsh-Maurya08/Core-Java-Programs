package Packages.Challenges.Challenge80;

public class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("checkout");
    }

    public void returnItem(){
        System.out.println("returned");
    }
}
