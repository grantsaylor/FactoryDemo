package part1.game.view;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import java.awt.event.KeyListener;
import java.io.IOException;

//Interface for the GameView classes
public interface GameView {
    void setX(int x);

    void setState(String state) throws IOException;

    void addGameKeyListener(KeyListener listener);
}
