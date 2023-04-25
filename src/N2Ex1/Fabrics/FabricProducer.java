package N2Ex1.Fabrics;

import N2Ex1.Interfaces.AbstractFactory;

public class FabricProducer {

    public static AbstractFactory getFactory(String type) {

        if (type.equalsIgnoreCase("phone")) {
            return new PhoneFabric();

        } else if (type.equalsIgnoreCase("address")) {
            return new AddressFabric();
        }
        return null;
    }
}