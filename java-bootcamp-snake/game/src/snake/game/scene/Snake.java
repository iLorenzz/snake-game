package snake.game.scene;

import snake.game.core.Direction;
import snake.graphics.basic.Color;
import snake.graphics.basic.Dimension;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Shape;

public class Snake extends Shape {
    private Direction direction;

    public Snake(){
        super(Color.WHITE);

        direction = Direction.RIGHT;

        Point p = new Point(300, 100);
        Dimension d = new Dimension(10 , 10);

        Rect rect = new Rect(p, d);
        addRect(rect);

        Point direction = new Point(-1, 0);

        for(int i = 0; i <= 10; i++){
            rect = duplicateRect(rect, direction);
            addRect(rect);
        }
    }

    public void move(){
        Rect head = firstRect();

        Rect.shift(rects());

        Rect newHead = duplicateRect(head, direction.point());
        rects().set(0, newHead);
    }
}
