/*
    TestPoly.java
    Dave Klick
    CIS 260
    2015-01-17
    
    This program display varied shapes on the screen
    randomly. It is not finished and relies on several
    missing classes.
*/

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

public class TestPoly extends JFrame implements ActionListener {
    private final static int height = 400;
    private final static int width = 400;
    private final static int numberOfAliens = 15;
    ArrayList<Ship> list = new ArrayList<Ship>(); //object array for alienships
    /**************************************************************************/
    private JPanel panel = null;
    
    public static void main(String[] args) {
        new TestPoly();
    }
    
    public TestPoly() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private void createList() {
        Random randNum = new Random();
        int w = panel.getWidth();
        int h = panel.getHeight();
        list.clear();
        System.gc();
        for(int i = 0; i< numberOfAliens; i++){
            //Getting random numbers for x and y getting random for shipType
            int x = randNum.nextInt((w-30) + 1);
            int y = randNum.nextInt((h-90)+ 1);            
            int shipType = randNum.nextInt((2 - 1) + 1) + 1;
            //creating ship objects
            if(shipType < 2){
                
                AlienShip1  MotherShipSend1 = new AlienShip1(x,y);               
                list.add(MotherShipSend1);
                
            }else{
                AlienShip2 MotherShipSend2 = new AlienShip2(x, y);
                list.add(MotherShipSend2);
            }
        }
        // ***** You must implement this method. See the assignment notes. *****
    }
    
    private void createAndShowGUI() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        panel = new JPanel();
        c.add(panel, BorderLayout.CENTER);
        JButton btn = new JButton("Display aliens");
        c.add(btn, BorderLayout.SOUTH);
        btn.addActionListener(this);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        Graphics g = panel.getGraphics();
        g.setColor(panel.getBackground());
        g.fillRect(0, 0, width, height);
        createList();
        for (Ship s : list) s.draw(g);
    }
}
