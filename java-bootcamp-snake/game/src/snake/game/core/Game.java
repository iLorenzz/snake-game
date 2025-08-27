package snake.game.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.game.scene.Background;
import snake.game.scene.Food;
import snake.game.scene.Snake;
import snake.graphics.basic.Color;
import snake.graphics.window.GameWindow;

public class Game {
    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);

    private GameWindow gameWindow;
    private Snake snake;

    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    private static final String WINDOW_TITLE = "Snake!";

    public void start(){
        System.out.println("Starting");
        LOGGER.debug("Teste");

        gameWindow = new GameWindow(WINDOW_TITLE, WINDOW_WIDTH, WINDOW_HEIGHT);
        addElementsToScreen();

        startGameLoop();
    }

    private void addElementsToScreen(){
        gameWindow.addDrawable(new Background(WINDOW_WIDTH, WINDOW_HEIGHT, Color.BLACK));

        gameWindow.addDrawable(new Food(gameWindow.drawingArea()));

        snake = new Snake();
        gameWindow.addDrawable(snake);

        //gameWindow.addDrawable(new GameOverText(14));
    }

    private void startGameLoop(){
        do{
            updateScene();
        }while(!isGameOver());
    }

    private void updateScene(){
        snake.move();
        gameWindow.update();
        sleep(50);
    }

    private boolean isGameOver(){
        return false;
    }

    private void sleep(int milis) {
        try{
            Thread.sleep(milis);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
