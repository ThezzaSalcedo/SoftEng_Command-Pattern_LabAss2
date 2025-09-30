package smarthome;

public class DecreaseCommand implements Command {
    private Adjustable device;

    public DecreaseCommand(Adjustable device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.decrease();
    }
}
