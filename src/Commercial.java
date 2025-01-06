// Commercial class
public class Commercial extends Property {
    private boolean storeroom;
    private double yield;

    public Commercial(String address, double area, double price, double yield) {
        this(address, area, price, yield, false);
    }

    public Commercial(String address, double area, double price, double yield, boolean storeroom) {
        super(address, area, price);
        setYield(yield);
        this.storeroom = storeroom;
    }

    public boolean hasStoreroom() {
        return storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if (yield < 0) {
            throw new IllegalArgumentException("Yield cannot be negative.");
        }
        this.yield = yield;
    }

    public void calculateMonthlyProfit() {
        double profit = getPrice() * (yield / 100) / 12;
        System.out.println("Monthly Profit: $" + profit);
    }

    @Override
    public void taxIt() {
        System.out.println("Tax to be paid: $" + getPrice() * 0.05);
    }

    @Override
    public String toString() {
        return "Commercial: " + super.toString() + ", Yield: " + yield + "%, Storeroom: " + storeroom;
    }
}
