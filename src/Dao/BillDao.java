/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DAO.DbOpretions;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author M. A. MUKTADEER
 */
public class BillDao {
    public static  String getId(){
        int id =1;
        try{
            ResultSet rs = DbOpretions.getData("select max(id) from bill");
            if(rs.next()){
                id = rs.getInt(1);
                id = id+1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void saveBill(Bill bill){
        String query = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobailNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreateBy()+"')";
        DbOpretions.setOrDeleteData(query, "Bill is added.");
    }
    
    public static ArrayList<Bill> getBillInOrder(String email, String order, String name){
                String query ="select * from bill where createby ='"+email+"' and email like '%"+name
                        + "%' order by id "+order;

//        String query ="select * from bill";
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOpretions.getData(query);
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobailNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                arrayList.add(bill);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Bill> getBillInOrderAdmin(String order, String name){
                String query ="select * from bill where email like '%"+name
                        + "%' order by id "+order;

//        String query ="select * from bill";
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOpretions.getData(query);
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobailNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                arrayList.add(bill);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
    public static ArrayList<Bill> getBillInOrder(String email, String order){
                String query ="select * from bill where createby ='"+email+"'"
                        + " order by id "+order;

//        String query ="select * from bill";
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOpretions.getData(query);
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobailNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                arrayList.add(bill);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static ArrayList<Bill> getBillInOrderAdmin(String order){
                String query ="select * from bill order by id "+order;

//        String query ="select * from bill";
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOpretions.getData(query);
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobailNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreateBy(rs.getString("createBy"));
                arrayList.add(bill);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
