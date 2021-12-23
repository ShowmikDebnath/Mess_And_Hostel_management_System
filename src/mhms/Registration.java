package mhms;
import java.awt.*;
import javax.swing.*;
public class Registration extends JFrame {
    public Registration()
    {
        JPanel p1panel = new JPanel();              // all component
        JButton login_button = new JButton("Log in");
        JButton signin_button = new JButton("Sign in");

        p1panel.setBounds(2,2,200,200);     // all setBounds
        login_button.setBounds(2,2,40,50);
        signin_button.setBounds(2,2,40,50);

        p1panel.setBackground(Color.red);               // setBackground
        login_button.setBackground(Color.blue);
        signin_button.setBackground(Color.CYAN);


        p1panel.add(login_button,BorderLayout.CENTER);
        p1panel.add(signin_button);

        //p1panel.setLayout(new FlowLayout());

        add(p1panel);

        setSize(900,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
    }
}
