
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Main extends JFrame {

    private JLabel statusbar;

    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }


    private static void initUI() {
        JFrame f = new JFrame("testing");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        int columns = 3;
        int rows = 3;
        JFrame arrayF = new JFrame("Testing my array");
        int[][] grid = new int[3][3];
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = value;
            }
        }
//        JLabel statusbar = new JLabel("arrays of rows and columns");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 1 Marked");
                grid[0][0] = 1;

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 2 Marked");
                grid[0][1] = 1;
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 3 Marked");
                grid[0][2] = 1;
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 4 Marked");
                grid[1][0] = 1;
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 5 Marked");
                grid[1][1] = 1;
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 6 Marked");
                grid[1][2] = 1;
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 7 Marked");
                grid[2][0] = 1;
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 8 Marked");
                grid[2][1] =1;
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("Button 9 Marked");
                grid[2][2] = 1;
            }
        });



//        f.add(statusbar, BorderLayout.SOUTH);
            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(b4);
            f.add(b5);
            f.add(b6);
            f.add(b7);
            f.add(b8);
            f.add(b9);
            f.setLayout(new GridLayout(3, 3));
            f.setSize(640, 480);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    print2D(grid);
                }
            });
        }
        public static void main(String[] args)
        {
           initUI();
        }

}