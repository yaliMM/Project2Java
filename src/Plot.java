// Plot class
public class Plot extends Property {
    public enum Type {
        URBAN, AGRICULTURAL, INDUSTRIAL
    }

    private Type type;

    public Plot(String address, double area, double price, Type type) {
        super(address, area, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void taxIt() {
        double taxRate = switch (type) {
            case URBAN -> 0.10;
            case AGRICULTURAL -> 0.02;
            case INDUSTRIAL -> 0.05;
        };
        double tax = getPrice() * taxRate;
        System.out.println("Tax to be paid: $" + tax);
    }

    @Override
    public String toString() {
        return "Plot Type: " + type + ", " + super.toString();
    }
}
