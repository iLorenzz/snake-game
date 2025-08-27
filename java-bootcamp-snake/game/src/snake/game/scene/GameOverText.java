package snake.game.scene;

import snake.game.Game;
import snake.graphics.basic.Color;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Text;

public class GameOverText extends Text {
    public GameOverText(int score){
        super( Color.RED,
                "Fim de jogo.\nPontos: " + score,
                new Point(Game.WINDOW_WIDTH / 2 - 75, Game.WINDOW_HEIGHT / 2)
        );
    }
}
