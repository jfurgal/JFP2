package Order;

import Customer.Customer;
import ShippingAddress.ShippingAddress;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Order {
    private final Constructor orderBy;
    private ShippingAddress destination;
    private Customer orderedBy;

    private ArrayList<String> carForOrder = new ArrayList<String>();

    public Order(ShippingAddress destination, Customer orderedBy, ArrayList<String> cartForOrder){
        super();
        this.destination = destination;
        this.orderedBy = orderedBy;
        this.carForOrder = cartForOrder;
    }


    public String getDestination(){
        return destination.toString();
    }
    
    public String getOrderBy(){
        return orderBy.toString();
    }



    }

}




