package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Admin_meal extends JFrame{

    public Admin_meal() throws URISyntaxException {
        final URI url = new URI("http://localhost/phpmyadmin/index.php?route=/sql&server=1&db=mess_and_hostel_management&table=tmeal&pos=0");
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
    }

//    public Admin_meal(){
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
//        JLabel headerTxt = new JLabel(("Meal Count"));
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
//        JLabel namelabel = new JLabel("UserName : ");
//        namelabel.setBounds(80, 25, 100, 25);
//        namelabel.setFont(labelFont);
//        login_panel.add(namelabel);
//
//        JTextField nameTxt = new JTextField();
//        nameTxt.setBounds(200, 25, 200, 25);
//        nameTxt.setFont(txtFont);
//        login_panel.add(nameTxt);
//
//        JLabel meallabel = new JLabel("Today's Meal : ");
//        meallabel.setBounds(80, 70, 100, 25);
//        meallabel.setFont(labelFont);
//        login_panel.add(meallabel);
//
//        JTextField mealTxt = new JTextField();
//        mealTxt.setBounds(200, 70, 200, 25);
//        mealTxt.setFont(labelFont);
//        login_panel.add(mealTxt);
//
//        JButton ok_Btn = new JButton("OK");
//        ok_Btn.setBounds(300, 120, 100, 30);
//        ok_Btn.setBackground(new Color(93, 161, 217));
//        ok_Btn.setFont(labelFont);
//        ok_Btn.setForeground(Color.WHITE);
//        ok_Btn.setBorder(new LineBorder(Color.BLUE));
//        login_panel.add(ok_Btn);
//
//        ok_Btn.setFocusable(false);
//
//
//        JButton registerBtn = new JButton("Register");
//        registerBtn.setBounds(100, 120, 100, 30);
//        registerBtn.setBackground(new Color(219, 143, 160));
//        registerBtn.setFont(labelFont);
//        registerBtn.setForeground(Color.WHITE);
//        registerBtn.setBorder(new LineBorder((Color.RED)));
//        login_panel.add(registerBtn);
//
//        registerBtn.setFocusable(false);
//
//        setVisible(true);
//
//
//        ok_Btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String uname = nameTxt.getText();
//                String meal = mealTxt.getText();
//
//                try{
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
//                    //String url = "jdbc:mysql://localhost:3306/mhms";
//                    String suname = "root";
//                    String pass = "";
//                    Connection con = DriverManager.getConnection(url, suname, pass);
//
//                    //PreparedStatement st = con.prepareStatement("UPDATE member SET meal 1 WHERE uname");
//                    //st.setString(1, str);
//                }
//                catch (Exception ex){
//                    System.out.println(ex);
//                }
//
//                if(meal.equals('1')){
//
//
//
//
//                }
//                else if(meal.equals('2')){
//
//                }
//                else if(meal.equals('3')){
//
//                }
//                else if(meal.equals('4')){
//
//                }
//                else if(meal.equals('5')){
//
//                }
//                else if(meal.equals('6')){
//
//                }
//            }
//
//        });
//
//    }
}
