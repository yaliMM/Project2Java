// Villa class
public class Villa extends Residential {
    private int levels;

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if (levels < 1) {
            throw new IllegalArgumentException("Levels must be at least 1.");
        }
        this.levels = levels;
    }

    @Override
    public void taxIt() {
        System.out.println("Tax to be paid: $" + getPrice() * 0.08);
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() + ", Levels: " + levels;
    }
}
