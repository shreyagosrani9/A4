/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PersonPanel;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.Person;
import models.PersonDirectory;

/**
 *
 * @author shreya
 */
public class CreatePersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonPanel
     */
    PersonDirectory personDirectory;
    private JPanel WorkAreaPanel;

    public CreatePersonPanel(JPanel WorkAreaPanel, PersonDirectory personDirectory) {
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

        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JComboBox<>();
        btnCreatePerson = new javax.swing.JButton();
        lblUniqueID = new javax.swing.JLabel();
        txtUniqueID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 102, 255));

        lblHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Create Person");

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setText("Name:");

        lblAge.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblAge.setText("Age");

        lblAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        lblCommunity.setBackground(new java.awt.Color(255, 255, 255));
        lblCommunity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblCommunity.setText("Community:");

        txtCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roxbury", "Mission Main", "Longwood", "Saint Germain" }));

        btnCreatePerson.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreatePerson.setText("Create");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        lblUniqueID.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUniqueID.setText("Unique ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUniqueID)
                            .addComponent(lblCommunity)
                            .addComponent(lblEmail)
                            .addComponent(lblAddress)
                            .addComponent(lblAge)
                            .addComponent(lblName))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUniqueID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(391, 391, 391))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHeading)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueID)
                    .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        String inputUniqueID = "";
        String inputName = "";
        String inputAddress = "";
        String inputEmail = "";
        String inputCommunity = "";
        int inputAge = 0;
        int initialSize = personDirectory.getPersonDirectory().size();
        inputUniqueID = txtUniqueID.getText();
            inputName = txtName.getText();
            try {
                inputAge = Integer.parseInt(txtAge.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter Integer values");
            }
            inputAddress = txtAddress.getText();

            inputEmail = txtEmail.getText();
            Pattern EmailPattern = Pattern.compile("^[a-zA-Z0-9_!#$%&???*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
            Matcher EmailMatcher = EmailPattern.matcher(inputEmail);

            if (EmailMatcher.matches()) {
                inputEmail = txtEmail.getText();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Email Address");
                inputEmail = "";
            }

            inputCommunity = txtCommunity.getSelectedItem().toString();

        if (inputUniqueID.equals("") || inputName.equals("") || inputAddress.equals("") || inputEmail.equals("") || inputCommunity.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Correct Values");
        } else {
            
            
            
            
            Person person = personDirectory.addPerson();

            // Check for Unique ID
            Set<String> uniqueIDList = new HashSet<String>();
            for (Person personList : personDirectory.getPersonDirectory()) {
                uniqueIDList.add(personList.getUnique_id());
            }

            if (uniqueIDList.contains(inputUniqueID)) {
                JOptionPane.showMessageDialog(this, "Person already exists");
                personDirectory.getPersonDirectory().remove(person);
            } else {
                person.setUnique_id(inputUniqueID);
                person.setName(inputName);
                person.setAge(inputAge);
                person.setEmail(inputEmail);
                person.setAddress(inputAddress);
                person.setCommunity(inputCommunity);
                if (initialSize < personDirectory.getPersonDirectory().size()) {
                    JOptionPane.showMessageDialog(this, "Person Added Successfully");
                }
            }

        }


    }//GEN-LAST:event_btnCreatePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUniqueID;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JComboBox<String> txtCommunity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUniqueID;
    // End of variables declaration//GEN-END:variables
}
