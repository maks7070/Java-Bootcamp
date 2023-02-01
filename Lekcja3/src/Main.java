import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {

    int x = 50;
    int y = 50;
    int dx = 1;
    int dy = 2;
    int srednica = 50;
    Color kolor = Color.RED;
    public Dimension getPreferredSize() {
        return new Dimension(1000, 500);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(kolor);
        g.fillOval(x, y,srednica , srednica);

    }

    public void animacja() {

        boolean b = true;

        while (b) {

            if(x <= 0 || (x + srednica) >= getWidth()) {
                dx = -dx;
                kolor = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            }
            if(y <= 0 || (y + srednica) >= getHeight()) {
                dy = -dy;
                kolor = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            }
            x += dx;
            y += dy;

// System.out.println(getHeight());
// System.out.println(getWidth());
// Math.cos
// int a = Math.abs(-5);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main pilka = new Main();
        window.add(pilka);
        window.setVisible(true);
        window.pack();

        pilka.animacja();

    }
}

