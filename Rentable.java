package RentalCarsProject;

public interface Rentable {
    double calculateRentalPrice(int daysRented);
    double calculateRentalPriceWithDiscount(int daysRented, double discount);
}
