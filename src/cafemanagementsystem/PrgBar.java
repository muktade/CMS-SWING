/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafemanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class PrgBar {

    public void progress() {
        StartingPage stPage = new StartingPage();
        int i;
        stPage.setVisible(true);
        try {
            for (i = 0; i <= 100; i++) {
                Thread.sleep(100);
                stPage.pBar.setStringPainted(true);
                stPage.pBar.setValue(i);
                if (i <= 100) {
                    stPage.pBar.setString("Done... " + String.valueOf(i) + "%");
                }
                if (i <= 90) {
                    stPage.pBar.setString("Success. Please Wait... " + String.valueOf(i) + "%");
                }
                if (i <= 80) {
                    stPage.pBar.setString("Opening Application... " + String.valueOf(i) + "%");
                }
                if (i <= 70) {
                    stPage.pBar.setString("Connection Successfull... " + String.valueOf(i) + "%");
                }
                if (i <= 50) {
                    stPage.pBar.setString("Connecting Database... " + String.valueOf(i) + "%");
                }
                if (i <= 20) {
                    stPage.pBar.setString("Starting Application... " + String.valueOf(i) + "%");
                }
                if (i <= 10) {
                    stPage.pBar.setString("Loading Application... " + String.valueOf(i) + "%");
                }
            }
            stPage.setVisible(false);
            new Login().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String[] args) {
        PrgBar pg = new PrgBar();
        pg.progress();
    }
}
