package mhms;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.awt.Font.*;

public class AdminMembers extends JFrame {

    JLabel lb, lb1, lb2, lb3, lb4, b4;
    JTextField tf1, tf2, tf3, tf4;

    AdminMembers(){
        super("Fetching Members Information");

        lb = new JLabel("Fetching Members information from database");
        lb.setBounds(20, 50, 450, 20);

        lb.setForeground(Color.red);
        lb.setFont(new Font("Serif", Font.BOLD, 20));

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);

        lb1 = new JLabel("U_name: ");
        lb1.setBounds(50, 105, 100, 20);
        tf1 = new JTextField(50);
        tf1.setBounds(160, 105, 100, 20);

        lb2 = new JLabel("U_mail: ");
        lb2.setBounds(50, 135, 100, 20);
        tf2 = new JTextField(100);
        tf2.setBounds(160, 135, 200, 20);

        lb3 = new JLabel("U_pass");
        lb3.setBounds(50, 165, 100, 20);
        tf3 = new JTextField(50);
        tf3.setBounds(160, 165, 100, 20);

        lb4 = new JLabel("U_city");
        lb4.setBounds(50, 200, 100, 20);
        tf4 = new JTextField(50);
        tf4.setBounds(160, 200, 100, 20);


        setLayout(null);


        add(lb);
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(lb4);
        add(tf4);

        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);


        try{
            String str = "am121";

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
                String s = rs.getString(4);
                String s1 = rs.getString(3);
                String s2 = rs.getString(5);
                String s3 = rs.getString(8);

                tf1.setText(s);
                tf2.setText(s1);
                tf3.setText(s2);
                tf4.setText(s3);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

