package smarthome;

public class TurnOffCommand implements Command {
    private Switchable device;

    public TurnOffCommand(Switchable device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}