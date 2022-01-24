package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login(){
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Arial", Font.BOLD, 16)));
        Font txtFont = ((new Font("Arial", Font.ITALIC, 12)));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(new Color(93, 161, 217));
        headerpanel.setBounds(5, 5, 490, 60);

        JLabel headerTxt = new JLabel(("LoginFrom"));
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        headerpanel.add(headerTxt);
        add(headerpanel);

        JPanel login_panel = new JPanel();
        login_panel.setBackground(new Color(190, 227, 240));
        login_panel.setBounds(5, 70, 490, 425);
        login_panel.setLayout(null);
        add(login_panel);

        JLabel namelabel = new JLabel("UserName : ");
        namelabel.setBounds(80, 25, 100, 25);
        namelabel.setFont(labelFont);
        login_panel.add(namelabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200, 25, 200, 25);
        nameTxt.setFont(txtFont);
        login_panel.add(nameTxt);

        JLabel passlabel = new JLabel("Password : ");
        passlabel.setBounds(80, 70, 100, 25);
        passlabel.setFont(labelFont);
        login_panel.add(passlabel);

        JPasswordField passTxt = new JPasswordField();
        passTxt.setBounds(200, 70, 200, 25);
        //passTxt.setFont(labelFont);
        login_panel.add(passTxt);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(300, 120, 100, 30);
        loginBtn.setBackground(new Color(93, 161, 217));
        loginBtn.setFont(labelFont);
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setBorder(new LineBorder(Color.BLUE));
        login_panel.add(loginBtn);

        loginBtn.setFocusable(false);


        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(100, 120, 100, 30);
        registerBtn.setBackground(new Color(219, 143, 160));
        registerBtn.setFont(labelFont);
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setBorder(new LineBorder((Color.RED)));
        login_panel.add(registerBtn);

        registerBtn.setFocusable(false);

        setVisible(true);

        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Registration();
            }
        });

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Login_uname = nameTxt.getText();
                String Login_pass = String.valueOf(passTxt.getPassword());

                if(Login_uname.equals("admin")&&Login_pass.equals("12345")){
                    //System.out.println("Admin");
                    dispose();
                    new Admin();
                }
                else{
                    ConnectionProvider db = new ConnectionProvider();
                    String queryLogin = "SELECT * FROM `member` WHERE uname='"+Login_uname+"'";
                    try {
                        db.Login(queryLogin, Login_uname, Login_pass);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });
    }
}
