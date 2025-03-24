package Command;

import Command.Devices.*;
import Command.Commands.*;

/**
 * Implements the COMMAND Pattern.
 * The pattern encapsulates a request as an object, thereby letting you parameterize other objects with different
 * requests, queue or log requests, and support undoable operations.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0,lightOnCommand, lightOffCommand);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remoteControl.setCommand(1,garageDoorOpenCommand,garageDoorCloseCommand);

        StereoOnWithDVDCommand stereoOnWithDVDCommand = new StereoOnWithDVDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(2, stereoOnWithDVDCommand, stereoOffCommand);

        MacroCommand macroCommand = new MacroCommand(new Command[]{lightOnCommand, garageDoorOpenCommand, stereoOnWithDVDCommand});
        remoteControl.setCommand(3, macroCommand, new NoCommand());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);

        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);

        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();

        System.out.println("\n--- Testing MacroCommand ---\n");
        remoteControl.onButtonWasPushed(3);

    }
}
