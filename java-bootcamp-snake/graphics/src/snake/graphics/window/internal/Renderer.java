package snake.graphics.window.internal;

import snake.graphics.basic.Color;
import snake.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Renderer {
    private final List<Drawable> drawables;

    public Renderer(){
        drawables = new ArrayList<>();
    }

    public void render(java.awt.Graphics g){
        for(Drawable d : drawables){
            g.setColor(toAwtColor(d.getColor()));
            d.draw(g);
        }
    }

    public void add(Drawable drawable){
        drawables.add(drawable);
    }

    public void remove(Drawable drawable){
        drawables.remove(drawable);
    }

    private java.awt.Color toAwtColor(Color color){
        return switch (color){
            case BLACK -> java.awt.Color.BLACK;
            case WHITE -> java.awt.Color.WHITE;
            case GREEN -> java.awt.Color.GREEN;
            case RED -> java.awt.Color.RED;
        };
    }
}
