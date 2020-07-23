package part1.game;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 3 PART 1
DATE: 7/17/2020
 */

import part1.game.state.*;
import part1.game.view.GameView;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


//Controller Class
public class GameController implements KeyListener, Observer {

    private GameModel model;
    private GameView view;


    //Constructor
    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        view.addGameKeyListener(this);
        model.registerObserver(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    //Register key presses to invoke the proper state of the part1.game
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            try {
                model.getGameState().up(model);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            try {
                model.getGameState().down(model);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            try {
                model.getGameState().left(model);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            try {
                model.getGameState().right(model);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            try {
                model.getGameState().shift(model);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (model.gameState.getName().equals("jumping")) {
            try {
                updateView();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        try {
            view.setState(model.getGameState().getName());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            updateView();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void updateView() throws IOException {
        try {
            view.setX(model.getX());
            view.setState(model.getGameState().getName());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        if (model.getGameState() instanceof JumpingState) {
            int delay = 500; //milliseconds
            ActionListener taskPerformer = e1 -> {
                try {
                    model.setGameState(new StandingState());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
            Timer timer = new Timer(delay, taskPerformer);
            timer.setRepeats(false);
            timer.start();
        }
    }
}