/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Parvez
 */
public class AdminRecpPanelAdd extends javax.swing.JFrame {

    /**
     * Creates new form RecpPanel
     */
    public AdminRecpPanelAdd() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        remove = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        remove1 = new javax.swing.JLabel();
        remove2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMaritialCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jJoinningDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jGenderCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPhoneNo = new javax.swing.JTextField();
        jAddButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLeavingDate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jBloodGroupCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jclear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jQualification = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(24, 44, 97));

        add.setBackground(new java.awt.Color(0, 204, 204));
        add.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        remove.setBackground(new java.awt.Color(0, 204, 204));
        remove.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("Remove");
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 204, 204));
        update.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 204, 204));
        search.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        remove1.setBackground(new java.awt.Color(0, 204, 204));
        remove1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        remove1.setForeground(new java.awt.Color(255, 255, 255));
        remove1.setText("Receptionist");
        remove1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove1MouseClicked(evt);
            }
        });

        remove2.setBackground(new java.awt.Color(0, 204, 204));
        remove2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        remove2.setForeground(new java.awt.Color(255, 255, 255));
        remove2.setText("List");
        remove2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove2MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(remove1)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(remove2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(update)
                .addGap(46, 46, 46)
                .addComponent(search)
                .addGap(45, 45, 45)
                .addComponent(remove)
                .addGap(38, 38, 38)
                .addComponent(remove1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remove2)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, -1, -1));

        jPanel4.setBackground(new java.awt.Color(24, 44, 97));

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add Receptionist");

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hms60.png"))); // NOI18N
        jLabel1.setText("HMS");

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(24, 44, 97));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField11.setText("Abdul Wahid");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(232, 65, 24));
        jLabel13.setText("(Logout)");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 220, -1, -1));

        jFullName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 219, 198, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 270, -1, -1));

        jAge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeActionPerformed(evt);
            }
        });
        jPanel1.add(jAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 270, 72, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 320, -1, -1));

        jMaritialCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jMaritialCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Marrired", "Unmarried" }));
        jPanel1.add(jMaritialCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 439, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 370, -1, -1));

        jAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddressActionPerformed(evt);
            }
        });
        jPanel1.add(jAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 373, 483, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setText("Marital status ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 432, -1, -1));

        jJoinningDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jJoinningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 139, 149, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel12.setText("Joinning Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 136, -1, -1));

        jGenderCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jGenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));
        jPanel1.add(jGenderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 319, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel14.setText("Phone No.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 483, -1, -1));

        jPhoneNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 486, 175, -1));

        jAddButton.setBackground(new java.awt.Color(6, 82, 221));
        jAddButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jAddButton.setForeground(new java.awt.Color(255, 255, 255));
        jAddButton.setText("Add");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 194, 55));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel15.setText("Leaving Date");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 188, -1, -1));

        jLeavingDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLeavingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeavingDateActionPerformed(evt);
            }
        });
        jPanel1.add(jLeavingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 191, 149, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel18.setText("Blood Group");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, -1, -1));

        jBloodGroupCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jBloodGroupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(jBloodGroupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 120, -1, -1));

        jUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 121, 198, -1));

        jPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 170, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 170, -1, -1));

        jclear.setBackground(new java.awt.Color(234, 32, 39));
        jclear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jclear.setForeground(new java.awt.Color(255, 255, 255));
        jclear.setText("Clear");
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });
        jPanel1.add(jclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 90, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel16.setText("Qualifications");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, -1, -1));

        jQualification.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        AdminRecpPanelUpdate pupdate=new AdminRecpPanelUpdate();
        pupdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        AdminRecpPanelRemove pd=new AdminRecpPanelRemove();
        pd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        AdminRecpPanelSearch ps=new AdminRecpPanelSearch();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchMouseClicked

    private void jLeavingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeavingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLeavingDateActionPerformed

    private void jAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void remove1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove1MouseClicked
       AdminRecpPanelList apl=new AdminRecpPanelList();
       apl.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_remove1MouseClicked

    private void remove2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_remove2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        AdminHomePage la=new AdminHomePage();
        la.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        LoginAsFrame al=new LoginAsFrame();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddressActionPerformed

    private void jAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddButtonActionPerformed
if (jUsername.getText().isEmpty()
                || jPassword.getText().isEmpty()
                || jFullName.getText().isEmpty()
                || jAge.getText().isEmpty()
                || jGenderCombo.getSelectedItem().toString().equalsIgnoreCase("select")
                || jAddress.getText().isEmpty()
                || jMaritialCombo.getSelectedItem().toString().equalsIgnoreCase("select")
                || jPhoneNo.getText().isEmpty()
                || jJoinningDate.getText().isEmpty()
                || jLeavingDate.getText().isEmpty()
                || jBloodGroupCombo.getSelectedItem().toString().equalsIgnoreCase("select") ){
            JOptionPane.showMessageDialog(null, "Data Field is Empty",
                    "ERROR", JOptionPane.WARNING_MESSAGE);

        } else { 
        String username=jUsername.getText();
      String password=jPassword.getText();
      String name=jFullName.getText();
      String age=jAge.getText();
      String gender=jGenderCombo.getSelectedItem().toString();
      String address=jAddress.getText();
      String maritial=jMaritialCombo.getSelectedItem().toString();
      String phone=jPhoneNo.getText();
      String qualification=jQualification.getText();
      String blood=jBloodGroupCombo.getSelectedItem().toString();
      String joinDate=jJoinningDate.getText();
      String leaveDate=jLeavingDate.getText();
      
      Receptionist obj=new Receptionist(qualification, joinDate, leaveDate, name, age, gender, address, maritial, phone, blood, username, password);
      
      FileWrite fw=new FileWrite();
      fw.fileWriteReceptionist(obj);
      JOptionPane.showMessageDialog(null, "Data Added Successfully",
                    "success", JOptionPane.WARNING_MESSAGE);
      clear();
                                        
}
                                    

    }//GEN-LAST:event_jAddButtonActionPerformed
public void clear() {
      
        jUsername.setText("");
        jPassword.setText("");
        jFullName.setText("");
        jAge.setText("");
        jGenderCombo.setSelectedItem("Select");
        jAddress.setText("");
        jMaritialCombo.setSelectedItem("Select");
        jPhoneNo.setText("");
        jQualification.setText("");
        jBloodGroupCombo.setSelectedItem("Select");
        jJoinningDate.setText("");
        jLeavingDate.setText("");
    
     }
    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        clear();
    }//GEN-LAST:event_jclearActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRecpPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRecpPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRecpPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRecpPanelAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRecpPanelAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JButton jAddButton;
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jAge;
    private javax.swing.JComboBox<String> jBloodGroupCombo;
    private javax.swing.JTextField jFullName;
    private javax.swing.JComboBox<String> jGenderCombo;
    private javax.swing.JTextField jJoinningDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLeavingDate;
    private javax.swing.JComboBox<String> jMaritialCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jPhoneNo;
    private javax.swing.JTextField jQualification;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jUsername;
    private javax.swing.JButton jclear;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel remove1;
    private javax.swing.JLabel remove2;
    private javax.swing.JLabel search;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
