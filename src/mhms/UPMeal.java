//package mhms;
//
//import javax.swing.*;
//import javax.swing.border.LineBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.net.URI;
//import java.sql.*;
//
//public class UPMeal extends JFrame{
//
//    String str;
//    public UPMeal(String str){
//
//        this.str = str;
//
//        setSize(500, 300);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(3);
//        setLayout(null);
//
//        Font labelFont = ((new Font("Arial", Font.BOLD, 16)));
//        Font txtFont = ((new Font("Arial", Font.ITALIC, 12)));
//
//        JPanel headerpanel = new JPanel();
//        headerpanel.setBackground(new Color(93, 161, 217));
//        headerpanel.setBounds(5, 5, 490, 60);
//
//        JLabel headerTxt = new JLabel(("Total Cost"));
//        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
//        headerpanel.add(headerTxt);
//        add(headerpanel);
//
//        JPanel login_panel = new JPanel();
//        login_panel.setBackground(new Color(190, 227, 240));
//        login_panel.setBounds(5, 70, 490, 425);
//        login_panel.setLayout(null);
//        add(login_panel);
//
//        JLabel namelabel = new JLabel("Your meal this month : ");
//        namelabel.setBounds(20, 25, 180, 25);
//        namelabel.setFont(labelFont);
//        login_panel.add(namelabel);
//
//        JTextField nameTxt = new JTextField();
//        nameTxt.setBounds(200, 25, 200, 25);
//        nameTxt.setFont(txtFont);
//        login_panel.add(nameTxt);
//
//
//        JButton btn_back = new JButton("Back");
//        //btn_back.setBounds(300, 120, 100, 30);
//        btn_back.setBounds(100, 120, 100, 30);
//
//        btn_back.setBackground(new Color(93, 161, 217));
//        btn_back.setFont(labelFont);
//        btn_back.setForeground(Color.WHITE);
//        btn_back.setBorder(new LineBorder(Color.BLUE));
//        login_panel.add(btn_back);
//
//        btn_back.setFocusable(false);
//
//
//        JButton btn_details = new JButton("Details");
//        //btn_details.setBounds(100, 120, 100, 30);
//        btn_details.setBounds(300, 120, 100, 30);
//
//        btn_details.setBackground(new Color(219, 143, 160));
//        btn_details.setFont(labelFont);
//        btn_details.setForeground(Color.WHITE);
//        btn_details.setBorder(new LineBorder((Color.RED)));
//        login_panel.add(btn_details);
//
//        btn_details.setFocusable(false);
//
//        setVisible(true);
//
//        nameTxt.setEditable(false);
//
//        try{
////            String str = "sd101";
//
//            if(str.equals("sd101")){
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
//                //String url = "jdbc:mysql://localhost:3306/mhms";
//                String uname = "root";
//                String pass = "";
//                Connection con = DriverManager.getConnection(url, uname, pass);
//
//                PreparedStatement st = con.prepareStatement("SELECT * FROM member WHERE uname=?");
//                SELECT sum(pprice) FROM tcost WHERE
//                st.setString(1, str);
//
//                ResultSet rs = st.executeQuery();
//
//                while(rs.next()){
//                    String s1 = rs.getString(2);
//
//
//                    //tf_name.setText(s1);
//
//                }
//            }
//        }
//
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
