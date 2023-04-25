package N3Ex1;

public class Brake implements Operation {
    private Vehicle vehicle;

    public Brake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
