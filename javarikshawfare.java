import java.util.*;

/**
 * Write a description of class question1cenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class javarikshawfare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter time in minutes: ");
        double time = sc.nextDouble();

        System.out.print("Is the customer local? (yes/no): ");
        String localInput = sc.next();

        System.out.print("Is it night time? (yes/no): ");
        String nightInput = sc.next();

        // Using ternary operators to convert input to boolean
        boolean isLocal = localInput.equalsIgnoreCase("yes") ? true : false;
        boolean isNight = nightInput.equalsIgnoreCase("yes") ? true : false;

        // Fare rules
        double baseFare = 30;                // minimum fare
        double costPerKm = 20;               // rate per km
        double costPerMinute = 1;            // waiting/ride time cost per minute
        double nightChargeRate = 1.20;       // 20% extra at night
        double localDiscountRate = 0.90;     // 10% discount for locals

        // Calculate fare
        double fare = baseFare + (distance * costPerKm) + (time * costPerMinute);

        // Apply night charge (if true)
        fare = isNight ? fare * nightChargeRate : fare;

        // Apply local discount (if true)
        fare = isLocal ? fare * localDiscountRate : fare;

        // Display final fare
        System.out.println("\n-------------------------------------------");
        System.out.println("          FINAL RICKSHAW FARE");
        System.out.println("-------------------------------------------");
        System.out.println("Total Fare: Rs. " + Math.round(fare));
        System.out.println("-------------------------------------------");

        sc.close();
    }
}