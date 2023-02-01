import javax.swing.*;
import java.awt.*;

class MyJPanel extends JPanel{
    public MyJPanel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, 0, (int) getSize().getWidth(), (int) getSize().getHeight());
        g.setColor(new Color(39, 179, 184));
    }

}
 class Main2 {

    public static void main(String[] args) {

        MyJPanel myp = new MyJPanel();

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame window = new JFrame();
                window.setVisible(true);
                window.setTitle("Moje okno do rysowania");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.add(myp);
                window.pack();
            }
        });

    }
}
