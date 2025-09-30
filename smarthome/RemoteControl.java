package smarthome;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command[] increaseCommands;
    private Command[] decreaseCommands;

    public RemoteControl(int numDevices) {
        onCommands = new Command[numDevices];
        offCommands = new Command[numDevices];
        increaseCommands = new Command[numDevices];
        decreaseCommands = new Command[numDevices];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand, Command increaseCommand, Command decreaseCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
        increaseCommands[slot] = increaseCommand;
        decreaseCommands[slot] = decreaseCommand;
    }

    public void pressOn(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }
    }

    public void pressOff(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        }
    }

    public void pressIncrease(int slot) {
        if (increaseCommands[slot] != null) {
            increaseCommands[slot].execute();
        }
    }

    public void pressDecrease(int slot) {
        if (decreaseCommands[slot] != null) {
            decreaseCommands[slot].execute();
        }
    }
}