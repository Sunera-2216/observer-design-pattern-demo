/**
 * Observer Design Pattern Demo
 *
 * Author: Sunera Sunilaka
 */

public class PowerSaverObserver implements Observer {
    // Battery level object.
    private final BatteryLevel batteryLevel;

    public PowerSaverObserver(BatteryLevel batteryLevel) {
        // Initialize batteryLevel object.
        this.batteryLevel = batteryLevel;

        // Register this class as an observer.
        this.batteryLevel.addObserver(this);
    }

    @Override
    public void notifyChanges() {
        // Turn on the power saver mode if current battery level is less than to 18.
        if (batteryLevel.getBatteryLevel() < 18) {
            System.out.println("Power Saver Mode On.");
        }
    }
}
