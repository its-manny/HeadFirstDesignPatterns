package ModelViewController;

import ModelViewController.Controller.BeatController;
import ModelViewController.Controller.ControllerInterface;
import ModelViewController.Model.BeatModel;
import ModelViewController.Model.BeatModelInterface;

/**
 * Implements the Model View Controller COMPOUND Pattern.
 * COMPOUND patterns combine two or more patterns into a solution that solves a recurring or general problem.
 */
public class DJTest {

    public static void main(String[] args) {
        BeatModelInterface beatModelInterface = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(beatModelInterface);
    }
}
