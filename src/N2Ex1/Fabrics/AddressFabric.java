package N2Ex1.Fabrics;

import N2Ex1.Implementations.ArgentinaAddress;
import N2Ex1.Implementations.SpainAddress;
import N2Ex1.Interfaces.AbstractFactory;
import N2Ex1.Interfaces.Address;
import N2Ex1.Interfaces.Phone;

public class AddressFabric implements AbstractFactory {

    @Override
    public Phone getPhone(String phone) {
        return null;
    }

    @Override
    public Address getAddress(String address) {

        if(address == null) {
            System.out.println("Error not found");
        }
        if(address.equalsIgnoreCase("Argentina")) {
            return new ArgentinaAddress();
        }else if (address.equalsIgnoreCase("Spain")) {
            return new SpainAddress();
        }

        return null;
    }

}