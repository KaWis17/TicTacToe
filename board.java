package com.company;

import javax.swing.*;
import java.awt.*;

public class board extends JPanel {

    static button[] buttons = new button[9];

    board(){
        this.setLayout(new GridLayout(3,3));
        for(int i=0; i<9; i++){
            buttons[i] = new button();
            this.add(buttons[i]);
        }
    }

}
