import comp.comp152.MerchandiseItem;

import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{
    public double PayForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        System.out.println("this order will be for this customer and it will be payed with a purchase order");
        double sum = 0;
        for (int i = 0; i < itemsInOrder.size(); i++) {
            MerchandiseItem item = itemsInOrder.get(i);
            sum = sum + item.getPrice();
        }
        return sum;
    }
    public void arrangeDelivery(){
        System.out.println("Name: " + getName() + ". All deliveries must be from 9-5 Mon-Fri");
//shows the tax exempt customers order minus taxes because they are exempt
    }
}
