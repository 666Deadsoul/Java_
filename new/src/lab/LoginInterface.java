package lab;

import javax.swing.*;
import java.awt.event.*;

//Qno1
public class LoginInterface implements ActionListener {
    JFrame f;
    JTextField tx1, tx2;
    JLabel lbl1, lbl2, msg;
    JButton btn;
    LoginInterface(){
        f = new JFrame("Login");
        f.setSize(500,500);

        lbl1 = new JLabel("Username");
        lbl1.setBounds(50,50,100,20);
        f.add(lbl1);

        msg = new JLabel();
        msg.setBounds(80, 180, 200, 20);
        msg.setVisible(false);
        f.add(msg);

        tx1 = new JTextField();
        tx1.setBounds(120,50,100,20);
        f.add(tx1);

        lbl2 = new JLabel("Password");
        lbl2.setBounds(50, 100, 100, 20);
        f.add(lbl2);

        tx2 = new JTextField();
        tx2.setBounds(120,100,100,20);
        f.add(tx2);

        btn = new JButton("Login");
        btn.setBounds(100, 150, 100, 20);
        btn.addActionListener(this);
        f.add(btn);

        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new LoginInterface();
    }
    public void actionPerformed(ActionEvent e){
        msg.setVisible(true);
        if (tx1.getText().equals("Sarina") && tx2.getText().equals("Pass")) {
            msg.setText("Successfully Login");
        }
        else{
            msg.setText("Failed to login");
        }
    }
}
