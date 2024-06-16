package sem6;

import javax.swing.*;
import java.awt.event.*;
//import java.util.Random;

public class Game implements MouseListener{

    JButton btn;
    JLabel lbl;

    Game(){
        JFrame jf = new JFrame("Game");
        lbl = new JLabel();
        btn = new JButton("Click me");
        btn.setBounds(10,10,100,20);
        btn.addMouseListener(this);
        jf.add(btn);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
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
