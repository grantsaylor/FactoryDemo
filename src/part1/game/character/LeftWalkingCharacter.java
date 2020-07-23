package part1.game.character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LeftWalkingCharacter implements Character {

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Color getColor() {
        return null;
    }

    public BufferedImage getImage() throws IOException {
        return ImageIO.read(new File("leftwalking.png"));
    }
}
