package src.com;

import java.awt.*;
import javax.swing.*;

public class Minesweeper extends JFrame {

    private JLabel statusbar;
    private JLabel statusbar_timer;

    public MainMenu menu;

    public Minesweeper(int difficulty, int gameMode, int colorMode, int timeSetting) {
        initUI(difficulty, gameMode, colorMode, timeSetting);
    }

    private void initUI(int difficulty, int gameMode, int colorMode, int timeSetting) {

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.NORTH);

        statusbar_timer = new JLabel("");
        add(statusbar_timer, BorderLayout.SOUTH);

        add(new Board(statusbar, statusbar_timer, difficulty, gameMode, colorMode, timeSetting));

        setResizable(false);
        pack();

        setTitle("Advanced Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {

        new MainMenu();

        //EventQueue.invokeLater(() -> {



            //Minesweeper ex = new Minesweeper();
            //ex.setVisible(true);
        //});
    }
}
