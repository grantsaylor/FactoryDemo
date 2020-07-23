package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.awt.*;
import java.io.IOException;

//Interface for the GameState
public interface GameState {

    //Default functionality if none is provided (system beep)
    default void up(GameModel context) throws IOException {
        Toolkit.getDefaultToolkit().beep();
    }

    default void down(GameModel context) throws IOException {
        Toolkit.getDefaultToolkit().beep();
    }

    default void left(GameModel context) throws IOException {
        Toolkit.getDefaultToolkit().beep();
    }

    default void right(GameModel context) throws IOException {
        Toolkit.getDefaultToolkit().beep();
    }

    default void shift(GameModel context) throws IOException {
        Toolkit.getDefaultToolkit().beep();
    }

    public String getName();

}
