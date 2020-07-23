package part1.game;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 2
DATE: 7/9/2020
 */

import part1.game.controller.GameController;
import part1.game.model.GameModel;
import part1.game.view.AnimatedView;
import part1.game.view.GameView;

public class Game {

    //Invoke the proper view that you would like
    public static void main(String[] args) {

        GameModel model = new GameModel();
        GameView view = new AnimatedView();
        GameController controller = new GameController(model, view);

    }
}