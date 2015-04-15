/*
    Assignment 2
    Ship.java 
    Aaron Toran
    CIS 260
    2015-01-20
    Abstract class  with constructors for x and y cords for use with alienship variants
*/
import java.awt.Graphics;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public abstract class Ship implements Drawable{
    protected  int x,y;
    public abstract  void  draw(Graphics g);//signature
    //Methods to set x and y
    public  void setX(int xnum){
        if (xnum > 0){
            x = xnum;
        }else{
            x  = 0;
        }
    }
    // sets y cordiate gets called by the alien ship classes
    public void setY(int ynum){
        if (ynum  > 0){
            y = ynum;
        }else{
            y = 0;
        }
    }
}