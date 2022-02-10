package com.company;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    myFrame(){
        this.setTitle("Kółko i Krzyżyk");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,700);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.BLACK);

        this.add(new title(), BorderLayout.NORTH);
        this.add(new board(), BorderLayout.CENTER);

        this.setVisible(true);
    }




}
