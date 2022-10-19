package ad211.dovbyshev;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;
    private int amount;

    public Book (String title, String author, int year, double price, int amount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.amount = amount;
    }

    public int newAmountValue(int amount) {
        this.amount = amount;
        return amount;
    }

    public double newPrice(int amount) {
        this.price = amount * price;
        return price;
    }

    public double getPriceOffAll() {
        return price;
    }
}
