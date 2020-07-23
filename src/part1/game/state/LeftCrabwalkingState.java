package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class LeftCrabwalkingState implements GameState {


    @Override
    public void down(GameModel context) throws IOException {
        context.setGameState(new SittingState());
    }

    @Override
    public void left(GameModel context) {
        context.setX(context.getX() - 5);
    }

    @Override
    public void right(GameModel context) throws IOException {
        context.setX(context.getX() + 5);
        context.setGameState(new RightCrabwalkingState());
    }


    @Override
    public String getName() {
        return "leftcrabwalking";
    }
}
