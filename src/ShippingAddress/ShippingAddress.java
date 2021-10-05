package ShippingAddress;

public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;

    public ShippingAddress(String addressLine1, String addressLine2, String city, String state, String postalCode) {
        AddressLine1 = addressLine1;
        AddressLine2 = addressLine2;
        City = city;
        State = state;
        PostalCode = postalCode;
    }

    @Override
    public String toString(){
        return "ShippingAddress [AddressLine1=" + AddressLine1 +",AddressLine2=" +AddressLine2 +",City=" + City +",State=" +State+", PostalCode=" + PostalCode+"]";
    }
}
