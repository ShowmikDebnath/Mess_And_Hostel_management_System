package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class memberserch extends JFrame{

    String str;

    public memberserch(String str){

        this.str = str;

        System.out.println(str);

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

        JLabel headerTxt = new JLabel("Member Information");
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        headerpanel.add(headerTxt);

        //JPanel inputPanel = new JPanel();
        JPanel body_panel = new JPanel();

        body_panel.setBackground(new Color(199,227,240));
        body_panel.setBounds(5, 70, 490, 625);
        //inputPanel.setBounds(5, 70, 490, 425);
        body_panel.setLayout(null);
        add(body_panel);

        // Name Field
        JLabel name = new JLabel(("Name : "));
        name.setBounds(130, 5, 100, 25);
        name.setFont(lableFont);
        body_panel.add(name);


        JTextField tf_name = new JTextField();
        tf_name.setBounds(200, 5, 200, 25);
        tf_name.setFont(txtFont);
        body_panel.add(tf_name);

        //EmailFirld
        JLabel email = new JLabel("Email : ");
        email.setBounds(130, 50, 100, 25);
        email.setFont(lableFont);
        body_panel.add(email);

        JTextField tf_email = new JTextField();
        tf_email.setBounds(200, 50, 200, 25);
        tf_email.setFont(txtFont);
        body_panel.add(tf_email);

        // User name
        JLabel username = new JLabel("User Name : ");
        username.setBounds(90, 100, 100, 25);
        username.setFont(lableFont);
        body_panel.add(username);

        JTextField tf_username = new JTextField();
        tf_username.setBounds(200, 100, 200, 25);
        tf_username.setFont(txtFont);
        body_panel.add(tf_username);


        //Passwords Forld
        JLabel mobile = new JLabel("Mobile : ");
        mobile.setBounds(120, 150, 100, 25);
        mobile.setFont(lableFont);
        body_panel.add(mobile);

        JTextField tf_mobile = new JTextField();
        tf_mobile.setBounds(200, 150, 200, 25);
        //tf_mobile.setFont(lableFont);
        tf_mobile.setFont(txtFont);
        body_panel.add(tf_mobile);


        // ConfirmPassword
        JLabel address = new JLabel("Address :");
        address.setBounds(110, 200, 170, 25);
        address.setFont(lableFont);
        body_panel.add(address);

        JTextField tf_address = new JTextField();
        tf_address.setBounds(200, 200, 200, 25);
        //tf_signup_confirm_password.setFont(lableFont);
        body_panel.add(tf_address);

        //Mobile
        JLabel professtion = new JLabel("Profession : ");
        professtion.setBounds(90, 250, 100, 25);
        professtion.setFont(lableFont);
        body_panel.add(professtion);

        JTextField tf_professtion = new JTextField();
        tf_professtion.setBounds(200, 250, 200, 25);
        tf_professtion.setFont(txtFont);
        body_panel.add(tf_professtion);

        //Address
        JLabel institution = new JLabel(("Institution : "));
        institution.setBounds(95, 300, 100, 25);
        institution.setFont(lableFont);
        body_panel.add(institution);

        JTextField tf_institution = new JTextField();
        tf_institution.setBounds(200, 300, 200, 25);
        tf_institution.setFont(txtFont);
        body_panel.add(tf_institution);


        // Profession

        JLabel edu = new JLabel("Educationl Qualifi : ");
        edu.setBounds(24, 350, 170, 25);
        edu.setFont(lableFont);
        body_panel.add(edu);

        JTextField tf_edu = new JTextField();
        tf_edu.setBounds(200, 350, 200, 25);
        tf_edu.setFont(txtFont);
        body_panel.add(tf_edu);


        // Institution

        JLabel age = new JLabel("Age : ");
        age.setBounds(142, 400, 100, 25);
        age.setFont(lableFont);
        body_panel.add(age);

        JTextField tf_age = new JTextField();
        tf_age.setBounds(200, 400, 200, 25);
        tf_age.setFont(txtFont);
        body_panel.add(tf_age);



        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            PreparedStatement st = con.prepareStatement("SELECT * FROM member WHERE uname=?");
            st.setString(1, str);

            ResultSet rs = st.executeQuery();

            while(rs.next()){
                String s1 = rs.getString(2);
                String s2 = rs.getString(3);
                String s3 = rs.getString(4);
                String s4 = rs.getString(7);
                String s5 = rs.getString(8);
                String s6 = rs.getString(9);
                String s7 = rs.getString(10);
                String s8 = rs.getString(11);
                String s9 = rs.getString(12);

                tf_name.setText(s1);
                tf_email.setText(s2);
                tf_username.setText(s3);
                tf_mobile.setText(s4);
                tf_address.setText(s5);
                tf_professtion.setText(s6);
                tf_institution.setText(s7);
                tf_edu.setText(s8);
                tf_age.setText(s9);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        // Education

//        JLabel signup_edu = new JLabel("Educational Qualifi. : ");
//        signup_edu.setBounds(24, 450, 170, 25);
//        signup_edu.setFont(lableFont);
//        body_panel.add(signup_edu);
//
//        JTextField tf_signup_edu = new JTextField();
//        tf_signup_edu.setBounds(200, 450, 200, 25);
//        tf_signup_edu.setFont(txtFont);
//        body_panel.add(tf_signup_edu);
//
//        // Age
//        JLabel signup_age = new JLabel("Age : ");
//        signup_age.setBounds(142, 500, 100, 25);
//        signup_age.setFont(lableFont);
//        body_panel.add(signup_age);
//
//        JTextField tf_signup_age = new JTextField();
//        tf_signup_age.setBounds(200, 500, 200, 25);
//        tf_signup_age.setFont(txtFont);
//        body_panel.add(tf_signup_age);

        // Button
        JButton btn_ok = new JButton("OK");
        btn_ok.setBounds(300, 550, 100, 30);
        btn_ok.setBackground(new Color(219, 143, 160));
        btn_ok.setFont(lableFont);
        btn_ok.setForeground(Color.WHITE);
        btn_ok.setBorder(new LineBorder(Color.RED));
        body_panel.add(btn_ok);


        JButton btn_back = new JButton("Back");
        btn_back.setBounds(100, 550, 100, 30);
        btn_back.setBackground(new Color(93, 161, 217));
        btn_back.setFont(lableFont);
        btn_back.setForeground(Color.WHITE);
        btn_back.setBorder(new LineBorder(Color.BLUE));
        body_panel.add(btn_back);

        btn_ok.setFocusable(false);
        btn_back.setFocusable(false);

        btn_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                return;
            }
        });

        btn_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Admin();
            }
        });
        setVisible(true);
    }

}
