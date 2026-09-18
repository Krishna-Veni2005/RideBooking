public class RideBookingTest {

    public static void main(String[] args) {

        double actualFare = RideBooking.calculateFare(15);
        double expectedFare = 275.0;

        if (actualFare != expectedFare) {
            throw new AssertionError(
                "Fare test failed. Expected: "
                + expectedFare
                + ", Actual: "
                + actualFare
            );
        }

        System.out.println("Fare calculation test passed!");
    }
}