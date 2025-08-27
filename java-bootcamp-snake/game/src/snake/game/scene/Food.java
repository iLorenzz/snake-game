package snake.game.scene;

import snake.game.utils.RandomUtils;
import snake.graphics.drawable.Rect;

import java.awt.*;

public class Food extends Rect {
    private static final int SIZE = 5;
    private final Rect drawingArea;

    public Food(Rect drawingArea){
        this.drawingArea = drawingArea;

        moveToRandomLocation();
        dimension(5, 5);
        setColor(snake.graphics.basic.Color.RED);
    }

    public void moveToRandomLocation(){
        int distanceFromBorder = 3;

        int x = RandomUtils.random(
                drawingArea.minX() + distanceFromBorder,
                drawingArea.maxX() - SIZE - distanceFromBorder
        );

        System.out.println(x);

        int y = RandomUtils.random(
                drawingArea.minY() + distanceFromBorder,
                drawingArea.maxY() - SIZE - distanceFromBorder
        );

        System.out.println(y);

        location(new Point(x, y));
    }
}
