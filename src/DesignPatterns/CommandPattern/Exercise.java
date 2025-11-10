package DesignPatterns.CommandPattern;

// This class is responsible for creating devices, commands, and a remote control to demonstrate the command pattern functionality.

public class Exercise {

    //Do not modify the run method; it is designed to manage command execution and control the devices.
    public static void main (String[] args) {
        // Create devices
        Light light = new Light();
        Fan fan = new Fan();

        RemoteControl remoteControl = getRemoteController(light, fan);

        remoteControl.pressLightOnButton();
        remoteControl.pressLightOffButton();

        remoteControl.pressFanOnButton();
        remoteControl.pressFanOffButton();
    }

    public static RemoteControl getRemoteController(Light light, Fan fan) {
        Command lightOn = new LightCommands.LightOnCommand(light);
        Command lightOff = new LightCommands.LightOffCommand(light);
        Command fanOn = new FanCommands.FanOnCommand(fan);
        Command fanOff = new FanCommands.FanOffCommand(fan);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setLightOnCommand(lightOn);
        remoteControl.setLightOffCommand(lightOff);

        remoteControl.setFanOnCommand(fanOn);
        remoteControl.setFanOffCommand(fanOff);

        return remoteControl;
    }
}