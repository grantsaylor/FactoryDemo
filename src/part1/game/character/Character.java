package part1.game.character;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public interface Character {
    public int getWidth();
    public int getHeight();
    public String getName();
    public Color getColor();
    public BufferedImage getImage() throws IOException;

}
