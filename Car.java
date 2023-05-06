package RentalCarsProject;

public class Car extends Vehicle implements Rentable {
    // class variables
    private double dailyPrice;
    private int minAgeRequirement;
    private int maximumMileage;

    // constructors
    public Car(String make, String model, int year, String color, double dailyPrice, int minAgeRequirement, int maximumMileage) {
        super(make, model, year, color);
        this.dailyPrice = dailyPrice;
        this.minAgeRequirement = minAgeRequirement;
        this.maximumMileage = maximumMileage;
    }

    // methods
    public double calculateRentalPrice(int daysRented) {
        return super.calculateRentalPrice(daysRented, dailyPrice);
    }

    public double calculateRentalPriceWithDiscount(int daysRented, double discount) {
        double regularPrice = calculateRentalPrice(daysRented);
        if (daysRented >= 7) {
            return regularPrice * (1 - discount);
        } else {
            return regularPrice;
        }
    }

    // getters and setters
    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getMinAgeRequirement() {
        return minAgeRequirement;
    }

    public void setMinAgeRequirement(int minAgeRequirement) {
        this.minAgeRequirement = minAgeRequirement;
    }

    public int getMaximumMileage() {
        return maximumMileage;
    }

    public void setMaximumMileage(int maximumMileage) {
        this.maximumMileage = maximumMileage;
    }
}