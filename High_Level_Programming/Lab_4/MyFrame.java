package High_Level_Programming.Lab_4;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class MyFrame extends JFrame {

    Player player;
    JPanel panel1, panel2, panel3, panel4;
    JLabel label1, label2, label3, label4;

    private final int WIDTH = 900;
    private final int HEIGHT = 600;

    public MyFrame(){
        Player Steve = new Player("Steve", 20, 10, false);

        this.setTitle("Инвентярь");
        this.setBounds(500, 500, WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1 = new JLabel();
        label1.setText("Имя персонажа: " + Steve.getName());
        label1.setBounds(0, 0, WIDTH/2, 30);

        label2 = new JLabel();
        label2.setText("HP персонажа: " + Steve.getHP());
        label2.setBounds(0, 30, WIDTH/2, 30);

        label3 = new JLabel();
        label3.setText("Сытость персонажа: " + Steve.getSatiety());
        label3.setBounds(0, 60, WIDTH/2, 30);

        label4 = new JLabel();
        label4.setText("Бафф на персонажа: " + (Steve.getBuff()? "Есть": "Нет"));
        label4.setBounds(0, 90, WIDTH/2, 30);

        panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setBounds(0, 0, WIDTH, 150);
        panel1.setBackground(Color.WHITE);

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        this.add(panel1);
    }

}
 