class Book{
    String author, title, publisher;
    Book(String a, String t, String p)
    {
        author = a;
        title = t;
        publisher = p;
    }
}
class BookInfo extends Book{
    float price;
    int stock_position;
    BookInfo (String a, String t, String p, float amt, int s)
    {
        super (a,t,p);
        price = amt;
        stock_position = s;
    }
    void show ()
    {
        System.out.println("Book Details: ");
        System.out.println("---------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Available: " + stock_position);
        System.out.println("\n");
    }
}

public class day55 {
    public static void main(String[] args){
        BookInfo b1 = new BookInfo("Alchemist", "Series", "P Publications", 6789.54F, 10);
        BookInfo b2 = new BookInfo("Vampire Diaries", "Breeze Series", "R Publications", 2341.09F, 41);
        BookInfo b3 = new BookInfo("Nothing left to lose", "Leave Series", "S Publications", 908.543F, 78);
        b1.show();
        b2.show();
        b3.show();

    }
}
