package Customer;
package ShippingAddress;

import java.util.ArrayList;
import comp.comp152.MerchandiseItem;
import ShippingAddress.ShippingAddress;

public abstract class Customer {
    private static int count = 0;
    private ArrayList<ShippingAddress> Addresses;
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
    public abstract double PayForOrder(ArrayList<MerchandiseItem> itemsInOrder);
    public double payOutstandingBalance(){
        return 0.0;
    }
    public void arrangeDelivery(){
        System.out.println(Name + " deliver any time");

    }

    public abstract double PayForOrder();
}
