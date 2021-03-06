/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PersonPanel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import models.PersonDirectory;

/**
 *
 * @author shreya
 */
public class MainPersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPersonPanel
     */
    PersonDirectory personDirectory;
    private JPanel WorkAreaPanel;
    public MainPersonPanel(JPanel WorkAreaPanel, PersonDirectory personDirectory) {
        initComponents();
        this.WorkAreaPanel = WorkAreaPanel;
        this.personDirectory = personDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePerson = new javax.swing.JButton();
        btnViewPerson = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 102, 255));

        btnCreatePerson.setBackground(new java.awt.Color(255, 255, 255));
        btnCreatePerson.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreatePerson.setText("Add Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnViewPerson.setBackground(new java.awt.Color(255, 255, 255));
        btnViewPerson.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnViewPerson.setText("View Person");
        btnViewPerson.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });

        lblHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("PERSON DASHBOARD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 380, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(331, 331, 331))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHeading)
                .addGap(100, 100, 100)
                .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnViewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        CreatePersonPanel createPerson = new CreatePersonPanel(WorkAreaPanel, personDirectory);
        WorkAreaPanel.add("CreatePersonPanel", createPerson);
        CardLayout cardLayout = (CardLayout) WorkAreaPanel.getLayout();
        cardLayout.next(WorkAreaPanel);
        
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed
        // TODO add your handling code here:
        ManagePersonPanel managePerson = new ManagePersonPanel(WorkAreaPanel, personDirectory);
        WorkAreaPanel.add("ManagePersonPanel", managePerson);
        CardLayout cardLayout = (CardLayout) WorkAreaPanel.getLayout();
        cardLayout.next(WorkAreaPanel);
    }//GEN-LAST:event_btnViewPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JLabel lblHeading;
    // End of variables declaration//GEN-END:variables
}
