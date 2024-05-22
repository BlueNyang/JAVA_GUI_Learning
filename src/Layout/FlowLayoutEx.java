package Layout;

import java.awt.*;

public class FlowLayoutEx extends Frame {

    //Button btn1, btn2, btn3, btn4, btn5;
    Button btn[];

    public FlowLayoutEx(){
        super("FlowLayout Test");
        setSize(600, 400);

        FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 30, 40);
        setLayout(f);

        btn = new Button[5];
        for(int i = 0; i < btn.length; i++){
            btn[i] = new Button("Btn" + (i + 1));
            add(btn[i]);
        }

    }

    public static void main(String[] args) {
        new FlowLayoutEx().setVisible(true);
    }
}
