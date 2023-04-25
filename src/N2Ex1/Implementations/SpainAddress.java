package N2Ex1.Implementations;

import N2Ex1.Interfaces.Address;

public class SpainAddress implements Address {

    private String country;
    private String zip;

    public SpainAddress() {
        this.country = "Spain";
        this.zip = "08016";
    }

    @Override
    public String showAddressFormat() {
        return country + " " + "(" +  zip + ")" ;
    }
}
