/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author apple
 */
public class about_us extends javax.swing.JFrame {

    /**
     * Creates new form about_us
     */
    public about_us() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image_trung = new javax.swing.JLabel(){
            ImageIcon icon = new ImageIcon("image/about_us/trung.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        image_thuan = new javax.swing.JLabel(){
            ImageIcon icon = new ImageIcon("image/about_us/thuan.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        image_nguyet = new javax.swing.JLabel(){
            ImageIcon icon = new ImageIcon("image/about_us/nguyet.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        image_thuc = new javax.swing.JLabel(){
            ImageIcon icon = new ImageIcon("image/about_us/thuc.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        back_about = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        imfor_trung = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        imfor_nguyet = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        imfor_thuan = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));

        getContentPane().setBackground(Color.white);
        image_trung.setText("");
        image_trung.setPreferredSize(new java.awt.Dimension(200, 200));

        image_thuan.setText("");
        image_thuan.setPreferredSize(new java.awt.Dimension(200, 200));

        image_nguyet.setText("");
        image_nguyet.setPreferredSize(new java.awt.Dimension(200, 200));

        image_thuc.setText("");
        image_thuc.setPreferredSize(new java.awt.Dimension(200, 200));

        back_about.setText("Back");
        back_about.setPreferredSize(new java.awt.Dimension(80, 30));
        back_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_aboutActionPerformed(evt);
            }
        });
        back_about.setBackground(Color.white);

        imfor_trung.setColumns(20);
        imfor_trung.setRows(5);
        imfor_trung.setText("Họ và tên    : Lê Hoàng Anh Trung\nMSSV           : 20176892\nSở thích      : Tưới cây lúc trời mưa\nChâm ngôn : Học - Học nữa - Học mãi\nTình trạng   : FA lâu năm\nCông việc    : Điệp vụ hai mang tại Phái Cái Bang\n                 \n\n                    \" Đẹp trai - Tài năng - Tư duy đỉnh cao \" ");
        jScrollPane2.setViewportView(imfor_trung);

        imfor_nguyet.setColumns(20);
        imfor_nguyet.setRows(5);
        imfor_nguyet.setText("Họ và tên       : Hoàng Minh Nguyệt\nMSSV             : 20176839\nSở thích .       : Nghe nhạc , đọc chuyện\nChâm ngôn    : \"Self-improvement is not about trying to be \n          someone else.It is to be your own best version\"\nTình trạng      : Đã có gấu - Xin gió đông hãy về ....\nCông việc       : Nội trợ \n\n\n                  \" Xinh đẹp - Tài năng - Cháu ngoan Bác Hồ \"");
        jScrollPane3.setViewportView(imfor_nguyet);

        imfor_thuan.setColumns(20);
        imfor_thuan.setRows(5);
        imfor_thuan.setText("Họ và tên       : Đỗ Đức Thuận\nMSSV             : 20176884\nSở thích         : Bí mật\nChâm ngôn    : Không thể bật mí hihi\nTình trạng      : FA\nCông việc       : Lính bắn tỉa - Sát thủ\n\n\n                                         \" 12 tính cách \"");
        jScrollPane4.setViewportView(imfor_thuan);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Họ và tên         : Mai Mạnh Thục\nMSSV                : 20176885\nSở thích           : Love Thảo nguyên\nChâm ngôn      : Ngồi chờ hạnh phúc sẽ tới\nTình trạng        : Tương tư\nCông việc         : Thích khách \n \n\n                          \" Yêu màu hường ghét sự giả dối \"");
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image_trung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image_nguyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_thuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image_thuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(back_about, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1330, 1330, 1330))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(back_about, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(image_trung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(image_thuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image_thuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image_nguyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5))
                .addGap(200, 200, 200))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_aboutActionPerformed
        // TODO add your handling code here:
        home_page home = new home_page();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_back_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about_us().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_about;
    private javax.swing.JLabel image_nguyet;
    private javax.swing.JLabel image_thuan;
    private javax.swing.JLabel image_thuc;
    private javax.swing.JLabel image_trung;
    private javax.swing.JTextArea imfor_nguyet;
    private javax.swing.JTextArea imfor_thuan;
    private javax.swing.JTextArea imfor_trung;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
