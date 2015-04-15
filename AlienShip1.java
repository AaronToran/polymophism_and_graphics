/*
    Assignment 2
    AlienShip1.java
    Aaron Toran
    CIS 260
    2015-01-20
    Creates the 1st type of alien ship with a graphic object
*/
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class AlienShip1 extends Ship implements Drawable{
    final private int height = 30;
    final private  int width = 60;
    final private Color GREEN = new Color(0, 255, 0);
    int xCord ,yCord ;
    // constructor used to set x and y for alienship graphic objects uses Ship class
    public  AlienShip1(int xCord, int yCord){
        setX(xCord);
        setY(yCord);
    }
       
    //overrides drawable interface create ship graphic objects
    @Override//checks to see if it is overriding something if not it complains
    public void draw(Graphics g)  {
        g.setColor(GREEN);
        g.drawRect(x  ,y , width,  height);
    }
}