package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Registration extends JFrame {

    public Registration(){
        //setSize(500, 460);
        setSize(500, 710);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font lableFont = ((new Font("Arial", Font.BOLD,16)));
        Font txtFont = ((new Font("Arial", Font.ITALIC,12)));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(Color.PINK);
        headerpanel.setBounds(5, 5, 490, 60);
        add(headerpanel);

        JLabel headerTxt = new JLabel("Registration form");
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        headerpanel.add(headerTxt);

        //JPanel inputPanel = new JPanel();
        JPanel signup_panel = new JPanel();

        signup_panel.setBackground(new Color(199,227,240));
        signup_panel.setBounds(5, 70, 490, 625);
        //inputPanel.setBounds(5, 70, 490, 425);
        signup_panel.setLayout(null);
        add(signup_panel);

        // Name Field
        JLabel signup_name = new JLabel(("Name : "));
        signup_name.setBounds(130, 5, 100, 25);
        signup_name.setFont(lableFont);
        signup_panel.add(signup_name);


        JTextField tf_signup_name = new JTextField();
        tf_signup_name.setBounds(200, 5, 200, 25);
        tf_signup_name.setFont(txtFont);
        signup_panel.add(tf_signup_name);

        //EmailFirld
        JLabel signup_email = new JLabel("Email : ");
        signup_email.setBounds(130, 50, 100, 25);
        signup_email.setFont(lableFont);
        signup_panel.add(signup_email);

        JTextField tf_signup_email = new JTextField();
        tf_signup_email.setBounds(200, 50, 200, 25);
        tf_signup_email.setFont(txtFont);
        signup_panel.add(tf_signup_email);

        // User name
        JLabel signup_username = new JLabel("User Name : ");
        signup_username.setBounds(90, 100, 100, 25);
        signup_username.setFont(lableFont);
        signup_panel.add(signup_username);

        JTextField tf_signup_username = new JTextField();
        tf_signup_username.setBounds(200, 100, 200, 25);
        tf_signup_username.setFont(txtFont);
        signup_panel.add(tf_signup_username);


        //Passwords Forld
        JLabel signup_password = new JLabel("Password : ");
        signup_password.setBounds(95, 150, 100, 25);
        signup_password.setFont(lableFont);
        signup_panel.add(signup_password);

        JPasswordField tf_signup_password = new JPasswordField();
        tf_signup_password.setBounds(200, 150, 200, 25);
        //tf_signup_password.setFont(lableFont);
        signup_panel.add(tf_signup_password);


        // ConfirmPassword
        JLabel signup_confirm_password = new JLabel("Confirm Password :");
        signup_confirm_password.setBounds(30, 200, 170, 25);
        signup_confirm_password.setFont(lableFont);
        signup_panel.add(signup_confirm_password);

        JPasswordField tf_signup_confirm_password = new JPasswordField();
        tf_signup_confirm_password.setBounds(200, 200, 200, 25);
        //tf_signup_confirm_password.setFont(lableFont);
        signup_panel.add(tf_signup_confirm_password);

        //Mobile
        JLabel signup_phone = new JLabel("Mobile : ");
        signup_phone.setBounds(120, 250, 100, 25);
        signup_phone.setFont(lableFont);
        signup_panel.add(signup_phone);

        JTextField tf_signup_phone = new JTextField();
        tf_signup_phone.setBounds(200, 250, 200, 25);
        tf_signup_phone.setFont(txtFont);
        signup_panel.add(tf_signup_phone);

        //Address
        JLabel signup_address = new JLabel(("Address : "));
        signup_address.setBounds(110, 300, 100, 25);
        signup_address.setFont(lableFont);
        signup_panel.add(signup_address);

        JTextField tf_signup_address = new JTextField();
        tf_signup_address.setBounds(200, 300, 200, 25);
        tf_signup_address.setFont(txtFont);
        signup_panel.add(tf_signup_address);


        // Profession

        JLabel signup_profession = new JLabel("Profession : ");
        signup_profession.setBounds(90, 350, 100, 25);
        signup_profession.setFont(lableFont);
        signup_panel.add(signup_profession);

        JTextField tf_signup_profession = new JTextField();
        tf_signup_profession.setBounds(200, 350, 200, 25);
        tf_signup_profession.setFont(txtFont);
        signup_panel.add(tf_signup_profession);


        // Institution

        JLabel signup_ins = new JLabel("Institution : ");
        signup_ins.setBounds(95, 400, 100, 25);
        signup_ins.setFont(lableFont);
        signup_panel.add(signup_ins);

        JTextField tf_signup_ins = new JTextField();
        tf_signup_ins.setBounds(200, 400, 200, 25);
        tf_signup_ins.setFont(txtFont);
        signup_panel.add(tf_signup_ins);

        // Education

        JLabel signup_edu = new JLabel("Educational Qualifi. : ");
        signup_edu.setBounds(24, 450, 170, 25);
        signup_edu.setFont(lableFont);
        signup_panel.add(signup_edu);

        JTextField tf_signup_edu = new JTextField();
        tf_signup_edu.setBounds(200, 450, 200, 25);
        tf_signup_edu.setFont(txtFont);
        signup_panel.add(tf_signup_edu);

        // Age
        JLabel signup_age = new JLabel("Age : ");
        signup_age.setBounds(142, 500, 100, 25);
        signup_age.setFont(lableFont);
        signup_panel.add(signup_age);

        JTextField tf_signup_age = new JTextField();
        tf_signup_age.setBounds(200, 500, 200, 25);
        tf_signup_age.setFont(txtFont);
        signup_panel.add(tf_signup_age);

        // Button
        JButton btn_signup = new JButton("Register");
        btn_signup.setBounds(300, 550, 100, 30);
        btn_signup.setBackground(new Color(219, 143, 160));
        btn_signup.setFont(lableFont);
        btn_signup.setForeground(Color.WHITE);
        btn_signup.setBorder(new LineBorder(Color.RED));
        signup_panel.add(btn_signup);


        JButton btn_login = new JButton("Login");
        btn_login.setBounds(100, 550, 100, 30);
        btn_login.setBackground(new Color(93, 161, 217));
        btn_login.setFont(lableFont);
        btn_login.setForeground(Color.WHITE);
        btn_login.setBorder(new LineBorder(Color.BLUE));
        signup_panel.add(btn_login);

        btn_signup.setFocusable(false);
        btn_login.setFocusable(false);
        setVisible(true);


        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login();
            }
        });

        btn_signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //dispose();

                String name = tf_signup_name.getText();
                String email = tf_signup_email.getText();
                String uname = tf_signup_username.getText();
                String p1 = String.valueOf(tf_signup_password.getPassword());
                String p2 = String.valueOf(tf_signup_confirm_password.getPassword());
                String phone = tf_signup_phone.getText();
                String address = tf_signup_address.getText();
                String profession = tf_signup_profession.getText();
                String institution = tf_signup_ins.getText();
                String education = tf_signup_edu.getText();
                String age = tf_signup_age.getText();

                ConnectionProvider db = new ConnectionProvider();
                String queryinsert = "INSERT INTO `member`(`name`, `email`, `uname`, `pass`, `cpass`, `phone`, `address`, `profession`, `institution`, `education`, `age`) VALUES ('"+name+"','"+email+"','"+uname+"','"+p1+"','"+p2+"','"+phone+"','"+address+"','"+profession+"','"+institution+"','"+education+"','"+age+"')";


                db.RegisterInsert(queryinsert);
            }
        });



    }
}
