package N2Ex1.Fabrics;

import N2Ex1.Implementations.ArgentinaPhone;
import N2Ex1.Implementations.SpainPhone;
import N2Ex1.Interfaces.AbstractFactory;
import N2Ex1.Interfaces.Address;
import N2Ex1.Interfaces.Phone;

public class PhoneFabric implements AbstractFactory {

    @Override
    public Phone getPhone(String phone) {

        if(phone == null) {
            System.out.println("no country data input");
        }

        if(phone.equalsIgnoreCase("Argentina")) {
            return new ArgentinaPhone();
        }else if(phone.equalsIgnoreCase("Spain")) {
            return new SpainPhone();
        }

        return null;
    }

    @Override
    public Address getAddress(String address) {
        return null;
    }

}