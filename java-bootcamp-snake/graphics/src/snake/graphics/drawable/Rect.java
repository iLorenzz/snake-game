package snake.graphics.drawable;

import snake.graphics.basic.Color;

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

    public Point location(){
        return new Point(rectangle.x, rectangle.y);
    }

    public Dimension dimension(){
        return new Dimension(rectangle.width, rectangle.height);
    }

    public int minX(){
        return (int) rectangle.getMinX();
    }

    public int minY(){
        return (int) rectangle.getMinY();
    }

    public int maxX(){
        return (int) rectangle.getMaxX();
    }

    public int maxY(){
        return (int) rectangle.getMaxY();
    }

    public void dimension(int width, int height){
        rectangle.width = width;
        rectangle.height = height;
    }

    @Override
    public void draw(Graphics g){
        g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }
}
