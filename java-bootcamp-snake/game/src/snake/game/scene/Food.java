package snake.game.scene;

import snake.graphics.drawable.Rect;

import java.awt.*;

public class Food extends Rect {
    public Food(){
        moveToRandomLocation();
        dimension(5, 5);
        setColor(snake.graphics.basic.Color.RED);
    }

    public void moveToRandomLocation(){

    }
}
