package snake.graphics.window;

import javax.swing.*;

public class JFrameGameWindow extends JFrame {

    public JFrameGameWindow(String title, int width, int height){
        setTitle(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
