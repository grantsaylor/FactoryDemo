package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class LeftWalkingState implements GameState {


    @Override
    public void down(GameModel context) throws IOException {
        context.setGameState(new StandingState());
    }

    @Override
    public void left(GameModel context) { context.setX(context.getX() - 10);
    }

    @Override
    public void right(GameModel context) throws IOException {
        context.setX(context.getX() + 10);
        context.setGameState(new RightWalkingState());
    }

    @Override
    public void shift(GameModel context) throws IOException {
        context.setGameState(new LeftRunningState());
    }

    @Override
    public String getName() {
        return "leftwalking";
    }
}
