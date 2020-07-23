package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class RightCrawlingState implements GameState{

    @Override
    public void up(GameModel context) throws IOException {
        context.setGameState(new SittingState());
    }

    @Override
    public void left(GameModel context) throws IOException {
        context.setX(context.getX() - 2);
        context.setGameState(new LeftCrawlingState());
    }

    @Override
    public void right(GameModel context) {
        context.setX(context.getX() + 2);
    }

    @Override
    public String getName() {
        return "rightcrawling";
    }
}
