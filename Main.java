package RentalCarsProject;

public class Main {
        public static void main(String[] args) {
            Car car1 = new Car("Honda", "Civic", 2022, "Black", 50.0, 21, 50000);
            System.out.println("Daily rental price for " + car1.getMake() + " " + car1.getModel() + ": $" + car1.getDailyPrice());
            System.out.println("Minimum age requirement for renting " + car1.getMake() + " " + car1.getModel() + ": " + car1.getMinAgeRequirement() + " years");
            System.out.println("Maximum mileage for renting " + car1.getMake() + " " + car1.getModel() + ": " + car1.getMaximumMileage() + " miles");

            double rentalPrice = car1.calculateRentalPrice(5);
            System.out.println("Rental price for " + car1.getMake() + " " + car1.getModel() + " for 5 days: $" + rentalPrice);

            double rentalPriceWithDiscount = car1.calculateRentalPriceWithDiscount(7, 0.1);
            System.out.println("Rental price with 10% discount for " + car1.getMake() + " " + car1.getModel() + " for 7 days: $" + rentalPriceWithDiscount);
        }
    }

