public class Invoice 
{
    private int id;
    private Customer Customer;
    private double amount;

    public Invoice(int id, Customer Customer, double amount)
    {
        this.id = id;
        this.Customer = Customer;
        this.amount = amount;
    }

    public int getID()
    {
        return id;
    }

    public Customer getCustomer()
    {
        return Customer;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public int getCustomerID()
    {
        return Customer.getID();
    }

    public String getCustomerName()
    {
        return Customer.getName();
    }

    public int getCustomerDiscount()
    {
        return Customer.getDiscount();
    }

    public double getAmountAfterDiscount()
    {
        double price = amount-(amount * Customer.getDiscount() / 100);
        return price;
    }

    public String toString()
    {
        String str = "Invoice [id = " + id + " customer = " + Customer + " amount = " + amount + "]";
        return str;
    }

    public static void main(String[] args) 
    {
        Customer cus = new Customer(88, "An", 10);
        System.out.println(cus);
        System.out.println("id is: " + cus.getID());
        System.out.println("name is " + cus.getName());
        Invoice inv = new Invoice(101, cus, 888.8);
        System.out.println(inv);
        inv.setAmount(999.9);
        System.out.println(inv);
        System.out.println("id is: " + inv.getID()); 
        System.out.println("customer is: " + inv.getCustomerName()); 
        System.out.println("amount is: " + inv.getAmount());  
        System.out.println("customer's id is: " + inv.getCustomerID());
        System.out.println("customer's name is: " + inv.getCustomerName());
        System.out.println("customer's discount is: " + inv.getCustomerDiscount());
        System.out.println("amount after discount is: " + inv.getAmountAfterDiscount());       
    }

}
