package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/8/2020
 */

import part1.game.GameModel;

import java.io.IOException;

//Key press functionality for the state
public class RightCrabwalkingState implements GameState {


    @Override
    public void down(GameModel context) throws IOException {
        context.setGameState(new SittingState());
    }

    @Override
    public void left(GameModel context) throws IOException {
        context.setX(context.getX() - 5);
        context.setGameState(new LeftCrabwalkingState());
    }

    @Override
    public void right(GameModel context) {
        context.setX(context.getX() + 5);
    }


    @Override
    public String getName() {
        return "rightcrabwalking";
    }
}
