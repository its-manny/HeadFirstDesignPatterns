package Facade.Components;

public class Amplifier {
    private Tuner tuner;
    private StreamingPlayer player;

    public void on() {
        System.out.println("Amplifier switching on");
    }

    public void off() {
        System.out.println("Amplifier switching off");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println("Amplifier set to stereo sound");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier set to surround sound");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
