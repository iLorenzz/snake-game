package snake.graphics.drawable;

import snake.graphics.basic.Color;

import java.awt.*;

public abstract class Drawable {
   private Color color;

   public Drawable(Color color){
       this.color = color;
   }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName(){
       return getClass().getSimpleName();
    }

    public abstract void draw(Graphics g);

}
