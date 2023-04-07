package src.com;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
//C:\Users\darkg\Downloads\src\src\resources
public class MainMenu implements ActionListener {

    JFrame frame = new JFrame();

    Icon icon = new ImageIcon("src/resources/MMClassic.png");
    JButton Classic = new JButton(icon);

    Icon icon2 = new ImageIcon("src/resources/MMTime.png");
    JButton Time = new JButton(icon2);

    Icon icon3 = new ImageIcon("src/resources/MMEscal.png");
    JButton Escal = new JButton(icon3);

    Icon icon4 = new ImageIcon("src/resources/MMArms.png");
    JButton Arms = new JButton(icon4);

    JButton Easy = new JButton("Easy Difficulty");
    JButton Medium = new JButton("Medium Difficulty");
    JButton Hard = new JButton("Hard Difficulty");
    JButton Custom = new JButton("Custom Difficulty");
    JButton Light = new JButton("Light mode");
    JButton Dark = new JButton("Dark mode");
    JButton timebutton = new JButton("Time Setting");

    int difficulty = 0;
    int colorMode = 0;
    int timeSetting = 0;
    MainMenu(){
        prepareGUI();

        buttonProperties();

        //classicProperties();
        //timeProperties();
        //escalProperties();
        //armsProperties();
        //EasyProperties();
        //MediumProperties();
        //HardProperties();
        //CustomProperties();
        //LightProperties();
        //DarkProperties();
        //timebuttonProperties();
    }

    public void prepareGUI() {
        frame.setTitle("Advanced Minesweeper");
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setSize(798, 886);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buttonProperties(){

        try { //"src/resources/MMBack.png"
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src/resources/MMBack.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.pack();
        frame.setVisible(true);

        Classic.setBounds(120,240,180,180);
        Time.setBounds(120,540,180,180);
        Escal.setBounds(480,240,180,180);
        Arms.setBounds(480,540,180,180);
        /*Easy.setBounds(200,25,150,40);
        Medium.setBounds(200,75,150,40);
        Hard.setBounds(200,125,150,40);
        Custom.setBounds(200,175,150,40);
        Light.setBounds(25,25,150,40);
        Dark.setBounds(25,75,150,40);
        timebutton.setBounds(25,125,150,40);*/

        frame.add(Classic);
        frame.add(Time);
        frame.add(Escal);
        frame.add(Arms);

        frame.add(Easy);
        frame.add(Medium);
        frame.add(Hard);
        frame.add(Custom);
        frame.add(Light);
        frame.add(Dark);
        frame.add(timebutton);

        Classic.addActionListener(this);
        Time.addActionListener(this);
        Escal.addActionListener(this);
        Arms.addActionListener(this);
        Easy.addActionListener(this);
        Medium.addActionListener(this);
        Hard.addActionListener(this);
        Custom.addActionListener(this);
        Light.addActionListener(this);
        Dark.addActionListener(this);
        timebutton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object button = e.getSource();
        if (button == Easy) {
            difficulty = 0;
        } else if (button == Medium) {
            difficulty = 1;
        } else if (button == Hard) {
            difficulty = 2;
        } else if (button == Custom) {
            difficulty = 3;
        } else if (button == Light) {
            colorMode = 0;
        } else if (button == Dark) {
            colorMode = 1;
        } else if (button == timebutton) {
            timeSetting = 0;
        } else if (button == Classic) {
            Minesweeper ex = new Minesweeper(difficulty, 0, colorMode, 0);
            ex.setVisible(true);
        } else if (button == Time) {
            Minesweeper ex = new Minesweeper(difficulty, 1, colorMode, timeSetting);
            ex.setVisible(true);
        } else if (button == Escal) {
            Minesweeper ex = new Minesweeper(difficulty, 2, colorMode, 0);
            ex.setVisible(true);
        } else if (button == Arms) {
            Minesweeper ex = new Minesweeper(difficulty, 3, colorMode, timeSetting);
            ex.setVisible(true);
        }
    }
}
