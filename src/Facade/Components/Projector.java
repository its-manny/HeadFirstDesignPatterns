package Facade.Components;

public class Projector {
    private StreamingPlayer player;

    public Projector(StreamingPlayer player) {
        this.player = player;
    }

    public void on() {
        System.out.println("Projector switching on");
    }

    public void off() {
        System.out.println("Projector switching off");
    }

    public void tvMode() {
        System.out.println("Projector set to TV mode");
    }

    public void widescreenMode() {
        System.out.println("Projector set to widescreen mode");
    }

}
