/*
    Assignment 2
    AlienShip2java
    Aaron Toran
    CIS 260
    2015-01-20
    Creates the 2nd type of alien ship with a graphic object
*/
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class AlienShip2 extends Ship implements Drawable{
    final private  int height = 15;
    final private int width = 45;
    final private Color PINK = new Color(255,20,147);
    int xCord ,yCord ;
    // constructor used to set x and y for alienship graphic objects uses Ship class
    public  AlienShip2(int xCord, int yCord){
        setX(xCord);
        setY(yCord);
    }
    //overrides drawable interface create ship graphic objects
    @Override//checks to see if it is overriding something if not it complains
    public void draw(Graphics g)  {
        g.setColor(PINK);
        g.drawOval(x, y, width,  height);
       
    }
}