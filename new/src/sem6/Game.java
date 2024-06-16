package sem6;

import javax.swing.*;
import java.awt.event.*;
//import java.util.Random;

public class Game implements MouseListener{

    JButton btn;
    JLabel lbl;

    Game(){
        JFrame jf = new JFrame("Game");            //creating frame with title
        lbl = new JLabel();                              //creating object of label
        btn = new JButton("Click me");              //creating object for button with btn title
        btn.setBounds(10,10,100,20);    //setting the position and size of component
        btn.addMouseListener(this);                      //implementing eventlistner for button
        jf.add(btn);                                     // adding component to the frame
        jf.setSize(500,500);                //setting the size of the frame
        jf.setLayout(null);                      //setting the layout of the frame
        jf.setVisible(true);                           // to show the component in frame
        lbl.setBounds(40,50,100,20);
        jf.add(lbl);
    }
    public static void main(String[] args) {
        new Game();
    }
    public void mouseClicked(MouseEvent e){ //when clicked
        //lbl.setText("you clicked me");
    }
    public void mouseExited(MouseEvent e){ //when it is no more inside components boundary
        //lbl.setText("you clicked me");
    }
    public void mouseReleased(MouseEvent e){ //when click released
        //lbl.setText("you clicked me");
    }
    public void mousePressed(MouseEvent e){ //when clicked but once released changes
        //lbl.setText(" clicked me");
    }
    public void mouseEntered(MouseEvent e){ //when it reached inside components boundary
        lbl.setText("you clicked me");
        // Random r = new Random();
        // int x=r.nextInt(400);
        // int y= r.nextInt(400);
        // btn.setBounds(x,y,100,20);
    }

}
