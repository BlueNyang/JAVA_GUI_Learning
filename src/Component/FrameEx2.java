package Component;

import java.awt.*;

public class FrameEx2 extends Frame{
    Button btn;
    TextField tf1, tf2, tf3, tf4;
    TextArea ta1, ta2;
    Checkbox ch1, ch2;
    CheckboxGroup cg;
    List list;
    Label lab1, lab2, lab3;
    Choice cho;

    public FrameEx2(){
        super("Component Test");
        setSize(300, 500);

        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setBackground(new Color(0xFF969696));

        btn = new Button("OK");
        //btn.setSize(100, 50);
        //btn.setLocation(50, 50);
        btn.setBackground(Color.blue);
        btn.setForeground(Color.white);
        add(btn);

        tf1 = new TextField();
        add(tf1);
        tf2 = new TextField(20);
        add(tf2);
        tf3 = new TextField("Hello. Nice to meet you.");
        add(tf3);
        tf4 = new TextField("Hello. Nice to meet you.", 30);
        add(tf4);

        //ta1 = new TextArea();
        ta1 = new TextArea(10, 10);
        add(ta1);

        ch1 = new Checkbox("Sports");
        add(ch1);
        ch2 = new Checkbox("Reading", true);
        add(ch2);

        cg = new CheckboxGroup();
        add(new Checkbox("Men", true, cg));
        add(new Checkbox("Women", false, cg));

        lab1 = new Label("Name");
        add(lab1);
        lab1.setBackground(Color.cyan);

        lab2 = new Label("Phone Number", Label.RIGHT);
        lab2.setBackground(Color.gray);
        add(lab2);

        lab3 = new Label("Age", Label.CENTER);
        lab3.setBackground(Color.blue);
        add(lab3);

        list = new List(3, false);
        add(list);
        list.add("DPLUS KIA");
        list.add("Fear X");
        list.add("SPG TALON");
        list.add("SKT T1", 2);

        list.remove(2);

        cho = new Choice();
        add(cho);

        {
            String[] str = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            for(String s : str) {
                cho.add(s);
            }
        }
    }

    public static void main(String[] args) {
        FrameEx2 f = new FrameEx2();
        f.setVisible(true);
    }
}
