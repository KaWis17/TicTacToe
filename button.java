package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class button extends JButton {

    static boolean playerX = lottery();
    static int counter = 0;
    boolean takenByX = false;
    boolean takenByO = false;

    button(){
        this.addActionListener(e -> click());
        this.setFont(new Font("Arial", Font.BOLD, 50));
        this.setFocusable(false);
    }

    private void click(){
        if(playerX){
            this.setText("X");
            playerX = false;
            this.setEnabled(false);
            takenByX = true;
        }
        else{
            this.setText("O");
            playerX = true;
            this.setEnabled(false);
            takenByO = true;
        }
        counter++;
        check();
    }

    public static boolean lottery(){
        Random random = new Random();
        int number = random.nextInt(2);
        return number == 1;
    }


    private void check(){
        int[][] list = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int i=0; i<8; i++){
            if(     (board.buttons[list[i][0]].takenByX && board.buttons[list[i][1]].takenByX && board.buttons[list[i][2]].takenByX)||
                    (board.buttons[list[i][0]].takenByO && board.buttons[list[i][1]].takenByO && board.buttons[list[i][2]].takenByO)){
                for(int j=0; j<3; j++){
                    board.buttons[list[i][j]].setBackground(Color.green);
                }
                for(int j=0; j<9; j++){
                    board.buttons[j].setEnabled(false);
                }
            }
        }
        if(counter == 9){
            for(int i=0; i<9; i++){
                board.buttons[i].setBackground(Color.red);
            }
        }
    }

}
