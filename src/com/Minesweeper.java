package src.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;

public class Minesweeper extends JFrame {

    private JLabel statusbar;

    public Minesweeper() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.NORTH);

        add(new Board(statusbar));

        setResizable(false);
        pack();

        setTitle("Advanced Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Minesweeper ex = new Minesweeper();
            ex.setVisible(true);
        });
    }
}
