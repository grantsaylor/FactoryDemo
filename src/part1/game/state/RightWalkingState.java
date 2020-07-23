package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class RightWalkingState implements GameState {


    @Override
    public void down(GameModel context) throws IOException {
        context.setGameState(new StandingState());
    }

    @Override
    public void left(GameModel context) throws IOException {
        context.setX(context.getX() - 10);
        context.setGameState(new LeftWalkingState());
    }

    @Override
    public void right(GameModel context) {
        context.setX(context.getX() + 10);
    }

    @Override
    public void shift(GameModel context) throws IOException {
        context.setGameState(new RightRunningState());
    }

    @Override
    public String getName() {
        return "rightwalking";
    }
}
