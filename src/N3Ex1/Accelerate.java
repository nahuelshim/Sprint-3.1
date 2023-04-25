package N3Ex1;

public class Accelerate implements Operation {
    private Vehicle vehicle;

    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
