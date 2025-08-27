package snake.game;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.game.scene.Background;
import snake.graphics.basic.Color;
import snake.graphics.window.GameWindow;

public class Game {
    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);

    private GameWindow gameWindow;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private static final String WINDOW_TITLE = "Snake!";

    public void start(){
        System.out.println("Starting");
        LOGGER.debug("Teste");

        gameWindow = new GameWindow(WINDOW_TITLE, WINDOW_WIDTH, WINDOW_HEIGHT);
        addElementsToScreen();
    }

    private void addElementsToScreen(){
        gameWindow.addDrawable(new Background(WINDOW_WIDTH, WINDOW_HEIGHT, Color.BLACK));
    }
}
