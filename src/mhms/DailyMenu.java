package mhms;

//import javax.swing.*;
//import javax.swing.*;
//import javax.swing.border.LineBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.sql.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.awt.Font.*;

public class DailyMenu extends JFrame {

    JTextField tf;

    public DailyMenu(){
        //setSize(500, 460);
        setSize(700, 710);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        JTextField tf;

        tf = new JTextField();
        tf.setBounds(20,20,20,20);



        Font lableFont = ((new Font("Arial", Font.BOLD,16)));
        Font txtFont = ((new Font("Arial", Font.ITALIC,12)));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(Color.PINK);
        headerpanel.setBounds(5, 5, 690, 60);
        add(headerpanel);

        JLabel headerTxt = new JLabel("Daily Menu");
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        headerpanel.add(headerTxt);

        //JPanel inputPanel = new JPanel();
        JPanel body_panel = new JPanel();

        body_panel.setBackground(new Color(199,227,240));
        body_panel.setBounds(5, 70, 690, 625);
        //inputPanel.setBounds(5, 70, 490, 425);
        body_panel.setLayout(null);
        add(body_panel);

        JLabel day = new JLabel("Day");
        day.setBounds(50, 10, 100, 25);
        day.setFont(lableFont);
        body_panel.add(day);

        JLabel breakfast = new JLabel("Breakfast");
        breakfast.setBounds(200, 10, 100, 25);
        breakfast.setFont(lableFont);
        body_panel.add(breakfast);

        JLabel lunch = new JLabel("Lunch");
        lunch.setBounds(380, 10, 100, 25);
        lunch.setFont(lableFont);
        body_panel.add(lunch);

        JLabel diner = new JLabel("Diner");
        diner.setBounds(550, 10, 100, 25);
        diner.setFont(lableFont);
        body_panel.add(diner);


        JLabel d1 = new JLabel("Saturday: ");
        d1.setBounds(30, 50, 100, 25);
        d1.setFont(lableFont);
        body_panel.add(d1);

        JTextField tf_d11 = new JTextField();
        tf_d11.setBounds(150, 50, 150, 25);
        tf_d11.setFont(txtFont);
        body_panel.add(tf_d11);

        JTextField tf_d12 = new JTextField();
        tf_d12.setBounds(320, 50, 170, 25);
        tf_d12.setFont(txtFont);
        body_panel.add(tf_d12);

        JTextField tf_d13 = new JTextField();
        tf_d13.setBounds(505, 50, 170, 25);
        tf_d13.setFont(txtFont);
        body_panel.add(tf_d13);

        JLabel d2 = new JLabel("Sunday: ");
        d2.setBounds(30, 100, 100, 25);
        d2.setFont(lableFont);
        body_panel.add(d2);

        JTextField tf_d21 = new JTextField();
        tf_d21.setBounds(150, 100, 150, 25);
        tf_d21.setFont(txtFont);
        body_panel.add(tf_d21);

        JTextField tf_d22 = new JTextField();
        tf_d22.setBounds(320, 100, 170, 25);
        tf_d22.setFont(txtFont);
        body_panel.add(tf_d22);

        JTextField tf_d23 = new JTextField();
        tf_d23.setBounds(505, 100, 170, 25);
        tf_d23.setFont(txtFont);
        body_panel.add(tf_d23);

        JLabel d3 = new JLabel("Monday: ");
        d3.setBounds(30, 150, 100, 25);
        d3.setFont(lableFont);
        body_panel.add(d3);

        JTextField tf_d31 = new JTextField();
        tf_d31.setBounds(150, 150, 150, 25);
        tf_d31.setFont(txtFont);
        body_panel.add(tf_d31);

        JTextField tf_d32 = new JTextField();
        tf_d32.setBounds(320, 150, 170, 25);
        tf_d32.setFont(txtFont);
        body_panel.add(tf_d32);

        JTextField tf_d33 = new JTextField();
        tf_d33.setBounds(505, 150, 170, 25);
        tf_d33.setFont(txtFont);
        body_panel.add(tf_d33);



        JLabel d4 = new JLabel("Tuesday: ");
        d4.setBounds(30, 200, 100, 25);
        d4.setFont(lableFont);
        body_panel.add(d4);


        JTextField tf_d41 = new JTextField();
        tf_d41.setBounds(150, 200, 150, 25);
        tf_d41.setFont(txtFont);
        body_panel.add(tf_d41);

        JTextField tf_d42 = new JTextField();
        tf_d42.setBounds(320, 200, 170, 25);
        tf_d42.setFont(txtFont);
        body_panel.add(tf_d42);

        JTextField tf_d43 = new JTextField();
        tf_d43.setBounds(505, 200, 170, 25);
        tf_d43.setFont(txtFont);
        body_panel.add(tf_d43);



        JLabel d5 = new JLabel("Wednesday: ");
        d5.setBounds(30, 250, 100, 25);
        d5.setFont(lableFont);
        body_panel.add(d5);

        JTextField tf_d51 = new JTextField();
        tf_d51.setBounds(150, 250, 150, 25);
        tf_d51.setFont(txtFont);
        body_panel.add(tf_d51);

        JTextField tf_d52 = new JTextField();
        tf_d52.setBounds(320, 250, 170, 25);
        tf_d52.setFont(txtFont);
        body_panel.add(tf_d52);

        JTextField tf_d53 = new JTextField();
        tf_d53.setBounds(505, 250, 170, 25);
        tf_d53.setFont(txtFont);
        body_panel.add(tf_d53);


        JLabel d6 = new JLabel("Thusday: ");
        d6.setBounds(30, 300, 100, 25);
        d6.setFont(lableFont);
        body_panel.add(d6);

        JTextField tf_d61 = new JTextField();
        tf_d61.setBounds(150, 300, 150, 25);
        tf_d61.setFont(txtFont);
        body_panel.add(tf_d61);

        JTextField tf_d62 = new JTextField();
        tf_d62.setBounds(320, 300, 170, 25);
        tf_d62.setFont(txtFont);
        body_panel.add(tf_d62);

        JTextField tf_d63 = new JTextField();
        tf_d63.setBounds(505, 300, 170, 25);
        tf_d63.setFont(txtFont);
        body_panel.add(tf_d63);

        JLabel d7 = new JLabel("Friday: ");
        d7.setBounds(30, 350, 100, 25);
        d7.setFont(lableFont);
        body_panel.add(d7);

        JTextField tf_d71 = new JTextField();
        tf_d71.setBounds(150, 350, 150, 25);
        tf_d71.setFont(txtFont);
        body_panel.add(tf_d71);

        JTextField tf_d72 = new JTextField();
        tf_d72.setBounds(320, 350, 170, 25);
        tf_d72.setFont(txtFont);
        body_panel.add(tf_d72);

        JTextField tf_d73 = new JTextField();
        tf_d73.setBounds(505, 350, 170, 25);
        tf_d73.setFont(txtFont);
        body_panel.add(tf_d73);



        // Button
        JButton btn_Edit = new JButton("Edit Menu");
        btn_Edit.setBounds(450, 450, 100, 30);
        btn_Edit.setBackground(new Color(219, 143, 160));
        btn_Edit.setFont(lableFont);
        btn_Edit.setForeground(Color.WHITE);
        btn_Edit.setBorder(new LineBorder(Color.RED));
        body_panel.add(btn_Edit);


        JButton btn_back = new JButton("Back");
        btn_back.setBounds(100, 450, 100, 30);
        btn_back.setBackground(new Color(93, 161, 217));
        btn_back.setFont(lableFont);
        btn_back.setForeground(Color.WHITE);
        btn_back.setBorder(new LineBorder(Color.BLUE));
        body_panel.add(btn_back);

        btn_Edit.setFocusable(false);
        btn_back.setFocusable(false);



        tf_d11.setEditable(false);
        tf_d12.setEditable(false);
        tf_d13.setEditable(false);

        //For Monday
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=1");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d11.setText(s11);
                tf_d12.setText(s12);
                tf_d13.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        // For Sunday

        tf_d21.setEditable(false);
        tf_d22.setEditable(false);
        tf_d23.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=2");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d21.setText(s11);
                tf_d22.setText(s12);
                tf_d23.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        // For Monday
        tf_d31.setEditable(false);
        tf_d32.setEditable(false);
        tf_d33.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=3");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d31.setText(s11);
                tf_d32.setText(s12);
                tf_d33.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        // For Tuesday
        tf_d41.setEditable(false);
        tf_d42.setEditable(false);
        tf_d43.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=4");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d41.setText(s11);
                tf_d42.setText(s12);
                tf_d43.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        // For Tuesday

        tf_d41.setEditable(false);
        tf_d42.setEditable(false);
        tf_d43.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=4");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d41.setText(s11);
                tf_d42.setText(s12);
                tf_d43.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        // For Wednessday
        tf_d51.setEditable(false);
        tf_d52.setEditable(false);
        tf_d53.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=5");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d51.setText(s11);
                tf_d52.setText(s12);
                tf_d53.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }



        // For Thusday
        tf_d61.setEditable(false);
        tf_d62.setEditable(false);
        tf_d63.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=6");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d61.setText(s11);
                tf_d62.setText(s12);
                tf_d63.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }


        // For Friday
        tf_d71.setEditable(false);
        tf_d72.setEditable(false);
        tf_d73.setEditable(false);
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM dm WHERE did=7");

            while(rs.next()){
                String s11 = rs.getString(3);
                String s12 = rs.getString(4);
                String s13 = rs.getString(5);


                tf_d71.setText(s11);
                tf_d72.setText(s12);
                tf_d73.setText(s13);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        btn_Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    final URI url = new URI("http://localhost/phpmyadmin/index.php?route=/sql&server=1&db=mess_and_hostel_management&table=daily+menu&pos=0");
                    if(Desktop.isDesktopSupported()){
                        Desktop desktop = Desktop.getDesktop();
                        try{
                            desktop.browse(url);

                        }
                        catch (Exception ex){
                            System.out.println(ex);
                        }
                    }
                    else{
                        System.out.println("ERROR!");
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
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
