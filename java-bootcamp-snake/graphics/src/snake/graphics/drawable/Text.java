package snake.graphics.drawable;


import snake.graphics.basic.Color;
import snake.graphics.basic.Point;

import java.awt.*;


public class Text extends Drawable{
    public final String text;
    public final Point location;

    public Text(Color color, String text, Point location){
        super(color);
        this.text = text;
        this.location = location;
    }

    @Override
    public void draw(Graphics g) {
        g.drawString(text, location.x(), location.y());
    }
}
