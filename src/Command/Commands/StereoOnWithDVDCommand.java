package Command.Commands;

import Command.Devices.Stereo;

public class StereoOnWithDVDCommand implements Command{
    Stereo stereo;

    public StereoOnWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume(5);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
