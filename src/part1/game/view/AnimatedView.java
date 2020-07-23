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
    private JPanel northPnl = new JPanel();
    private JLabel stateLbl = new JLabel();
    private CharacterFactory characterFactory;
    private Character currentCharacter;
    private JPanel centerPnl = new JPanel();
    private int x;


    //Create the frame
    public AnimatedView() {
        music();
//        characterFactory = new CharacterFactory();
//        northPnl.add(stateLbl);
//        stateLbl.setFont(new Font("Arial", Font.BOLD, 40));
//        add(northPnl, BorderLayout.NORTH);
//        add(centerPnl, BorderLayout.CENTER);
//        add(stateLbl);
//        setTitle("Animated View");
//        getContentPane().setBackground(Color.white);
//        setPreferredSize(new Dimension(1080, 1050));
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//        setResizable(true);
//
//        try {
//            setIconImage(ImageIO.read(new File("icon.png")));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        pack();
//        setLocationRelativeTo(null);
//
        characterFactory = new CharacterFactory();

        northPnl.add(stateLbl);
        stateLbl.setFont(new Font("Arial", Font.BOLD, 40));
        add(northPnl, BorderLayout.NORTH);
        add(centerPnl, BorderLayout.CENTER);
        setPreferredSize(new Dimension(600,200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    public void setX(int x) {
        this.x = x;
    }


    //Fill the label with the current avatar state and move it around the screen
    public void setState(String state) {
        currentCharacter = characterFactory.createCharacter(state);
        updateView();
    }


    private void updateView() {

        Graphics g = centerPnl.getGraphics();
        g.clearRect(0, 0, centerPnl.getWidth(), centerPnl.getHeight());
        centerPnl.setDoubleBuffered(true);

        try {
            g.drawImage(currentCharacter.getImage(), x, 50, currentCharacter.getWidth(), currentCharacter.getHeight(), this);

        } catch (IOException e) {
            g.setColor(currentCharacter.getColor());
            g.fillRect(x, 50, currentCharacter.getWidth(), currentCharacter.getHeight());
        }


        stateLbl.setText(currentCharacter.getName().toUpperCase());

    }


    public void music() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Lady Gaga - Babylon (Audio).wav"));//use wav. mp3 doesn't work
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            clip.loop(10);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException uae) {
            System.out.println(uae);
        }
    }

    //Action Listener
    public void addGameKeyListener(KeyListener listener) {
        addKeyListener(listener);
    }

}