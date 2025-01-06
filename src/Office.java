// Office class
public class Office extends Property {

    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public void taxIt() {
        System.out.println("Tax to be paid: $" + getPrice() * 0.05);
    }

    @Override
    public String toString() {
        return "Office: " + super.toString();
    }
}
