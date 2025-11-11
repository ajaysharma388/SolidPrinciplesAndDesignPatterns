package DesignPatterns.BehaviouralPatterns.Command;

public class FanCommands {

    public record FanOnCommand(Fan fan) implements Command {
        //TODO: Override the execute() method from the Command interface and Implement the logic to turn on the fan when this command is executed.
        public void execute() {
            this.fan.turnOn();
        }
    }

    public record FanOffCommand(Fan fan) implements Command {
        //TODO: Override the execute() method from the Command interface and Implement the logic to turn off the fan when this command is executed.
        public void execute() {
            this.fan.turnOff();
        }
    }
}