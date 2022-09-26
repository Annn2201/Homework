
public class Book 
{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public String getName() 
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double p)
    {
        price = p;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int q)
    {
        qty = q;
    }

    public String toString() {
        String str = "Book: " + name + " " + author + " Price = " + price + " Qty = " + qty;
        return str;
    }

    public static void main(String[] args) 
    {
        Author author = new Author("An", "an123@gmail.com", 'm');
        Book book = new Book("tu chuyen", author, 100);
        Book book1 = new Book("tu chuyen", author, 100, 5);
        book1.setQty(5);
        System.out.println("name: " + book.getName());
        System.out.println("qty: "+ book1.getQty());
        System.out.println(book);
        System.out.println(book1);
    }
}
