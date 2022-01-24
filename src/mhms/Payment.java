package mhms;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame{

    public Payment() throws URISyntaxException {
        final URI url = new URI("http://localhost/phpmyadmin/index.php?route=/sql&db=mess_and_hostel_management&table=member&pos=0");
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
}
