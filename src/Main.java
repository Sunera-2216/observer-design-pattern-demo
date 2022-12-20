/**
 * Observer Design Pattern Demo
 *
 * Author: Sunera Sunilaka
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Initialize a object from BatteryLevel class.
        BatteryLevel batteryLevel = new BatteryLevel();

        // Instantiate DisplayObserver instance.
        new DisplayObserver(batteryLevel);

        // Instantiate NotificationObserver instance.
        new NotificationObserver(batteryLevel);

        // Instantiate PowerSaverObserver instance.
        new PowerSaverObserver(batteryLevel);

// ---------------------------------------------------------------------------------------------------------------------
        // CHANGING BATTERY LEVEL TO OBSERVER CHANGES.

        // METHOD 01

        // Set battery level.
        batteryLevel.setBatteryLevel(100);

        System.out.println();

        // Set battery level.
        batteryLevel.setBatteryLevel(15);

        // END OF METHOD 01

// ---------------------------------------------------------------------------------------------------------------------
        // METHOD 02

        // Set initial battery level value.
        int level = 22;

        // Using while loop battery level decreasing to 17 gradually.
        // 1% of battery level will be deceased in every 3 seconds.
        while (level >= 17) {
            // Set current battery level.
            batteryLevel.setBatteryLevel(level);
            System.out.println();

            // Decrease battery level by 1.
            level--;

            // Sleep the thread and wait for 3 seconds before the next iteration.
            Thread.sleep(3000);
        }

        // END OF METHOD 02

// ---------------------------------------------------------------------------------------------------------------------

    }

}
