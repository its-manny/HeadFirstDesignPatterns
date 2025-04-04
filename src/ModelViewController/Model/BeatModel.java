package ModelViewController.Model;

import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable{
    List<BeatObserver> beatObserverList = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObserverList = new ArrayList<BPMObserver>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stop = true;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }


    @Override
    public void run() {
        while(!stop) {
            notifyBeatObservers();
            try {
                Thread.sleep(60000/getBPM());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void notifyBeatObservers() {
        for(BeatObserver beatObserver : beatObserverList) {
            beatObserver.updateBeat();
        }
    }

    private void notifyBPMObservers() {
        for(BPMObserver bpmObserver : bpmObserverList) {
            bpmObserver.updateBPM();
        }
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        beatObserverList.add(beatObserver);
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        beatObserverList.remove(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver bpmObserver) {
        bpmObserverList.add(bpmObserver);
    }

    @Override
    public void removeObserver(BPMObserver bpmObserver) {
        bpmObserverList.remove(bpmObserver);
    }
}
