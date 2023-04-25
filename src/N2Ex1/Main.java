package N2Ex1;

import N2Ex1.Fabrics.FabricProducer;
import N2Ex1.Interfaces.AbstractFactory;
import N2Ex1.Interfaces.Address;
import N2Ex1.Interfaces.Phone;

public class Main {

    public static void main(String[] args) {

    AbstractFactory abstractFactory = FabricProducer.getFactory("phone");
    Phone personalPhone = abstractFactory.getPhone("Argentina");

    AbstractFactory abstractFactory1 = FabricProducer.getFactory("address");
    Address personalAddress = abstractFactory1.getAddress("Argentina");

    String name = "Susana Gimenez";
    String address = "Ayacucho 3474 Mar del Plata";
    String country = "Argentina";
    String phone = "156-867287";

	System.out.println("Name: " + name + "\nAddress: " + address  + ", " + personalAddress.showAddressFormat()
            + "\nPhone: " + personalPhone.showPhoneFormat() + phone);
    }
}

