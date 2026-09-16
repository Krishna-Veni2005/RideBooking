public class RideBooking {

    public static double calculateFare(double distance) {
        double baseFare = 50;
        double pricePerKm = 15;

        return baseFare + (distance * pricePerKm);
    }

    public static void bookRide(String pickup, String destination) {
        System.out.println("Ride booked successfully!");
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
    }

    public static void main(String[] args) {

        double distance = 15;

        double fare = calculateFare(distance);

        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);

        bookRide("CVR College", "Hyderabad Airport");
    }
}