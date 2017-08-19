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
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author lll2yu
 */
public class set_car extends javax.swing.JFrame {

    /**
     * Creates new form set_car
     */
    public set_car() {
        add_box();
        initComponents();
    }
    
    ArrayList<String> list=new ArrayList<String>();
    void add_box(){
        get_car();
        cb1.setModel(new DefaultComboBoxModel<String>(list.toArray(new String[0])));
        getContentPane().add(cb1);
        cb1.setBounds(280, 300, 160, 30);
    }
    void get_car(){
        ResultSet rlt;
        try{
			Class.forName("add your jdbc Driver");
			Connection c=DriverManager.getConnection("add your connectin info");
			Statement stat=c.createStatement();
			rlt=stat.executeQuery("Select name from rates ");			
 				while (rlt.next()) {      
  					 list.add(rlt.getString(1));                                 
				}
		}
		catch(Exception e){}
    }
    void add_car(){
        String s1;
        s1=tf1.getText();
        ResultSet re;
        try{
			Class.forName("add your jdbc Driver");
			Connection ce=DriverManager.getConnection("add your connectin info");
			Statement se=ce.createStatement();
			re=se.executeQuery("insert into rates(name) values('"+s1+"')");
		}
	catch(Exception e){}   
    }
    void remove_car(){
        String s1;
        Object sI=cb1.getSelectedItem();
        if (sI != null)
			{
    				s1= sI.toString();
                        }
        s1=tf1.getText();
        ResultSet re;
        try{
			Class.forName("add your jdbc Driver");
			Connection ce=DriverManager.getConnection("add your connectin info");
			Statement se=ce.createStatement();
			re=se.executeQuery("delete from rates where name='"+s1+"'");
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
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(530, 240, 250, 50));
        jDialog1.setMinimumSize(new java.awt.Dimension(350, 200));
        jDialog1.setPreferredSize(new java.awt.Dimension(350, 200));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jLabel5.setText("Refresh the page");
        jDialog1.getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 40, 140, 30);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton3);
        jButton3.setBounds(150, 120, 66, 29);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(445, 120, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Add/Remove Car Types");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 200, 30);

        jLabel2.setText("Add Car Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 110, 81, 30);

        jLabel3.setText("Remove Car Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 300, 105, 30);
        getContentPane().add(tf1);
        tf1.setBounds(280, 110, 160, 30);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 200, 90, 29);

        jButton2.setText("REMOVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 380, 90, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/frame_bg_500.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_car();
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        remove_car();
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.dispose();
        new set_car().setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(set_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(set_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(set_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(set_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new set_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JComboBox<String> cb1 = new javax.swing.JComboBox <String>();
}
