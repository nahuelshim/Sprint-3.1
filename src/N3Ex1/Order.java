package N3Ex1;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Operation> operationList = new ArrayList<Operation>();

    public void takeOperation (Operation operation) {
        operationList.add(operation);
    }

    public void startOperations () {
        for (Operation operation: operationList) {
            operation.execute();
        }
        operationList.clear();
    }
}
