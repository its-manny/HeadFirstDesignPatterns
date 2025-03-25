package Facade.Components;

public class StreamingPlayer {
    private Amplifier amplifier;

    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("StreamingPlayer switching on");
    }

    public void off() {
        System.out.println("StreamingPlayer switching off");
    }

    public void pause() {
        System.out.println("StreamingPlayer paused");
    }

    public void play(String movie) {
        System.out.println("StreamingPlayer playing: " + movie);
    }

    public void setSurroundAudio() {
        System.out.println("StreamingPlayer set to surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("StreamingPlayer set to two channel audio");
    }

    public void stop() {
        System.out.println("StreamingPlayer stopped");
    }
}
