package com.company;

import javax.swing.*;
import java.awt.*;

public class title extends JLabel {
    title(){
        this.setFont(new Font("Arial", Font.BOLD, 40));
        this.setPreferredSize(new Dimension(600,100));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setForeground(Color.WHITE);
        this.setBackground(Color.GRAY);
        this.setText("Kółko i Krzyżyk");
        this.setOpaque(true);
    }
}
