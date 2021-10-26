package Customer;

import ItemForSale.ItemForSale;
import comp.comp152.MerchandiseItem;
import java.util.ArrayList;
import javax.naming.Name;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;
    public double PayForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        System.out.println("this order will be for this customer and it will be payed with a purchase order");
        double sum = 0 ;
        double tax=0;
        for(int i = 0;i<itemsInOrder.size();i++){
            MerchandiseItem item = itemsInOrder.get(i);
            sum = sum + item.getPrice();
            tax = tax + item.getTax();
        }
        purchaseOrderBalance = sum + tax;
        return 0;

//class was made to add a business customer including taxes in their order
    }
    public double payOutstandingBalance(){
        double discount = 0;
        if (purchaseOrderBalance > 1000){
            discount = purchaseOrderBalance * .05;
//includes 5% discount on their order total and returns total after discount
        }
        double total = purchaseOrderBalance - discount;
        purchaseOrderBalance = 0;
        return total;
    }
    public void arrangeDelivery(){
        System.out.println("Name: " + getName() + ". All deliveries must be from 9-5 Mon-Fri");

    }
}
