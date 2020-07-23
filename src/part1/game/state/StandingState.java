package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class StandingState implements GameState {

    @Override
    public void up(GameModel context) throws IOException {
        context.setGameState(new JumpingState());
    }

    @Override
    public void down(GameModel context) throws IOException {
        context.setGameState(new SittingState());
    }

    @Override
    public void left(GameModel context) throws IOException {
        context.setGameState(new LeftWalkingState());
    }

    @Override
    public void right(GameModel context) throws IOException {
        context.setGameState(new RightWalkingState());
    }

    @Override
    public String getName() {
        return "standing";
    }
}
