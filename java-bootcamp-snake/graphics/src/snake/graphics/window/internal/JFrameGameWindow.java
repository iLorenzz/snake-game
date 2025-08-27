package snake.graphics.window.internal;

import snake.graphics.basic.Color;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Text;
import snake.graphics.basic.Point;

import javax.swing.*;
import java.awt.*;

public class JFrameGameWindow extends JFrame {
    private final Renderer renderer;
    private final Rect drawingArea;

    public JFrameGameWindow(String title, int width, int height){
        setTitle(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);

        renderer = new Renderer();

        //int upperY = height - getContentPane().getSize().height;
        drawingArea = new Rect(Color.WHITE, 0, 0, width, height);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Rect getDrawingArea(){
        return drawingArea;
    }

    public Renderer getRenderer(){
        return renderer;
    }

    @Override
    public void paint(Graphics g){
        renderer.render(g);
    }
}
