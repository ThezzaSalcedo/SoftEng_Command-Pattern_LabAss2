package smarthome;

public class TurnOnCommand implements Command {
    private Switchable device;

    public TurnOnCommand(Switchable device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}