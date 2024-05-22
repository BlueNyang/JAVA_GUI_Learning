package Layout;

import java.awt.*;

public class GridLayoutEx extends Frame {
    Button btn[];

    public GridLayoutEx(){
        super("GridLayout Test");
        setSize(600, 400);

        GridLayout g = new GridLayout(3, 2, 10, 10);
        setLayout(g);

        btn = new Button[5];
        for(int i = 0; i < btn.length; i++){
            btn[i] = new Button("Btn" + (i + 1));
            add(btn[i]);
        }

        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    }

    public Insets getInsets(){
        return new Insets(30, 30, 30, 30);
    }

    public static void main(String[] args) {
        new GridLayoutEx().setVisible(true);
    }
}
