// Abstract Property class
public abstract class Property {
    private String address;
    private double area;
    private double price;

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty() || address.split(" ").length < 2) {
            throw new IllegalArgumentException("Address must contain at least two words and cannot be null or empty.");
        }
        this.address = address;
    }

    public void setArea(double area) {
        if (area < 0) {
            throw new IllegalArgumentException("Area cannot be negative.");
        }
        this.area = area;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public abstract void taxIt();

    @Override
    public String toString() {
        return "Address: " + address + ", Area: " + area + " sqm, Price: $" + price;
    }
}
