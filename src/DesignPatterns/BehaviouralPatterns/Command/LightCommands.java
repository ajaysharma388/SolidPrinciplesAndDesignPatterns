package DesignPatterns.BehaviouralPatterns.Command;

public class LightCommands {

    public record LightOnCommand(Light light) implements Command {

        //TODO: Override the execute() method from the Command interface and Implement the logic to turn on the light when this command is executed.
            public void execute() {
                this.light.turnOn();
            }
        }

    public record LightOffCommand(Light light) implements Command {
        //TODO: Override the execute() method from the Command interface and Implement the logic to turn off the light when this command is executed.
        public void execute() {
            this.light.turnOff();
        }
    }
}