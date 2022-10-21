/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Profile;

/**
 *
 * @author sajja
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    Profile profile;
    public DisplayJPanel(Profile profile) {
        this.profile=profile;
        initComponents();
        displayProfile();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTxtFname = new javax.swing.JTextField();
        jTxtLname = new javax.swing.JTextField();
        jTxtDob = new javax.swing.JTextField();
        jTxtCity = new javax.swing.JTextField();
        jTxtCountry = new javax.swing.JTextField();
        jTxtStreet2 = new javax.swing.JTextField();
        jTxtAge = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtStreet1 = new javax.swing.JTextField();
        jTxtPh = new javax.swing.JTextField();
        jTxtAffiliation = new javax.swing.JTextField();
        jTxtMajor = new javax.swing.JTextField();
        jTxtCareer = new javax.swing.JTextField();
        jTxtDegree1 = new javax.swing.JTextField();
        jTxtDegree1S = new javax.swing.JTextField();
        jTxtDegree1E = new javax.swing.JTextField();
        jTxtDegree2 = new javax.swing.JTextField();
        jTxtDegree2S = new javax.swing.JTextField();
        jTxtDegree2E = new javax.swing.JTextField();
        jTxtPhoto = new javax.swing.JTextField();

        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Display User Profile");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("DOB");

        jLabel5.setText("Age");

        jLabel6.setText("Phone");

        jLabel7.setText("Email");

        jLabel8.setText("Street Line 1");

        jLabel9.setText("Street Line 2");

        jLabel10.setText("City");

        jLabel11.setText("Country");

        jLabel12.setText("Affiliation");

        jLabel13.setText("Major");

        jLabel14.setText("Career");

        jLabel15.setText("Degree 1");

        jLabel16.setText("Degree 1 Start");

        jLabel17.setText("Degree 1 End ");

        jLabel18.setText("Degree 2");

        jLabel19.setText("Degree 2 Start");

        jLabel20.setText("Degree 2 End");

        jLabel21.setText("Photo");

        jTxtFname.setText("                                                    ");
        jTxtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFnameActionPerformed(evt);
            }
        });

        jTxtLname.setText("                                  ");
        jTxtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLnameActionPerformed(evt);
            }
        });

        jTxtDob.setText("                                  ");
        jTxtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDobActionPerformed(evt);
            }
        });

        jTxtCity.setText("                                  ");
        jTxtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCityActionPerformed(evt);
            }
        });

        jTxtCountry.setText("                                  ");

        jTxtStreet2.setText("                                  ");
        jTxtStreet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtStreet2ActionPerformed(evt);
            }
        });

        jTxtAge.setText("                                  ");
        jTxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAgeActionPerformed(evt);
            }
        });

        jTxtEmail.setText("                                  ");
        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jTxtStreet1.setText("                                  ");
        jTxtStreet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtStreet1ActionPerformed(evt);
            }
        });

        jTxtPh.setText("                                  ");
        jTxtPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPhActionPerformed(evt);
            }
        });

        jTxtAffiliation.setText("                                  ");
        jTxtAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAffiliationActionPerformed(evt);
            }
        });

        jTxtMajor.setText("                                  ");
        jTxtMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMajorActionPerformed(evt);
            }
        });

        jTxtCareer.setText("                                  ");
        jTxtCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCareerActionPerformed(evt);
            }
        });

        jTxtDegree1.setText("                                  ");
        jTxtDegree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree1ActionPerformed(evt);
            }
        });

        jTxtDegree1S.setText("                                  ");
        jTxtDegree1S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree1SActionPerformed(evt);
            }
        });

        jTxtDegree1E.setText("                                  ");

        jTxtDegree2.setText("                                  ");
        jTxtDegree2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree2ActionPerformed(evt);
            }
        });

        jTxtDegree2S.setText("                                  ");
        jTxtDegree2S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree2SActionPerformed(evt);
            }
        });

        jTxtDegree2E.setText("                                  ");
        jTxtDegree2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree2EActionPerformed(evt);
            }
        });

        jTxtPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel19)))
                            .addComponent(jLabel21))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtDegree2S)
                            .addComponent(jTxtDegree2E)
                            .addComponent(jTxtDegree2)
                            .addComponent(jTxtDegree1E)
                            .addComponent(jTxtDegree1S)
                            .addComponent(jTxtDegree1)
                            .addComponent(jTxtCareer)
                            .addComponent(jTxtMajor)
                            .addComponent(jTxtDob)
                            .addComponent(jTxtEmail)
                            .addComponent(jTxtStreet1)
                            .addComponent(jTxtCountry)
                            .addComponent(jTxtAffiliation)
                            .addComponent(jTxtAge)
                            .addComponent(jTxtPh)
                            .addComponent(jTxtStreet2)
                            .addComponent(jTxtFname)
                            .addComponent(jTxtLname)
                            .addComponent(jTxtCity)
                            .addComponent(jTxtPhoto))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtPh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtStreet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTxtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDegree1S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDegree1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDegree2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDegree2S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDegree2E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFnameActionPerformed

    private void jTxtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLnameActionPerformed

    private void jTxtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDobActionPerformed

    private void jTxtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCityActionPerformed

    private void jTxtStreet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtStreet2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtStreet2ActionPerformed

    private void jTxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAgeActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtStreet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtStreet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtStreet1ActionPerformed

    private void jTxtPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPhActionPerformed

    private void jTxtAffiliationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAffiliationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAffiliationActionPerformed

    private void jTxtMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMajorActionPerformed

    private void jTxtCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCareerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCareerActionPerformed

    private void jTxtDegree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree1ActionPerformed

    private void jTxtDegree1SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree1SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree1SActionPerformed

    private void jTxtDegree2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree2ActionPerformed

    private void jTxtDegree2SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree2SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree2SActionPerformed

    private void jTxtDegree2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree2EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree2EActionPerformed

    private void jTxtPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPhotoActionPerformed
    public void displayProfile(){
        jTxtFname.setText(profile.getFirstName());
        jTxtLname.setText(profile.getLastName());
        jTxtDob.setText(profile.getDOB());
        jTxtAge.setText(profile.getAge());
        jTxtPh.setText(profile.getPhone());
        jTxtEmail.setText(profile.getEmail());
        jTxtStreet1.setText(profile.getStreetLine1());
        jTxtStreet2.setText(profile.getStreetLine2());
        jTxtCity.setText(profile.getCity());
        jTxtCountry.setText(profile.getCountry());
        jTxtAffiliation.setText(profile.getAffiliation());
        jTxtMajor.setText(profile.getMajor());
        jTxtCareer.setText(profile.getCareer());
        jTxtDegree1.setText(profile.getDegree1());
        jTxtDegree1S.setText(profile.getDegree1Start());
        jTxtDegree1E.setText(profile.getDegree1End());
        jTxtDegree2.setText(profile.getDegree2());
        jTxtDegree2S.setText(profile.getDegree2Start());
        jTxtDegree2E.setText(profile.getDegree2End());
        jTxtPhoto.setText(profile.getPhoto());
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtAffiliation;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtCareer;
    private javax.swing.JTextField jTxtCity;
    private javax.swing.JTextField jTxtCountry;
    private javax.swing.JTextField jTxtDegree1;
    private javax.swing.JTextField jTxtDegree1E;
    private javax.swing.JTextField jTxtDegree1S;
    private javax.swing.JTextField jTxtDegree2;
    private javax.swing.JTextField jTxtDegree2E;
    private javax.swing.JTextField jTxtDegree2S;
    private javax.swing.JTextField jTxtDob;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtFname;
    private javax.swing.JTextField jTxtLname;
    private javax.swing.JTextField jTxtMajor;
    private javax.swing.JTextField jTxtPh;
    private javax.swing.JTextField jTxtPhoto;
    private javax.swing.JTextField jTxtStreet1;
    private javax.swing.JTextField jTxtStreet2;
    // End of variables declaration//GEN-END:variables
}
