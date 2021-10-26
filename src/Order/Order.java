package Order;
import comp.comp152.MerchandiseItem;
import Customer.Customer;
import ShippingAddress.ShippingAddress;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Order {
    //private final Constructor orderBy;
    private ShippingAddress destination;
    private Customer orderedBy;

    private ArrayList<MerchandiseItem> cartForOrder = new ArrayList<MerchandiseItem>();

    public Order(ShippingAddress destination, Customer orderedBy, ArrayList<MerchandiseItem> cartForOrder){
        super();
        this.destination = destination;
        this.orderedBy = orderedBy;
        this.cartForOrder = cartForOrder;
    }


    public String getDestination(){
        return destination.toString();
    }
    
    public String getOrderBy(){
        //return orderBy.toString();
        return "";
    }



    }






