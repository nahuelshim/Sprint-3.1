package N1Ex1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private static List <String> orders = new ArrayList<>();

    private Undo () {

    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder (String order) {
        orders.add(order);
    }

    public void deleteOrder (String order) {
        if (orders.contains(order)) {
            orders.remove(order);
        }
        else {
            System.out.println("Order not found");
        }
    }

    public void readList () {

        for (String order: orders) {
            System.out.println (order);
        }
    }
}
