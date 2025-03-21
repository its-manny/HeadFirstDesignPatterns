package Command;

import Command.Commands.GarageDoorOpenCommand;
import Command.Commands.LightOnCommand;
import Command.Devices.GarageDoor;
import Command.Devices.Light;

/**
 * Implements the COMMAND Pattern.
 * The pattern encapsulates a request as an object, thereby letting you parameterize other objects with different
 * requests, queue or log requests, and support undoable operations.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
