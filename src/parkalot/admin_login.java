/*
 * Copyright (C) 2017 lll2yu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package parkalot;

import java.sql.*;

/**
 *
 * @author lll2yu
 */
public class admin_login extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pen;
    /**
     * Creates new form admin_login
     */
    public admin_login() {
        initComponents();
        set_focus();
    }
    private void set_focus(){
        tf1.setText("Enter Username");
        pf1.setText("Enter Password");
        jButton1.requestFocusInWindow();
    }
    
    String x1,x2,x3;
    void get_pass(){
        x1=tf1.getText();
        x2=pf1.getText();
        ResultSet res;
        try{
            Class.forName("add your jdbc Driver");
            con=DriverManager.getConnection("add your connectin info");
            Statement stat=con.createStatement();
            res=stat.executeQuery("select pass from admin_details where login='"+x1+"'");
            while(res.next()){
				x3=res.getString(1);
            }    
        }
        catch(Exception e){}     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jDialog1.setBounds(new java.awt.Rectangle(530, 240, 250, 50));
        jDialog1.setMinimumSize(new java.awt.Dimension(350, 200));
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(250, 50));
        jDialog1.getContentPane().setLayout(null);

        jLabel5.setText("                                Wrong Password");
        jDialog1.getContentPane().add(jLabel5);
        jLabel5.setBounds(3, 5, 390, 40);

        jButton2.setText("Retry");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton2);
        jButton2.setBounds(140, 100, 90, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(445, 120, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 550));
        setName("parkalot"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("Admin Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 100, 160, 30);

        tf1.setBackground(new java.awt.Color(109, 162, 215));
        tf1.setFont(new java.awt.Font("GE Inspira", 1, 18)); // NOI18N
        tf1.setForeground(new java.awt.Color(1, 2, 4));
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(110, 180, 290, 34);

        pf1.setBackground(new java.awt.Color(109, 162, 215));
        pf1.setFont(new java.awt.Font("GE Inspira", 1, 18)); // NOI18N
        pf1.setForeground(new java.awt.Color(1, 2, 4));
        pf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf1FocusLost(evt);
            }
        });
        getContentPane().add(pf1);
        pf1.setBounds(110, 280, 290, 34);

        jButton1.setBackground(new java.awt.Color(181, 0, 255));
        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(212, 212, 212));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 390, 100, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/if_user_318585.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 40, 48, 48);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/frame_bg_500.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 500);

        jMenu2.setText("Actions");

        jMenuItem1.setText("Go Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           get_pass();
           if(x2.equals(x3)){
               new conf_page().setVisible(true);
               dispose();
           }
           else{
               jDialog1.setVisible(true);}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        set_focus();
        jDialog1.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        new selection_page().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
        if(tf1.getText().isEmpty() || tf1.getText().equals("Enter Username")) {
        tf1.setText("");
      }
    }//GEN-LAST:event_tf1FocusGained

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        if(tf1.getText().isEmpty()) {
        tf1.setText("Enter Username");
      }
    }//GEN-LAST:event_tf1FocusLost

    private void pf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf1FocusGained
        if(pf1.getText().isEmpty() || pf1.getText().equals("Enter Password")) {
        pf1.setText("");
      }
    }//GEN-LAST:event_pf1FocusGained

    private void pf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf1FocusLost
        if(pf1.getText().isEmpty()) {
        pf1.setText("Enter Password");
      }
    }//GEN-LAST:event_pf1FocusLost

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
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
