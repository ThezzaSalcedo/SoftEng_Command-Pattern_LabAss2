package smarthome;

public class Light implements Switchable, Adjustable {
    private int brightness = 0;

    @Override
    public void turnOn() {
        if (brightness == 0) {
            brightness = 50; // Default brightness
        }
        System.out.println("Light is turned ON at brightness " + brightness + "%");
    }

    @Override
    public void turnOff() {
        brightness = 0;
        System.out.println("Light is turned OFF");
    }

    @Override
    public void increase() {
        if (brightness < 100) {
            brightness += 10;
        }
        System.out.println("Light brightness increased to " + brightness + "%");
    }

    @Override
    public void decrease() {
        if (brightness > 0) {
            brightness -= 10;
        }
        System.out.println("Light brightness decreased to " + brightness + "%");
    }
}
