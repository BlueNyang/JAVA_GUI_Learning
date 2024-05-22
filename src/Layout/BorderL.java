package Layout;

import java.awt.*;

public class BorderL extends Frame {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    Panel p;

    BorderL(){
        super("BorderLayout Test");
        BorderLayout bl = new BorderLayout(10, 20);
        setLayout(bl);

        setSize(600, 400);
        setLocationRelativeTo(null);

        p = new Panel();


        btn1 = new Button("btn1");
        btn2 = new Button("btn2");
        btn3 = new Button("btn3");
        btn4 = new Button("btn4");
        btn5 = new Button("btn5");
        btn6 = new Button("btn6");

        p.add(btn1);
        p.add(btn6);
        p.setBackground(Color.yellow);

        add(p, "North");
        add(btn2, BorderLayout.EAST);
        add(btn3, "West");
        add(btn4, "South");
        add(btn5, "Center");
    }

    public Insets getInsets(){
        return new Insets(50, 50, 50, 50);
    }

    public static void main(String[] args){
        BorderL f = new BorderL();
        f.setVisible(true);
    }
}
