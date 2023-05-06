package RentalCarsProject;
public class Vehicle {
    // class variables
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isAvailable;
    private int totalDaysRented;
    private double totalRevenue;

    // constructors
    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAvailable = true;
        this.totalDaysRented = 0;
        this.totalRevenue = 0;
    }

    // methods
    public void rent(int daysRented) {
        this.isAvailable = false;
        this.totalDaysRented += daysRented;
        this.totalRevenue += calculateRentalPrice(daysRented,1);
    }

    public void returnRented() {
        this.isAvailable = true;
    }

    public double calculateRentalPrice(int daysRented, double dailyPrice) {
        return daysRented * dailyPrice;
    }

    // getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getTotalDaysRented() {
        return totalDaysRented;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}







