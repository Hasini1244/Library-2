/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.homePage;


import edu.ijse.view.BookCategoryView;
import edu.ijse.view.BookView;
import edu.ijse.view.BorrowingTransactionsView;
import edu.ijse.view.MemberView;
import edu.ijse.view.ReturnView;
import edu.ijse.welcome.Welcome;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public homePage() {
        initComponents();
               setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBooks = new javax.swing.JButton();
        btnBookCategories = new javax.swing.JButton();
        btnMembers = new javax.swing.JButton();
        btnBorrowingTransactions = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home Page......");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 1040, 110);

        btnBooks.setBackground(new java.awt.Color(248, 248, 248));
        btnBooks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/save image.jpg"))); // NOI18N
        btnBooks.setText("Manage Books");
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnBooks);
        btnBooks.setBounds(20, 130, 520, 99);

        btnBookCategories.setBackground(new java.awt.Color(248, 248, 248));
        btnBookCategories.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBookCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/save image2.jpg"))); // NOI18N
        btnBookCategories.setText("Manage Book Categories");
        btnBookCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookCategoriesActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookCategories);
        btnBookCategories.setBounds(640, 120, 430, 100);

        btnMembers.setBackground(new java.awt.Color(248, 248, 248));
        btnMembers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/members image.jpg"))); // NOI18N
        btnMembers.setText("Manage Members");
        btnMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembersActionPerformed(evt);
            }
        });
        getContentPane().add(btnMembers);
        btnMembers.setBounds(20, 260, 520, 110);

        btnBorrowingTransactions.setBackground(new java.awt.Color(248, 248, 248));
        btnBorrowingTransactions.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBorrowingTransactions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/borrowing image.jpg"))); // NOI18N
        btnBorrowingTransactions.setText("Manage Borrowing Transactions");
        btnBorrowingTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowingTransactionsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrowingTransactions);
        btnBorrowingTransactions.setBounds(20, 390, 520, 90);

        btnReturn.setBackground(new java.awt.Color(248, 248, 248));
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/Return image.png"))); // NOI18N
        btnReturn.setText("Return & Apply Fines");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(650, 260, 430, 100);

        btnLogOut.setBackground(new java.awt.Color(248, 248, 248));
        btnLogOut.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/logout.jpg"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut);
        btnLogOut.setBounds(800, 420, 280, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ijse/homePage/background image.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -4, 1280, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembersActionPerformed
       setVisible(false);
       
        try {
            new MemberView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnMembersActionPerformed

    private void btnBookCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookCategoriesActionPerformed
       setVisible(false);
        try {
            new BookCategoryView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnBookCategoriesActionPerformed

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed

        setVisible(false);
        try {
            new BookView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
         setVisible(false);
         new Welcome().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBorrowingTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowingTransactionsActionPerformed
        setVisible(false);
        try {
            new BorrowingTransactionsView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnBorrowingTransactionsActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        setVisible(false);
        try {
            new ReturnView().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnReturnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookCategories;
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnBorrowingTransactions;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMembers;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
