/**
 * Observer Design Pattern Demo
 *
 * Author: Sunera Sunilaka
 */

public class NotificationObserver implements Observer {
    // Battery level object.
    private final BatteryLevel batteryLevel;

    public NotificationObserver(BatteryLevel batteryLevel) {
        // Initialize batteryLevel object.
        this.batteryLevel = batteryLevel;

        // Register this class as an observer.
        this.batteryLevel.addObserver(this);
    }

    @Override
    public void notifyChanges() {
        // Display the battery low notification if current battery level is less than or equal to 20.
        if (batteryLevel.getBatteryLevel() <= 20) {
            System.out.println("Battery Low.");
        }
    }
}
