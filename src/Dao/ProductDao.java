/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DAO.DbOpretions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import model.Product;
import model.User;

/**
 *
 * @author M. A. MUKTADEER
 */
public class ProductDao {

    public static void save(Product product) {
        String quary = "insert into product (name, category, price) values ('" + product.getName() + "'," + "'" + product.getCategory() + "','" + product.getPrice() + "')";
        DbOpretions.setOrDeleteData(quary, "Prduct added Successfully.");
    }

    public static ArrayList<Product> getAllRecords() {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOpretions.getData("select * from product");
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void update(Product product) {
        String query = "update product set price ='" + product.getPrice() + "',category ='" + product.getCategory() + "'where id='" + product.getId() + "'";
        DbOpretions.setOrDeleteData(query, "Product Update Successfull");
    }

    public static void delete(String id) {
        String quary = "delete from product where id='" + id + "'";
        DbOpretions.setOrDeleteData(quary, "Product Delete Successfully");
    }

    public static Product getPrductByName(String name) {
        Product product = new Product();

        String query = "select * from product where name='" + name + "'";
        try {
            ResultSet rs = DbOpretions.getData(query);
            while (rs.next()) {
                product.setName(rs.getString("name"));
                product.setPrice(rs.getString("price"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }

    public static ArrayList<Product> getSearchProductName(String name, String category) {
        //        public static ArrayList<Product> getSearchProductName(String name, String category){

        ArrayList<Product> arrayList = new ArrayList<>();
        if (!category.equals("")) {
            try {
//                        String query = "select * from product where name like '%" + name + "%'"+"and category ='"+category+"'";

                String query = "select * from product where name like '%" + name + "%'" + "and category='" + category + "'";
                ResultSet rs = DbOpretions.getData(query);
                while (rs.next()) {
                    Product product = new Product();
                    product.setName(rs.getString("name"));
                    arrayList.add(product);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return arrayList;
    }
}
