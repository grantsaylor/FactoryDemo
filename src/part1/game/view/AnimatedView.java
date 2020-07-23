package part1.game.view;

/*
AUTHOR: GRANT ROBERT SAYLOR
ASSIGNMENT: ASSIGNMENT 3 PART 2
DATE: 7/17/2020
 */

import part1.game.character.Character;
import part1.game.character.CharacterFactory;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;

//AnimatedView for the program
public class AnimatedView extends JFrame implements GameView {

    //Our avatar
    private JLabel stateLbl = new JLabel();
    private CharacterFactory characterFactory;
    private Character currentCharacter;
    boolean playCompleted;


    //Create the frame
    public AnimatedView() {
        music();
        characterFactory = new CharacterFactory();
        setLayout(new GridLayout(1, 1));
        add(stateLbl);
        setTitle("Animated View");
        getContentPane().setBackground(Color.white);
        setPreferredSize(new Dimension(1080, 1050));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);

        try {
            setIconImage(ImageIO.read(new File("icon.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pack();
    }

    @Override
    public void setX(int x) {

    }


    //Fill the label with the current avatar state and move it around the screen
    @Override
    public void setState(String state) throws IOException {
        Point currentLocation = stateLbl.getLocation();
        currentCharacter = characterFactory.createCharacter(state);
        switch (state) {
            case "leftwalking":
                BufferedImage walk = ImageIO.read(new File("leftwalking.png"));
                stateLbl.setIcon(new ImageIcon(walk));
                stateLbl.setLocation(currentLocation.x - 10, currentLocation.y);
                break;
            case "rightwalking":
                BufferedImage rwalk = ImageIO.read(new File("rightwalking.png"));
                stateLbl.setIcon(new ImageIcon(rwalk));
                stateLbl.setLocation(currentLocation.x + 10, currentLocation.y);
                break;
            case "rightcrabwalking":
                BufferedImage rcrab = ImageIO.read(new File("crabwalking.png"));
                stateLbl.setIcon(new ImageIcon(rcrab));
                stateLbl.setLocation(currentLocation.x + 5, currentLocation.y);
                break;
            case "leftcrabwalking":
                BufferedImage crab = ImageIO.read(new File("crabwalking.png"));
                stateLbl.setIcon(new ImageIcon(crab));
                stateLbl.setLocation(currentLocation.x - 5, currentLocation.y);
                break;
            case "leftcrawling":
                BufferedImage crawl = ImageIO.read(new File("leftcrawling.png"));
                stateLbl.setIcon(new ImageIcon(crawl));
                stateLbl.setLocation(currentLocation.x - 2, currentLocation.y);
                break;
            case "rightcrawling":
                BufferedImage rcrawl = ImageIO.read(new File("rightcrawling.png"));
                stateLbl.setIcon(new ImageIcon(rcrawl));
                stateLbl.setLocation(currentLocation.x + 2, currentLocation.y);
                break;
            case "rightrunning":
                BufferedImage rrun = ImageIO.read(new File("rightrunning.png"));
                stateLbl.setIcon(new ImageIcon(rrun));
                stateLbl.setLocation(currentLocation.x + 30, currentLocation.y);
                break;
            case "leftrunning":
                BufferedImage run = ImageIO.read(new File("leftrunning.png"));
                stateLbl.setIcon(new ImageIcon(run));
                stateLbl.setLocation(currentLocation.x - 30, currentLocation.y);
                break;
            case "sitting":
                BufferedImage sit = ImageIO.read(new File("sitting.png"));
                stateLbl.setIcon(new ImageIcon(sit));
                stateLbl.setLocation(currentLocation.x, currentLocation.y);
                break;
            case "standing":
                BufferedImage stand = ImageIO.read(new File("standing.png"));
                stateLbl.setIcon(new ImageIcon(stand));
                stateLbl.setLocation(currentLocation.x, currentLocation.y);
                break;
            case "jumping":
                BufferedImage jump = ImageIO.read(new File("jumping.png"));
                stateLbl.setIcon(new ImageIcon(jump));
                stateLbl.setLocation(currentLocation.x, currentLocation.y);
                break;


        }
    }

    public void music() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Lady Gaga - Babylon (Audio).wav"));//use wav. mp3 doesn't work
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            clip.loop(10);
        }
        catch(UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            System.out.println(uae);
        }
    }

    //Action Listener
    @Override
    public void addGameKeyListener(KeyListener listener) {
        addKeyListener(listener);
    }

}