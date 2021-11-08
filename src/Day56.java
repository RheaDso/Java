class Customer
{
    String Name;
    String PhoneNumber;

    public Customer(String name, String PN)
    {
        Name = name;
        PhoneNumber = PN;
    }
    public void Display()
    {
        System.out.println("Customer Name: "+Name+"\nCustomer Contact Number: "+PhoneNumber);
    }
}
class Cart extends Customer
{
    String Items;
    String Cost;

    public Cart(String name, String PN, String items, String cost)
    {
        super(name, PN);
        Items = items;
        Cost = cost;
    }
    public void Display(){
        System.out.println("\nShopping Cart Details: ");
        System.out.println("------------------------");
        super.Display();
        System.out.println("Items: "+Items+"\nCost= "+Cost);
    }
}

public class Day56 {

    public static void main(String[] args) {
        Customer c = new Customer("Rhea", "9876896541");
        System.out.println("\nCustomer Details: ");
        System.out.println("------------------");
        c.Display();
        Cart c1 = new Cart("Rhea", "9876896541", "Icecream", "90");
        c1.Display();
    }
}
