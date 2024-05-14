package Component;

import java.awt.*;

public class PanelEx extends Frame{
    Label lab, lab2;
    TextField tf, tf2;
    Button btn;

    Panel p1, p2;

    public PanelEx(){
        super("Panel Test");

        setSize(400, 500);
        setLocationRelativeTo(null);


        setLayout(new FlowLayout());

        p1 = new Panel();
        add(p1);
        p1.setBackground(Color.cyan);

        lab = new Label("ID");
        p1.add(lab);

        tf = new TextField(20);
        p1.add(tf);

        btn = new Button("OK");
        p1.add(btn);

        p2 = new Panel();
        add(p2);
        p2.setBackground(Color.orange);

        lab2 = new Label("Password");
        p2.add(lab2);

        tf2 = new TextField(20);
        p2.add(tf2);


    }

    public static void main(String[] args){
        PanelEx f = new PanelEx();
        f.setVisible(true);
    }
}
