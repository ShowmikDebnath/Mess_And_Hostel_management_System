package mhms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

    HomePage(){

        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,80));
        heading.setBounds(0,0,900,100);

        Font labelFont = ((new Font("Times new Roman", Font.BOLD,16)));
        Font f = ((new Font("Serif", Font.BOLD,30)));

        JLabel name = new JLabel("Mess and Hostel Managment System");
        name.setBounds(200,50,400,50);
        name.setForeground(Color.WHITE);
        heading.add(name);
        name.setFont(f);



        JPanel body = new JPanel();
        body.setLayout(null);
        body.setSize(400,350);
        //body.setBackground(Color.PINK);
        body.setBackground(new Color(0,0,0,0));
        body.setBounds(0,100,900,500);

        JButton btn_login = new JButton("LogIn");
        btn_login.setBounds(200, 350, 150, 30);
        btn_login.setBackground(new Color(93, 161, 217, 50));
        btn_login.setFont(labelFont);
        btn_login.setForeground(Color.WHITE);
        btn_login.setBorder(new LineBorder(Color.BLUE));
        btn_login.setFocusable(false);
        body.add(btn_login);

        JButton btn_reg = new JButton("Register");
        btn_reg.setBounds(450, 350, 150, 30);
        btn_reg.setBackground(new Color(93, 161, 217, 50));
        btn_reg.setFont(labelFont);
        btn_reg.setForeground(Color.WHITE);
        btn_reg.setBorder(new LineBorder(Color.BLUE));
        btn_reg.setFocusable(false);
        body.add(btn_reg);

        setSize(900, 600);
        setLayout(null);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //ImageIcon background_image = new ImageIcon("homepic.jpg");
        ImageIcon background_image = new ImageIcon("e-phx3019-fs.jpg");

        Image img = background_image.getImage();

        Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);

        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image, JLabel.CENTER);
        background.setBounds(0,0,900,600);

        background.add(heading);
        add(body);
        add(background);


        setVisible(true);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login();
            }
        });

        btn_reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Registration();
            }
        });
    }

}
