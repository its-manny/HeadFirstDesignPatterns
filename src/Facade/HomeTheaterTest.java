package Facade;

import Facade.Components.*;

/**
 * Implements the FACADE Pattern.
 * Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level
 * interface that makes the subsystem easier to use.
 */
public class HomeTheaterTest {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner(amplifier);
        StreamingPlayer streamingPlayer = new StreamingPlayer(amplifier);
        Projector projector = new Projector(streamingPlayer);
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, streamingPlayer,
                projector,theaterLights,screen,popcornPopper);

        homeTheaterFacade.watchMovie("Star Wars");
        homeTheaterFacade.endMovie();
    }
}
