package sem6;
import java.awt.event.*;
import javax.swing.*;

public class Login implements ActionListener {
    JLabel msg;
    JButton btn;
    JTextField tf1;
    JTextField tf2;

    Login(){
        JFrame f = new JFrame("Login");

         msg= new JLabel();

        JLabel lbl1 = new JLabel("Username: ");
        lbl1.setBounds(10,20,100,20);
        f.add(lbl1);

        tf1 = new JTextField();
        tf1.setBounds(120, 20, 100,20);
        f.add(tf1);

        JLabel lbl2 = new JLabel("Password: ");
        lbl2.setBounds(10,60,100,20);
        f.add(lbl2);

         tf2 = new JTextField();
        tf2.setBounds(120,60,100,20);
        f.add(tf2);

        btn = new JButton("Submit");
        btn.setBounds(50,100,100,20);
        btn.addActionListener(this);
        f.add(btn);

        msg.setBounds(50, 140, 200, 20);
        msg.setVisible(false);
        f.add(msg);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }

    public void actionPerformed(ActionEvent e){
        msg.setVisible(true);
        if (tf1.getText().equals("Sarina") && tf2.getText().equals("Pass")) {
            msg.setText("Successfully Login");
        }
        else{
            msg.setText("Failed to login");
        }
    }
}
