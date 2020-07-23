package part1.game;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 3 PART 2
DATE: 7/17/2020
 */

import part1.game.state.GameState;
import part1.game.state.Observer;
import part1.game.state.StandingState;
import part1.game.state.Subject;

import java.io.IOException;
import java.util.ArrayList;

//Model class for the program
public class GameModel implements Subject {
    public int x;
    public GameState gameState;
    private ArrayList<Observer> observers = new ArrayList<>();

    //Set the default starting state
    public GameModel() {
        gameState = new StandingState();
    }

    //Getter and setters for X
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    //Getter and setter for GameState
    public void setGameState(GameState gameState) throws IOException {
        this.gameState = gameState;
        notifyObservers();
    }

    public GameState getGameState() {
        return gameState;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() throws IOException {
        for (Observer observer : observers)
            observer.updateView();

    }
}