package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class RightRunningState implements GameState {

    @Override
    public void left(GameModel context) throws IOException {
        context.setX(context.getX() - 30);
        context.setGameState(new LeftRunningState());
    }

    @Override
    public void right(GameModel context) {
        context.setX(context.getX() + 30);
    }

    @Override
    public void shift(GameModel context) throws IOException {
        context.setGameState(new RightWalkingState());
    }

    @Override
    public String getName() {
        return "rightrunning";
    }
}
