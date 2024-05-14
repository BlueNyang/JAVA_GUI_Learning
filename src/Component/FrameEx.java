package Component;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameEx {
    public static void main(String[] args) {
        Frame f = new Frame("test");

        f.setSize(300, 300);

        //f.setLocationRelativeTo(null);
        Dimension d = f.getToolkit().getScreenSize();
        int x = (int) (d.getWidth() - f.getWidth()) / 2;
        int y = (int) (d.getHeight() - f.getHeight()) / 2;
        f.setLocation(x, y);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
