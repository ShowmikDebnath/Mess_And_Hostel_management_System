package mhms;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserMearSearch extends JFrame{
    public UserMearSearch(){
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Arial", Font.BOLD, 16)));
        Font txtFont = ((new Font("Arial", Font.ITALIC, 12)));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(new Color(93, 161, 217));
        headerpanel.setBounds(5, 5, 490, 60);

        JLabel headerTxt = new JLabel(("Search Your Total Meal"));
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
        //System.out.println(nameTxt.getText()+"********");
        //System.out.println(str);
        login_panel.add(nameTxt);



//        JLabel passlabel = new JLabel("Password : ");
//        passlabel.setBounds(80, 70, 100, 25);
//        passlabel.setFont(labelFont);
//        login_panel.add(passlabel);
//
//        JPasswordField passTxt = new JPasswordField();
//        passTxt.setBounds(200, 70, 200, 25);
//        //passTxt.setFont(labelFont);
//        login_panel.add(passTxt);

        JButton search_Btn = new JButton("Search");
        search_Btn.setBounds(300, 120, 100, 30);
        search_Btn.setBackground(new Color(93, 161, 217));
        search_Btn.setFont(labelFont);
        search_Btn.setForeground(Color.WHITE);
        search_Btn.setBorder(new LineBorder(Color.BLUE));
        login_panel.add(search_Btn);

        search_Btn.setFocusable(false);


        JButton back_Btn = new JButton("Back");
        back_Btn.setBounds(100, 120, 100, 30);
        back_Btn.setBackground(new Color(219, 143, 160));
        back_Btn.setFont(labelFont);
        back_Btn.setForeground(Color.WHITE);
        back_Btn.setBorder(new LineBorder((Color.RED)));
        login_panel.add(back_Btn);

        back_Btn.setFocusable(false);

        setVisible(true);

        search_Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = nameTxt.getText();
                //new UPMeal(strName);
            }
        });
    }
}
