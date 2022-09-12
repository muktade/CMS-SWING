/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author M. A. MUKTADEER
 */
public class userDao {

    public static void save(User user) {
        String query = "insert into user(name, email, mobailNumber, address, password,securityQuestion,answer, status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecuryQuestion() + "','" + user.getAnswer() + "','false')";
        DbOpretions.setOrDeleteData(query, "Register Successfull. Wail for a Admin Approval!");
    }

    public static User login(String email, String Password) {
        User user = null;
        try {
            ResultSet rs = DbOpretions.getData("select * from user where email ='" + email + "' and password ='" + Password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(userDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public static User getSequrityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOpretions.getData("select * from user where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecuryQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    
    public static User getPassword(String email){
        User user = null;
        try{
            ResultSet rs = DbOpretions.getData("select * from user where email ='"+email+"'");
            while(rs.next()){
                user = new User();
                user.setPassword(rs.getString("password"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPass) {
        String query = "update user set password='" + newPass + "' where email ='" + email + "'";
        DbOpretions.setOrDeleteData(query, "Password change Successfully");
    }

    public static ArrayList<User> getAllUser(String email, String status) {
        ArrayList<User> arrayList = new ArrayList<>();
        if (status.equals("true") || status.equals("false")) {
            try {
                String query = "select * from user where email like '%" + email + "%'" + "and status ='" + status + "'";
                ResultSet rs = DbOpretions.getData(query);
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setMobileNumber(rs.getString("mobailNumber"));
                    user.setAddress(rs.getString("address"));
                    user.setSecuryQuestion(rs.getString("securityQuestion"));
                    user.setStatus(rs.getString("status"));
                    arrayList.add(user);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            try {
                String query = "select * from user where email like '%" + email + "%'";
                ResultSet rs = DbOpretions.getData(query);
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setMobileNumber(rs.getString("mobailNumber"));
                    user.setAddress(rs.getString("address"));
                    user.setSecuryQuestion(rs.getString("securityQuestion"));
                    user.setStatus(rs.getString("status"));
                    arrayList.add(user);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return arrayList;

    }

    public static ArrayList<User> getAllUsers(String email, String status) {
        ArrayList<User> arrayList = new ArrayList<>();
        String query = "select * from user where status ='" + status + "'";
        try {
            ResultSet rs = DbOpretions.getData(query);
            while (rs.next()) {
                if (!rs.getString("email").equals(email)) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    user.setMobileNumber(rs.getString("mobailNumber"));
                    user.setAddress(rs.getString("address"));
                    user.setSecuryQuestion(rs.getString("securityQuestion"));
                    user.setStatus(rs.getString("status"));
                    arrayList.add(user);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void stasusUpdate(String email, String status) {
        String query = "update user set status= '" + status + "' where email = '" + email + "'";
        DbOpretions.setOrDeleteData(query, "Status for " + email + " is Changed.");
    }
}
