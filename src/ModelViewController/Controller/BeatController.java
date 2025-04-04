package ModelViewController.Controller;

import ModelViewController.Model.BeatModel;
import ModelViewController.Model.BeatModelInterface;
import ModelViewController.View.DJView;

public class BeatController implements ControllerInterface {
    BeatModelInterface beatModelInterface;
    DJView djView;

    public BeatController(BeatModelInterface beatModelInterface) {
        this.beatModelInterface = beatModelInterface;
        djView = new DJView(this, beatModelInterface);
        djView.createView();
        djView.createControls();
        djView.disableStopMenuItem();
        djView.enableStartMenuItem();
    }

    @Override
    public void start() {
        beatModelInterface.on();
        djView.disableStartMenuItem();
        djView.enableStopMenuItem();
    }

    @Override
    public void stop() {
        beatModelInterface.off();
        djView.disableStopMenuItem();
        djView.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        beatModelInterface.setBPM(beatModelInterface.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        beatModelInterface.setBPM(beatModelInterface.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        beatModelInterface.setBPM(bpm);
    }
}
