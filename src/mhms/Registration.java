package mhms;
import java.sql.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Registration extends JFrame implements ActionListener{

    JFrame frame;
    JPanel signup_panel, front, registration;
    JPanel login_panel;
    JLabel signup_username, welcome, signup_email, signup_password, signup_confirm_password, signup_name, signup_phone;
    JLabel login_email, login_password;
    JTextField tf_signup_username, tf_signup_email, tf_login_email, tf_signup_name;
    JPasswordField tf_signup_password, tf_signup_confirm_password, tf_login_password;;
    JButton btn_signup, btn_login, login, signup;
    Boolean isLogined;
    public Registration()
    {
        frame = new JFrame();
        signup_panel = new JPanel();
        front = new JPanel();
        registration = new JPanel();
        login_panel = new JPanel();


        welcome = new JLabel("Welcome to Mess & Hostel Management System");


        signup_name = new JLabel("Name: ");
        signup_name.setBounds(10, 60, 120, 30);
        tf_signup_name = new JTextField();


        signup_username = new JLabel("User Name : ");
        signup_username.setBounds(10, 100, 120, 30);
        tf_signup_username = new JTextField();
        tf_signup_username.setBounds(180, 100, 120, 30);



        signup_email = new JLabel("Email : ");
        signup_email.setBounds(10, 140, 120, 30);
        tf_signup_email = new JTextField();
        tf_signup_email.setBounds(180, 140, 120, 30);


        signup_password = new JLabel("Password : ");
        signup_password.setBounds(10, 180, 120, 30);
        tf_signup_password = new JPasswordField();
        tf_signup_password.setBounds(180, 180, 120, 30);


        signup_confirm_password = new JLabel("Confirm Password : ");
        signup_confirm_password.setBounds(10, 220, 180, 30);
        tf_signup_confirm_password = new JPasswordField();
        tf_signup_confirm_password.setBounds(180, 220, 120, 30);

        signup_phone = new JLabel("Phone: ");

        btn_signup = new JButton("Register");
        btn_signup.setBounds(180, 600, 120, 40);




        signup = new JButton("Sign Up");
        login = new JButton("Login");

        login_email = new JLabel("Email:");
        login_password = new JLabel("Password :");
        tf_login_email = new JTextField();
        tf_login_password = new JPasswordField();
        btn_login = new JButton("Login");


        signup_username.setBounds(10, 100, 120, 30);







        //btn_signup.setBounds(180, 300, 80, 40);

        login_email.setBounds(10, 100, 120, 30);
        login_password.setBounds(10, 140, 120, 30);
        //tf_signup_username.setBounds(80, 100, 120, 30);
        tf_login_email.setBounds(80, 100, 120, 30);
        tf_login_password.setBounds(80, 140, 120, 30);
        btn_login.setBounds(100, 220, 80, 40);

        login.setBounds(200, 400, 80, 40);
        signup.setBounds(400, 400, 80, 40);
        login.setForeground(Color.blue);
        signup.setForeground(Color.blue);
        welcome.setBounds(90, 50, 700, 200);
        welcome.setFont(new Font("Jokerman", Font.PLAIN, 26));
        welcome.setForeground(Color.BLUE);
        registration.add(welcome);
        registration.add(login);
        registration.add(signup);

        signup_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "SIGN UP FORM", TitledBorder.CENTER, TitledBorder.TOP));
        login_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LOGIN FORM", TitledBorder.CENTER, TitledBorder.TOP));

        signup_panel.add(signup_name);
        signup_panel.add(signup_username);
        signup_panel.add(tf_signup_username);
        signup_panel.add(signup_email);
        signup_panel.add(tf_signup_email);
        signup_panel.add(signup_password);
        signup_panel.add(tf_signup_password);
        signup_panel.add(signup_confirm_password);
        signup_panel.add(tf_signup_confirm_password);
        signup_panel.add(btn_signup);
        login_panel.add(login_email);
        login_panel.add(login_password);
        login_panel.add(tf_login_email);
        login_panel.add(tf_login_password);
        login_panel.add(btn_login);

        signup_panel.setLayout(null);
        login_panel.setLayout(null);
        registration.setLayout(null);
        front.setLayout(null);
        front.setBackground(Color.BLUE);

        frame.add(front);
        frame.add(registration);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(1, 2));
        frame.setTitle("Welcome Page");

        frame.setVisible(true);

        //String UserName = tf_signup_username.getText();

        btn_signup.addActionListener(this);
        btn_login.addActionListener(this);
        login.addActionListener(this);
        signup.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signup) {
            JInternalFrame f = new JInternalFrame();
            f.add(signup_panel);
            f.setSize(600, 800);
            f.setTitle("Signup Form");
            //f.setClosable(true);
            //signup.disable();

            front.add(f);
            f.setVisible(true);

        }
        if (e.getSource() == login) {
            JInternalFrame f = new JInternalFrame();
            f.add(login_panel);
            f.setSize(600, 800);
            f.setTitle("Login Form");
            //f.setClosable(true);
            //login.disable();
            front.add(f);
            f.setVisible(true);

        }
        if (e.getSource() == btn_signup) {

            SignUp();
        }

        if (e.getSource() == btn_login) {

            Login();

        }
    }

    private void SignUp() {
        int x = 0;
        Connection con = ConnectionProvider.getConnection();
        String Username = tf_signup_username.getText();
        String Email = tf_signup_email.getText();
        char[] p1 = tf_signup_password.getPassword();
        String Password = new String(p1);
        char[] p2 = tf_signup_confirm_password.getPassword();
        String Confirm_password = new String(p2);

        if(Confirm_password.equals(Password)){
            try {
                PreparedStatement ps = con.prepareStatement("insert into member(username,email,password) values(?,?,?)");
                ps.setString(1, Username);
                ps.setString(2, Email);
                ps.setString(3, Password);
                ps.executeUpdate();
                x++;
                if (x > 0) {
                    JOptionPane.showMessageDialog(btn_signup, "Data Saved Successfully");
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }else {
            JOptionPane.showMessageDialog(btn_signup, "Password Does Not Match");
        }
    }
    private void Login() {

    }
}