/**
 * Observer Design Pattern Demo
 *
 * Author: Sunera Sunilaka
 */

import java.util.ArrayList;

public class BatteryLevel  {
    // Initialize a list to store registered observers.
    private final ArrayList<Observer> observers = new ArrayList<>();

    // Initialize a variable to store current battery level.
    private int batteryLevel;


    public void addObserver(Observer observer) {
        // Add registered observer to the list.
        observers.add(observer);
    }

    public void setBatteryLevel(int batteryLevel) {
        // Set battery level to class variable.
        this.batteryLevel = batteryLevel;

        // Call notifyUser() method when battery level is changed.
        notifyUser();
    }

    public int getBatteryLevel() {
        // Return current battery level.
        return batteryLevel;
    }

    public void notifyUser() {
        // Iterate through the observers list and call notifyChanges() method of each observer.
        for (Observer observer : observers) {
            observer.notifyChanges();
        }
    }
}
