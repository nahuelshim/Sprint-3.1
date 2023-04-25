package N3Ex1;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle("car");
        Vehicle motorcycle = new Vehicle("motorcycle");
        Vehicle ship = new Vehicle("ship");
        Vehicle airplane = new Vehicle("airplane");

        Start startOperation = new Start(ship);
        Accelerate accelerateOperation = new Accelerate(motorcycle);
        Brake brakeOperation = new Brake(car);
        Start startOperation2 = new Start(airplane);

        Order invoker = new Order();
        invoker.takeOperation(startOperation);
        invoker.takeOperation(accelerateOperation);
        invoker.takeOperation(brakeOperation);
        invoker.takeOperation(startOperation2);

        invoker.startOperations();

    }
}
