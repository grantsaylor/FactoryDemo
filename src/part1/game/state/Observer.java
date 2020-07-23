package part1.game.state;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 3 PART 2
DATE: 7/17/2020
 */


import java.io.IOException;

public interface Observer {
    void updateView() throws IOException;
}
