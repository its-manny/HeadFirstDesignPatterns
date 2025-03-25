package Facade.Components;

public class Tuner {
    private Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner switching on");
    }

    public void off() {
        System.out.println("Tuner switching off");
    }

    public void setAm() {
        System.out.println("Tuner set to AM");
    }

    public void setFm() {
        System.out.println("Tuner set to FM");
    }

    public void setFrequency(int frequency) {
        System.out.println("Tuner frequency set to " + frequency);
    }
}
