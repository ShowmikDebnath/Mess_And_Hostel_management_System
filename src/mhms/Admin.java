package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;

public class Admin extends JFrame {

    public Admin(){
        setSize(500, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Times new Roman", Font.BOLD,16)));

        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(Color.PINK);
        headerpanel.setBounds(5, 5, 475, 60);
        add(headerpanel);

        JLabel headerTxt = new JLabel("ADMIN SECTION");
        headerTxt.setFont((new Font("Times new Roman", Font.BOLD, 30)));
        headerpanel.add(headerTxt);


        // Body Part of Admin
        JPanel body_panel = new JPanel();

        body_panel.setBackground(new Color(199,227,240));
        body_panel.setBounds(5, 70, 475, 487);
        body_panel.setLayout(null);
        add(body_panel);



        JButton btn_members = new JButton("Members Search");
        btn_members.setBounds(160, 50, 150, 30);
        btn_members.setBackground(new Color(93, 161, 217));
        btn_members.setFont(labelFont);
        btn_members.setForeground(Color.WHITE);
        btn_members.setBorder(new LineBorder(Color.BLUE));
        btn_members.setFocusable(false);
        body_panel.add(btn_members);

        JButton btn_menu = new JButton("Daily Menu");
        btn_menu.setBounds(160, 100, 150, 30);
        btn_menu.setBackground(new Color(93, 161, 217));
        btn_menu.setFont(labelFont);
        btn_menu.setForeground(Color.WHITE);
        btn_menu.setBorder(new LineBorder(Color.BLUE));
        btn_menu.setFocusable(false);
        body_panel.add(btn_menu);

        JButton btn_payment_status = new JButton("Edit Payment Status");
        btn_payment_status.setBounds(160, 150, 150, 30);
        btn_payment_status.setBackground(new Color(93, 161, 217));
        btn_payment_status.setFont(labelFont);
        btn_payment_status.setForeground(Color.WHITE);
        btn_payment_status.setBorder(new LineBorder(Color.BLUE));
        btn_payment_status.setFocusable(false);
        body_panel.add(btn_payment_status);

        JButton btn_tmeal = new JButton("User's Total Meal");
        btn_tmeal.setBounds(160, 200, 150, 30);
        btn_tmeal.setBackground(new Color(93, 161, 217));
        btn_tmeal.setFont(labelFont);
        btn_tmeal.setForeground(Color.WHITE);
        btn_tmeal.setBorder(new LineBorder(Color.BLUE));
        btn_tmeal.setFocusable(false);
        body_panel.add(btn_tmeal);


        JButton btn_tcost = new JButton("Total Cost");
        btn_tcost.setBounds(160, 250, 150, 30);
        btn_tcost.setBackground(new Color(93, 161, 217));
        btn_tcost.setFont(labelFont);
        btn_tcost.setForeground(Color.WHITE);
        btn_tcost.setBorder(new LineBorder(Color.BLUE));
        btn_tcost.setFocusable(false);
        body_panel.add(btn_tcost);

//        JButton btn_pcost = new JButton("Per Person Cost");
//        btn_pcost.setBounds(160, 300, 150, 30);
//        btn_pcost.setBackground(new Color(93, 161, 217));
//        btn_pcost.setFont(labelFont);
//        btn_pcost.setForeground(Color.WHITE);
//        btn_pcost.setBorder(new LineBorder(Color.BLUE));
//        btn_pcost.setFocusable(false);
//        body_panel.add(btn_pcost);

        JButton btn_mealbalance = new JButton("Meal Balance");
        btn_mealbalance.setBounds(160, 300, 150, 30);
        btn_mealbalance.setBackground(new Color(93, 161, 217));
        btn_mealbalance.setFont(labelFont);
        btn_mealbalance.setForeground(Color.WHITE);
        btn_mealbalance.setBorder(new LineBorder(Color.BLUE));
        btn_mealbalance.setFocusable(false);
        body_panel.add(btn_mealbalance);

        JButton btn_logout = new JButton("Logout");
        btn_logout.setBounds(160, 350, 150, 30);
        btn_logout.setBackground(new Color(93, 161, 217));
        btn_logout.setFont(labelFont);
        btn_logout.setForeground(Color.WHITE);
        btn_logout.setBorder(new LineBorder(Color.BLUE));
        btn_logout.setFocusable(false);
        body_panel.add(btn_logout);

        setVisible(true);



        btn_members.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //new AdminMembers();
                new SearchByUname();
            }
        });

        btn_tmeal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //new AdminMembers();
                //new SearchByUname();
                try {
                    new Admin_meal();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btn_payment_status.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //new AdminMembers();
                //new SearchByUname();
                try {
                    new Payment();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        btn_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DailyMenu();
            }
        });

        btn_tcost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new tcost();
            }
        });

        btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login();
            }
        });

        btn_mealbalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new mealBalance();
            }
        });
    }
}
