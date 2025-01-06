// Apartment class
public class Apartment extends Residential {
    private int rooms;

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms < 1) {
            throw new IllegalArgumentException("Rooms must be at least 1.");
        }
        this.rooms = rooms;
    }

    @Override
    public void taxIt() {
        System.out.println("Tax to be paid: $" + getPrice() * 0.08);
    }

    @Override
    public String toString() {
        return "Apartment: " + super.toString() + ", Rooms: " + rooms;
    }
}
