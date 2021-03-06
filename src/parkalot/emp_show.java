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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lll2yu
 */
public class emp_show extends javax.swing.JFrame {

    /**
     * Creates new form emp_show
     */
    public emp_show() {
        user_sorter();
        add_box();
        initComponents();
    }
    void add_box(){
        cb1.setModel(new DefaultComboBoxModel<String>(list.toArray(new String[0])));
        getContentPane().add(cb1);
        cb1.setBounds(530, 180, 270, 27);
    }
    ArrayList<String> list=new ArrayList<String>();
    void user_sorter(){
        ResultSet rlt;
        try{
			Class.forName("add your jdbc Driver");
			Connection c=DriverManager.getConnection("add your connectin info");
			Statement stat=c.createStatement();
			rlt=stat.executeQuery("Select login from user_details ");			
 				while (rlt.next()) {      
  					 list.add((rlt.getString(1)));                                 
				}
		}
		catch(Exception e){}
}
    String name;
    public ArrayList<forEmp> forEmp(){
        ArrayList<forEmp> elist=new ArrayList<>();
        ResultSet rlt;
        try{
			Class.forName("add your jdbc Driver");
			Connection c=DriverManager.getConnection("add your connectin info");
			Statement stat=c.createStatement();
			rlt=stat.executeQuery("Select * from user_details where login= '"+name+"'");	
                        forEmp tlist;
 				while (rlt.next()) {      
  					 tlist=new forEmp(rlt.getString("fname"),rlt.getString("login"),rlt.getString("address"),rlt.getString("pass"));                                 
                                         elist.add(tlist);
				}
		}
		catch(Exception e){}
        return elist;
    }
    public void draw_Table(){
        ArrayList<forEmp> nlist=forEmp();
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        Object[] row=new Object[5];
        for(int i=0;i<nlist.size();i++){
            row[0]=nlist.get(i).fname();
            row[1]=nlist.get(i).login();
            row[2]=nlist.get(i).address();
            row[3]=nlist.get(i).pass();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(240, 90, 0, 0));
        setMinimumSize(new java.awt.Dimension(900, 640));
        setPreferredSize(new java.awt.Dimension(900, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Username", "Address", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 400, 750, 130);

        jButton1.setText("Get Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 280, 100, 25);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Display Information of Employees");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 80, 270, 30);

        jLabel2.setText("Select the user to show info of:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 180, 250, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/if_group_318580.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 30, 48, 48);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/frame_bg.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 640);

        jMenu3.setText("Actions");

        jMenuItem1.setText("Go Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object sI=cb1.getSelectedItem();
        if (sI != null)
			{
    				name= sI.toString();
                        }
        draw_Table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new user_edit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(emp_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JComboBox<String> cb1 = new javax.swing.JComboBox <String>();
}
