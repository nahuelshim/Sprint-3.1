package N3Ex1;

public class Vehicle {

    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void start () {
        System.out.println("The " + type + " is starting");
    }

    public void accelerate () {
        System.out.println("The " + type + " is accelerating");
    }

    public void brake () {
        System.out.println("The " + type + " is breaking");
    }
}
