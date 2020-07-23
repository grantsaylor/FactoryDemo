package part1.game.character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JumpingCharacter implements Character {

    @Override
    public int getWidth() {
        return 60;
    }

    @Override
    public int getHeight() {
        return 60;
    }

    @Override
    public String getName() {
        return "jumping";
    }

    @Override
    public Color getColor() {
        return Color.orange;
    }

    public BufferedImage getImage() throws IOException {
        return ImageIO.read(new File("jumping.png"));
    }
}
