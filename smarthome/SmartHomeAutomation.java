package smarthome;

public class SmartHomeAutomation {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light();
        Thermostat homeThermostat = new Thermostat();
        MusicPlayer livingRoomMusic = new MusicPlayer();

        // Create remote control with slots for devices
        RemoteControl remote = new RemoteControl(3); // 3 devices

        // Assign commands to slots
        remote.setCommand(0,
                new TurnOnCommand(livingRoomLight),
                new TurnOffCommand(livingRoomLight),
                new IncreaseCommand(livingRoomLight),
                new DecreaseCommand(livingRoomLight));

        remote.setCommand(1,
                new TurnOnCommand(homeThermostat),
                new TurnOffCommand(homeThermostat),
                new IncreaseCommand(homeThermostat),
                new DecreaseCommand(homeThermostat));

        remote.setCommand(2,
                new TurnOnCommand(livingRoomMusic),
                new TurnOffCommand(livingRoomMusic),
                new IncreaseCommand(livingRoomMusic),
                new DecreaseCommand(livingRoomMusic));

        // Simulate controlling devices
        System.out.println("Controlling Light:");
        remote.pressOn(0);
        remote.pressIncrease(0);
        remote.pressDecrease(0);
        remote.pressOff(0);

        System.out.println("\nControlling Thermostat:");
        remote.pressOn(1);
        remote.pressIncrease(1);
        remote.pressDecrease(1);
        remote.pressOff(1);

        System.out.println("\nControlling Music Player:");
        remote.pressOn(2);
        remote.pressIncrease(2);
        remote.pressDecrease(2);
        remote.pressOff(2);
    }
}
