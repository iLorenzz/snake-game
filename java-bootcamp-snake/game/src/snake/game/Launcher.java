package snake.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);

    public static void main(String[] args) {
        new Game().start();
    }
}