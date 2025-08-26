package snake.graphics.window;

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
        renderer.add(new Rect(Color.GREEN, 20, 20, 200, 100));
        renderer.add(new Text(Color.BLACK, "Hello", new Point(200, 200)));

        int upperY = height - getContentPane().getSize().height;
        drawingArea = new Rect(Color.WHITE, 0, upperY, width, height - upperY);

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
