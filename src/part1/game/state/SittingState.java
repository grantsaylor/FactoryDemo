package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class SittingState implements GameState {


    @Override
    public void up(GameModel context) throws IOException {
        context.setGameState(new StandingState());
    }

    @Override
    public void down(GameModel context) throws IOException {
        context.setGameState(new RightCrawlingState());
    }

    @Override
    public void left(GameModel context) throws IOException {
        context.setGameState(new RightCrabwalkingState());
    }

    @Override
    public void right(GameModel context) throws IOException {
        context.setGameState(new RightCrabwalkingState());
    }

    @Override
    public String getName() {
        return "sitting";
    }
}
