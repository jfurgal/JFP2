public class MerchandiseItem {
    private ItemType taxibleType;
    private String Name;
    private double price;
    public MerchandiseItem(String Name, double Price, ItemType type)
    {
        this.Name = Name;
        this.price = price;
        this.taxibleType = type;

    }
    public String getName(){
        return Name;

    }
    public double getPrice(){
        return price;

    }
    public ItemType getTaxibleType() {
        return taxibleType;
    }
}
enum ItemType{
    Clothing, WICFood, GeneralMerchandise
}
