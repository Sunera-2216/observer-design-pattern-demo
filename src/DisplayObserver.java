/**
 * Observer Design Pattern Demo
 *
 * Author: Sunera Sunilaka
 */

public class DisplayObserver implements Observer {
    // Battery level object.
    private final BatteryLevel batteryLevel;

    public DisplayObserver(BatteryLevel batteryLevel) {
        // Initialize batteryLevel object.
        this.batteryLevel = batteryLevel;

        // Register this class as an observer.
        this.batteryLevel.addObserver(this);
    }

    @Override
    public void notifyChanges() {
        // Display the current battery level to the user.
        System.out.println("Battery level: " + batteryLevel.getBatteryLevel() + "%");
    }
}
