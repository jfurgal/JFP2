package comp.comp152;

import Customer.Customer;
import Order.Order;
import ShippingAddress.ShippingAddress;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;
    private Scanner sc;
    List<MerchandiseItem> Stock;
    double revenue = 0;
    public Store(){
        sc = new Scanner(System.in);
        Customers = new ArrayList<Customer>();
        Orders = new ArrayList<Order>();
        List<String> lines = Collections.emptyList();
        try{
            File myObj = new File("Item.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                lines.add(data);
                String[] names = data.split(",");
                String itemName = names[0];
                double price = Double.parseDouble(names[1]);
                ItemType type = ItemType.valueOf(names[2]);
                MerchandiseItem mi = new MerchandiseItem(itemName, price, type);
                Stock.add(mi);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        String[] names = lines.get(0).split("");

        Arrays.asList(names).forEach(custName ->{
            Customers.add(new Customer(custName));

        });
    }

    public void runStore(){

        while(true){
            System.out.println("##############################################");
            System.out.println(" [1] Add Customer");
            System.out.println(" [2] Select Customer");
            System.out.print("Enter your choice : ");
            System.out.print(" [3] collect all outstanding balances");
            System.out.println("###############################################");
            int ch = sc.nextInt();

            switch (ch){
                case 1: addCustomer();
                break;

                case 2: manageCustomer(selectCustomer());
                break;

                case 3: collectBalances();
                break;

                default:
                    System.exit(0);

            }
        }
    }
//collects all outstanding balances from customers
    private void collectBalances() {
        for(int i = 0;i<Customers.size();i++){
            Customer c = Customers.get(i);

        }

    }

    public void manageCustomer(Customer selectCustomer) {
        System.out.println("#################################");
        System.out.println(" [1] Add Address");
        System.out.println(" [2] Make Order");
        System.out.print("Enter your choice :");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                //case 1 adds a new address to the program
                String addressLine1 = "", addressLine2="", city="", state="", postalCode="";
                System.out.println("Enter addressLine1");
                if(sc.hasNext()){
                    sc.next();
                }
                addressLine1 = sc.next();
                System.out.println("Enter addressLine2");
                addressLine2 = sc.next();
                System.out.println("Enter city");
                city = sc.next();
                System.out.println("Enter state");
                state = sc.next();
                System.out.println("Enter postalCode");
                postalCode = sc.next();
                ShippingAddress newAddress = new ShippingAddress(addressLine1, addressLine2, city, state, postalCode);
                selectCustomer.addAddress(newAddress);
                System.out.println("Address added successfully");
                break;

            case 2:
                //below gets address for specific customer and makes an order
                ArrayList<ShippingAddress>Addrs = selectCustomer.getAddresses();
                int i = 0;
                for(ShippingAddress addr : Addrs){
                    System.out.println(i++ +""+addr);
                }
                System.out.print("Enter your choice :");
                int c = sc.nextInt();
                revenue += makeOrder(Addrs.get(c), selectCustomer);
                break;
            default:
                System.exit(0);

        }

    }

    public Customer selectCustomer() {
        int i = 0;
        for(Customer cust : Customers){
            System.out.println(i++ +""+cust.getName());
        }
        System.out.print("Select Customer :");
        int ch = sc.nextInt();
        return Customers.get(ch);
    }

    public void addCustomer() {
        System.out.print("Enter Customer Name :");
        String name = sc.next();
        Customer cust = new Customer(name);
        Customers.add(cust);
    }
//allows customer to select several items for purchase
    public double makeOrder(ShippingAddress address, Customer cust, ArrayList<MerchandiseItem> item){
        Orders.add(new Order(address, cust, item));
        double d = cust.PayForOrder();
        cust.arrangeDelivery();
        return d;
        }



    public static void main(String[] args) {
        Store store = new Store();
        store.runStore();
    }
}




