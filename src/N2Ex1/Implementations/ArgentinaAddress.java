package N2Ex1.Implementations;

import N2Ex1.Interfaces.Address;

public class ArgentinaAddress implements Address {

    private String country;
    private String zip;

    public ArgentinaAddress() {
        this.country = "Argentina";
        this.zip = "7600";
    }

    @Override
    public String showAddressFormat() {
        return country + " " + "(" + zip + ")";
    }
}