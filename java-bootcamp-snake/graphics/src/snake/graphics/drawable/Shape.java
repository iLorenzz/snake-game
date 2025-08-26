package snake.graphics.drawable;

import snake.graphics.basic.Color;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Shape extends Drawable{
    private final List<Rect> rects;

    public Shape(Color color){
        super(color);
        rects = new ArrayList<>();
    }

    public void addRect(Rect rect){
        rect.setColor(getColor());
        rects.add(rect);
    }

    public List<Rect> rects(){
        return rects;
    }

    public Rect firstRect(){
        return rects.getFirst();
    }

    public Rect lasRect(){
        return rects.getLast();
    }

    public boolean intersects(Rect other){
        return rects
                .stream()
                .anyMatch(r -> r.intersects(other));
    }

    @Override
    public void draw(Graphics g){
        rects.forEach(r -> r.draw(g));
    }
}
