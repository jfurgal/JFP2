package Customer;
import.java.util.ArrayList;


public class Customer {
    private static int count = 0;
    private ArrayList<ShippingAddress>Addresses;
    private String Name;
    private int customerID;
//ties customer ID, address and customer name together
    public Customer(String name) {
        Name = name;
        Addresses = new ArrayList<ShippingAddress>();
        customerID = count++;
    }
    public String getName() {
        return Name;
    }
    public void addAddress(ShippingAddress newAddress){
        Addresses.add(newAddress);
    }
    @Override
    public String toString(){
        return "Customers [Addresses=" + Addresses +",Name=" + Name +"customerID=" + customerID +"]";

    }
}
