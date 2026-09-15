public class RideBooking {

    public static double calculateFare(double distance) {
        double baseFare = 50;
        double pricePerKm = 15;

        return baseFare + (distance * pricePerKm);
    }

    public static void main(String[] args) {

        double distance = 15;

        double fare = calculateFare(distance);

        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }
}