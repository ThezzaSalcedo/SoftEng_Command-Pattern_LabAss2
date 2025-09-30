package smarthome;

public class Thermostat implements Switchable, Adjustable {
    private int temperature = 72; // Default in Fahrenheit
    private boolean isOn = true;
    private int lastTemperature = 72;

    @Override
    public void turnOn() {
        if (!isOn) {
            temperature = lastTemperature;
            isOn = true;
            System.out.println("Thermostat is turned ON to " + temperature + "°F");
        } else {
            System.out.println("Thermostat is already ON at " + temperature + "°F");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            lastTemperature = temperature;
            temperature = 0; // Represent off state
            isOn = false;
            System.out.println("Thermostat is turned OFF");
        } else {
            System.out.println("Thermostat is already OFF");
        }
    }

    @Override
    public void increase() {
        if (isOn) {
            temperature += 1;
            System.out.println("Thermostat temperature increased to " + temperature + "°F");
        } else {
            System.out.println("Thermostat is OFF, cannot increase temperature");
        }
    }

    @Override
    public void decrease() {
        if (isOn) {
            temperature -= 1;
            System.out.println("Thermostat temperature decreased to " + temperature + "°F");
        } else {
            System.out.println("Thermostat is OFF, cannot decrease temperature");
        }
    }

    public void setTemperature(int temp) {
        if (isOn) {
            temperature = temp;
            System.out.println("Thermostat set to " + temperature + "°F");
        } else {
            System.out.println("Thermostat is OFF, cannot set temperature");
        }
    }
}
