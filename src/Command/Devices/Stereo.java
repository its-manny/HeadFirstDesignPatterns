package Command.Devices;

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }
    public void off() {
        System.out.println("Stereo is off");
    }
    public void setCd() {
        System.out.println("Stereo set to CD");
    }
    public void setDvd() {
        System.out.println("Stereo set to DVD");
    }
    public void setVolume(int v) {
        System.out.println("Stereo volume set to " + v);
    }
}
