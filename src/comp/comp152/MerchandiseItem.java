package comp.comp152;

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
    public double getTax(){
        if (taxibleType== ItemType.Clothing){
            if (price<= 175){
                return 0;
            }
            else{
                double diff= price - 175;
                return diff *.0625;
            }
        }
        else if(taxibleType== ItemType.WICFood){
            return 0;
        }
        else if(taxibleType== ItemType.GeneralMerchandise){
            return price *.0625;
        }
    }
    public ItemType getTaxibleType() {
        return taxibleType;
    }
}
enum ItemType{
    Clothing, WICFood, GeneralMerchandise
}
