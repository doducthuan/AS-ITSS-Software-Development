 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.apple.eawt.FullScreenUtilities.setWindowCanFullScreen(window,true);
//package com.apple.eawt.Application.getApplication().requestToggleFullScreen(window);
package home;
import java.awt.Window;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import static java.awt.SystemColor.window;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
/**
 *
 * @author apple
 */
public class home_page extends javax.swing.JFrame {

    /**
     * Creates new form home_page1
     */
    
    public home_page() {
    
        initComponents();
        //JFrame frame = this;
        /*GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        device.setFullScreenWindow(frame);*/
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //addKeyListener(this);
     //GraphicsDevice gd =    GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    /*if (gd.isFullScreenSupported()) {
        setUndecorated(true);*/
    //setUndecorated(true);
    //gd.setFullScreenWindow(this);
    /*} else {
        System.err.println("Full screen not supported");
        setSize(100, 100); // just something to let you see the window
        setVisible(true);*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image_home_page = new javax.swing.JLabel(){
            ImageIcon icon = new ImageIcon("image/home_page.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        name_page = new javax.swing.JLabel();
        leader = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        sigup = new javax.swing.JButton();
        about_us = new javax.swing.JButton();
        name_home_1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setBackground( Color.white );
        image_home_page.setText("");
        image_home_page.setPreferredSize(new java.awt.Dimension(700, 700));

        name_page.setFont(null);
        name_page.setText("   ENTITITI");
        name_page.setFont(new Font("Courier New", Font.BOLD, 70));
        name_page.setPreferredSize(new java.awt.Dimension(550, 80));
        name_page.setRequestFocusEnabled(false);

        leader.setText("      Internet Media Store");
        leader.setFont(new Font("Courier New", Font.PLAIN, 25));
        leader.setPreferredSize(new java.awt.Dimension(500, 50));

        login.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        login.setText("LOGIN");
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setContentAreaFilled(false);
        login.setPreferredSize(new java.awt.Dimension(150, 40));
        login.setBackground(Color.white);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        sigup.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        sigup.setText("SIGN UP");
        sigup.setBorder(BorderFactory.createEmptyBorder());
        sigup.setContentAreaFilled(false);
        sigup.setPreferredSize(new java.awt.Dimension(150, 40));
        sigup.setBackground(Color.white);
        sigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigupActionPerformed(evt);
            }
        });

        about_us.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        about_us.setText("ABOUT US");
        about_us.setBorder(BorderFactory.createEmptyBorder());
        about_us.setContentAreaFilled(false);
        about_us.setPreferredSize(new java.awt.Dimension(150, 40));
        about_us.setBackground(Color.white);
        about_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_usActionPerformed(evt);
            }
        });

        name_home_1.setBackground(new java.awt.Color(255, 255, 255));
        name_home_1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        name_home_1.setText("HOME");
        name_home_1.setBorder(BorderFactory.createEmptyBorder());
        name_home_1.setContentAreaFilled(false);
        name_home_1.setPreferredSize(new java.awt.Dimension(150, 40));
        name_home_1.setBackground(Color.white);
        name_home_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_home_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(image_home_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(leader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(name_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_home_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(about_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(sigup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sigup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(about_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_home_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197)
                        .addComponent(name_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(leader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(image_home_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_home_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_home_1ActionPerformed
        // TODO add your handling code here:
        home_buy buy = new home_buy();
        this.setVisible(false);
        
        //buy.setVisible(true);
        buy.setVisible(true);
    }//GEN-LAST:event_name_home_1ActionPerformed

    private void about_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_usActionPerformed
        // TODO add your handling code here:
        about_us about = new about_us();
        this.setVisible(false);
        //.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //frame.setUndecorated(true);
        //frame.setVisible(true);
        about.setVisible(true);
    }//GEN-LAST:event_about_usActionPerformed

    private void sigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigupActionPerformed
        // TODO add your handling code here:
        sign_up sign = new sign_up();
        this.setVisible(false);
        sign.setVisible(true);
    }//GEN-LAST:event_sigupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        login lo = new login();
        this.setVisible(false);
        lo.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_us;
    private javax.swing.JLabel image_home_page;
    private javax.swing.JLabel leader;
    private javax.swing.JButton login;
    private javax.swing.JButton name_home_1;
    private javax.swing.JLabel name_page;
    private javax.swing.JButton sigup;
    // End of variables declaration//GEN-END:variables
}
