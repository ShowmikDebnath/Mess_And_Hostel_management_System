package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UMealBalance extends JFrame{

    public UMealBalance(){

        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Arial", Font.BOLD, 16)));
        Font txtFont = ((new Font("Arial", Font.ITALIC, 12)));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(new Color(93, 161, 217));
        headerpanel.setBounds(5, 5, 490, 60);

        JLabel headerTxt = new JLabel(("Meal Balance"));
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        headerpanel.add(headerTxt);
        add(headerpanel);

        JPanel login_panel = new JPanel();
        login_panel.setBackground(new Color(190, 227, 240));
        login_panel.setBounds(5, 70, 490, 425);
        login_panel.setLayout(null);
        add(login_panel);

        JLabel namelabel = new JLabel("Balance for this month : ");
        namelabel.setBounds(10, 25, 190, 25);
        namelabel.setFont(labelFont);
        login_panel.add(namelabel);

        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(200, 25, 200, 25);
        nameTxt.setFont(txtFont);
        login_panel.add(nameTxt);


        JButton btn_back = new JButton("Back");
        //btn_back.setBounds(300, 120, 100, 30);
        btn_back.setBounds(100, 120, 100, 30);

        btn_back.setBackground(new Color(93, 161, 217));
        btn_back.setFont(labelFont);
        btn_back.setForeground(Color.WHITE);
        btn_back.setBorder(new LineBorder(Color.BLUE));
        login_panel.add(btn_back);

        btn_back.setFocusable(false);


//        JButton btn_details = new JButton("Details");
//        //btn_details.setBounds(100, 120, 100, 30);
//        btn_details.setBounds(300, 120, 100, 30);
//
//        btn_details.setBackground(new Color(219, 143, 160));
//        btn_details.setFont(labelFont);
//        btn_details.setForeground(Color.WHITE);
//        btn_details.setBorder(new LineBorder((Color.RED)));
//        login_panel.add(btn_details);

//        btn_details.setFocusable(false);

        setVisible(true);

        nameTxt.setEditable(false);



        String s11 = null, s22 = null;
        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT sum(pprice) FROM tcost");

            //String s11;
            while(rs.next()){
                s11 = rs.getString(1);

                //nameTxt.setText(s11);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
//            String str = "sd101";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, uname, pass);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT sum(payment) FROM member");

            //String s22;
            while(rs.next()){
                s22 = rs.getString(1);

                //nameTxt.setText(s11);

                int is11 = Integer.parseInt(s11);
                int is22 = Integer.parseInt(s22);

                int cost = is22-is11;

                nameTxt.setText(String.valueOf(cost));


            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        btn_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new User();
            }
        });
    }

}
