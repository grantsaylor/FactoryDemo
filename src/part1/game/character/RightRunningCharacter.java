package part1.game.character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RightRunningCharacter implements Character {

    @Override
    public int getWidth() {
        return 599;
    }

    @Override
    public int getHeight() {
        return 592;
    }

    @Override
    public String getName() {
        return "righrunning";
    }

    @Override
    public Color getColor() {
        return Color.red;
    }

    public BufferedImage getImage() throws IOException {
        return ImageIO.read(new File("rightrunning.png"));
    }
}
