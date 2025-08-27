package snake.graphics.drawable;

import snake.graphics.basic.Color;
import snake.graphics.basic.Dimension;
import java.util.List;

import java.awt.*;

public class Rect extends Drawable{
    private final Rectangle rectangle;

    public Rect(Color color, int x, int y, int width, int height){
        super(color);
        this.rectangle = new Rectangle(x, y, width, height);
    }

    public Rect(){
        this(Color.BLACK, 0, 0, 0, 0);
    }

    public Rect(snake.graphics.basic.Point p, snake.graphics.basic.Dimension dimension)  {
        this(null, p.x(), p.y(), dimension.width(), dimension.height());
    }

    public snake.graphics.basic.Point location(){
        return new snake.graphics.basic.Point(rectangle.x, rectangle.y);
    }

    public void location(snake.graphics.basic.Point point){
        rectangle.x = point.x();
        rectangle.y = point.y();
    }

    public snake.graphics.basic.Dimension dimension(){
        return new snake.graphics.basic.Dimension(rectangle.width, rectangle.height);
    }

    public void location(Dimension dimension){
        rectangle.width = dimension.width();
        rectangle.height = dimension.height();
    }

    public int minX(){
        return (int) rectangle.getMinX();
    }

    public int minY(){
        System.out.println(rectangle.getMinY());
        return (int) rectangle.getMinY();
    }

    public int maxX(){
        return (int) rectangle.getMaxX();
    }

    public int maxY(){
        System.out.println(rectangle.getMaxY());
        return (int) rectangle.getMaxY();
    }

    public void dimension(int width, int height){
        rectangle.width = width;
        rectangle.height = height;
    }

    public boolean intersects(Rect rect){
        return rectangle.intersects(rect.rectangle);
    }

    @Override
    public void draw(Graphics g){
        g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public static void shift(List<Rect> rects){
        for(int i = rects.size() - 1; i >= 1; i--){
            rects.set(i, rects.get(i-1));
        }
    }
}
