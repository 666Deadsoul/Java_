package lab;
import javax.swing.*;
import java.awt.*;

//Qno2
public class Registration {
    JFrame f;
    JLabel lbl, lbl2, lbl3, lbl4;
    JTextField tf1, tf2, tf3, tf4;
    JButton btn;
    Registration(){
        f = new JFrame("Registration");
        f.setSize(500,500);

        lbl= new JLabel("First Name:");
        lbl.setBounds(50, 50, 100,20);
        f.add(lbl);
        tf1 = new JTextField();
        tf1.setBounds(160, 50, 100 ,20);
        f.add(tf1);

        lbl2= new JLabel("Last Name:");
        lbl2.setBounds(50, 120, 100,20);
        f.add(lbl2);
        tf2 = new JTextField();
        tf2.setBounds(160, 120, 100 ,20);
        f.add(tf2);

        lbl3= new JLabel("Username:");
        lbl3.setBounds(50, 140, 100,20);
        f.add(lbl3);
        tf3 = new JTextField();
        tf3.setBounds(160, 140, 100 ,20);
        f.add(tf3);

        lbl4= new JLabel("Password:");
        lbl4.setBounds(50, 180, 100,20);
        f.add(lbl4);
        tf4 = new JTextField();
        tf4.setBounds(160, 180, 100 ,20);
        f.add(tf4);

        btn = new JButton("Submit");
        btn.setBounds(100, 200,50,20);
        f.add(btn);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args) {
        new Registration();
    }
}
