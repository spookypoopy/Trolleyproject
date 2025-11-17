/**
 * The Amenities class represents features available in a trolley,
 * such as air conditioning, Wi-Fi, and reclining seats.
 * This class is used within the Trolley class.
 * 
 * @author Jacob
 * @author ChatGPT (Code + Comments)
 */
public class Amenities {
    private boolean hasAirConditioning;
    private boolean hasWiFi;
    private boolean hasRecliningSeats;

    /**
     * Default constructor – creates standard amenities.
     */
    public Amenities() {
        hasAirConditioning = true;
        hasWiFi = false;
        hasRecliningSeats = false;
    }

    /**
     * Overloaded constructor – creates custom amenities.
     * 
     * @param ac if trolley has air conditioning
     * @param wifi if trolley has Wi-Fi
     * @param seats if trolley has reclining seats
     */
    public Amenities(boolean ac, boolean wifi, boolean seats) {
        hasAirConditioning = ac;
        hasWiFi = wifi;
        hasRecliningSeats = seats;
    }

    // Getters and setters
    public boolean getHasAirConditioning() { return hasAirConditioning; }
    public boolean getHasWiFi() { return hasWiFi; }
    public boolean getHasRecliningSeats() { return hasRecliningSeats; }

    public void setHasAirConditioning(boolean ac) { hasAirConditioning = ac; }
    public void setHasWiFi(boolean wifi) { hasWiFi = wifi; }
    public void setHasRecliningSeats(boolean seats) { hasRecliningSeats = seats; }

    /** Returns a string description of the amenities. */
    public String toString() {
        return "Amenities [AC=" + hasAirConditioning +
               ", WiFi=" + hasWiFi +
               ", Reclining Seats=" + hasRecliningSeats + "]";
    }
}