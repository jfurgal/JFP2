import Customer.Customer;
import comp.comp152.MerchandiseItem;

import java.util.ArrayList;

public class ResidentialCustomer extends Customer {
    public double PayForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        System.out.println("this order will be for this customer and it will be payed with a purchase order");
        double sum = 0 ;
        double tax=0;
        for(int i = 0;i<itemsInOrder.size();i++){
            MerchandiseItem item = itemsInOrder.get(i);
            sum = sum + item.getPrice();
            tax = tax + item.getTax();
        }
        return sum + tax;
    }
//shows the residential customers order including total fees plus taxes
}
