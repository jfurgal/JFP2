package Order;

import Customer.Customer;
import ShippingAddress.ShippingAddress;

import java.lang.reflect.Constructor;

public class Order {
    private final Constructor orderBy;
    private ShippingAddress destination;
    private Customer orderedBy;

    public Order(ShippingAddress destination, Customer orderedBy){
        super();
        this.destination = destination;
        this.orderBy = orderBy;
    }
    
    public String getDestination(){
        return destination.toString();
    }
    
    public String getOrderBy(){
        return orderBy.toString();
    }
}
