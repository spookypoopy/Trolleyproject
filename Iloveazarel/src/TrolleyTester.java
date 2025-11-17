/**
 * Tester class for the Trolley project.
 * Demonstrates constructors, methods, and toString outputs.
 * 
 * @author Jacob
 * @author ChatGPT (Code + Comments)
 */
public class TrolleyTester {
    public static void main(String[] args) {
        // Create a custom amenities object
        Amenities customAmenities = new Amenities(true, true, true);

        // Construct a custom trolley
        Trolley trolley1 = new Trolley(15, 50, 10, 8, 10.2, customAmenities);
        System.out.println(trolley1);

        // Construct a default trolley
        Trolley trolley2 = new Trolley();
        System.out.println(trolley2);

        // Call behavior methods
        trolley1.move(); // without parameter
        trolley1.turn("left"); // with parameter

        trolley2.loadPassengers(25); // with parameter
        trolley2.stop(); // without parameter

        // Demonstrate getters and setters
        System.out.println("Current speed of trolley1: " + trolley1.getSpeed());
        trolley1.setSpeed(30);
        System.out.println("New speed of trolley1: " + trolley1.getSpeed());
    }
}