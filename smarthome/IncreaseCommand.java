package smarthome;

public class IncreaseCommand implements Command {
    private Adjustable device;

    public IncreaseCommand(Adjustable device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.increase();
    }
}
