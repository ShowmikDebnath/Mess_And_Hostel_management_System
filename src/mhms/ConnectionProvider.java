package mhms;

import javax.swing.*;
import java.sql.*;

public class ConnectionProvider{

    private Connection con;
    private Statement st;

    public ConnectionProvider(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mess_and_hostel_management";
            //String url = "jdbc:mysql://localhost:3306/mhms";
            String uname = "root";
            String pass = "";
            con = DriverManager.getConnection(url, uname, pass);

            st = con.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void RegisterInsert(String queryinsert){
        try{
            st.executeUpdate(queryinsert);
            JOptionPane.showMessageDialog(null, "Registration Complete!");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Registration not Complete!");
            System.out.println(e);

        }


    }

    public void Login(String queryLogin, String Login_uname, String Login_pass) throws Exception {


        try{
            st = con.createStatement();
            ResultSet rs = st.executeQuery(queryLogin);

            while(rs.next()){
                if((Login_pass.equals(rs.getString("pass")))&&(Login_uname.equals(rs.getString("uname")))){
                //if((Login_uname.equals(rs.getString("uname")))&&(Login_pass.equals(rs.getString("pass")))){
                    JOptionPane.showMessageDialog(null, "Login Succesfully!");
                    new User();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login Failed!");
                    new Login();
                }
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

        st.close();
        con.close();

    }

    public void members(String query) {

    }

    public void count(String cnt) {

        ResultSet n = null;
        try {
            st = con.createStatement();
            n = st.executeQuery(cnt);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(n);
        //return 0;
    }
}
