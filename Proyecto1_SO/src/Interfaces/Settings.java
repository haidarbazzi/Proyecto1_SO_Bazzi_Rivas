/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

/**
 *
 * @author andre
 */
public class Settings extends javax.swing.JPanel {

    /**
     * Creates new form Disney
     */
    public Settings() {
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

        jLabel5 = new javax.swing.JLabel();
        companyName = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dayBetweenReleaseInput = new javax.swing.JTextField();
        numPlotTwistersInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dayLengthInput = new javax.swing.JTextField();
        numAssemblersInput = new javax.swing.JTextField();
        numAnimatorsInput = new javax.swing.JTextField();
        numScriptWritersInput = new javax.swing.JTextField();
        numDesignersInput = new javax.swing.JTextField();
        numTranslatorsInput = new javax.swing.JTextField();
        saveFile = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 248, 226));
        setForeground(new java.awt.Color(2, 4, 15));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 4, 15));
        jLabel5.setText("Ajustes de la Simulación");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        companyName.setBackground(new java.awt.Color(11, 19, 43));
        companyName.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        companyName.setForeground(new java.awt.Color(239, 248, 226));
        companyName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nickelodeon", "Disney" }));
        companyName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        companyName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 4, 15));
        jLabel1.setText("Compañía");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 4, 15));
        jLabel2.setText("Dia entre Estrenos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 4, 15));
        jLabel3.setText("Duracion del Dia");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        dayBetweenReleaseInput.setBackground(new java.awt.Color(239, 248, 226));
        dayBetweenReleaseInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        dayBetweenReleaseInput.setForeground(new java.awt.Color(2, 4, 15));
        dayBetweenReleaseInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayBetweenReleaseInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        dayBetweenReleaseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBetweenReleaseInputActionPerformed(evt);
            }
        });
        add(dayBetweenReleaseInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 130, 30));

        numPlotTwistersInput.setBackground(new java.awt.Color(239, 248, 226));
        numPlotTwistersInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        numPlotTwistersInput.setForeground(new java.awt.Color(2, 4, 15));
        numPlotTwistersInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numPlotTwistersInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        numPlotTwistersInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPlotTwistersInputActionPerformed(evt);
            }
        });
        add(numPlotTwistersInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 130, 30));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 4, 15));
        jLabel4.setText("Numero de Trabajadores Inicial");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 440, 10));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 4, 15));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Guionistas");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 4, 15));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Disenadores");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 4, 15));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Animadores");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 4, 15));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Actores");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(2, 4, 15));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Guionistas de Plot Twists");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 4, 15));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ensambladores");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        dayLengthInput.setBackground(new java.awt.Color(239, 248, 226));
        dayLengthInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        dayLengthInput.setForeground(new java.awt.Color(2, 4, 15));
        dayLengthInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayLengthInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        dayLengthInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayLengthInputActionPerformed(evt);
            }
        });
        add(dayLengthInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 130, 30));

        numAssemblersInput.setBackground(new java.awt.Color(239, 248, 226));
        numAssemblersInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        numAssemblersInput.setForeground(new java.awt.Color(2, 4, 15));
        numAssemblersInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numAssemblersInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        numAssemblersInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAssemblersInputActionPerformed(evt);
            }
        });
        add(numAssemblersInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 130, 30));

        numAnimatorsInput.setBackground(new java.awt.Color(239, 248, 226));
        numAnimatorsInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        numAnimatorsInput.setForeground(new java.awt.Color(2, 4, 15));
        numAnimatorsInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numAnimatorsInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        numAnimatorsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAnimatorsInputActionPerformed(evt);
            }
        });
        add(numAnimatorsInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 130, 30));

        numScriptWritersInput.setBackground(new java.awt.Color(239, 248, 226));
        numScriptWritersInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        numScriptWritersInput.setForeground(new java.awt.Color(2, 4, 15));
        numScriptWritersInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numScriptWritersInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        numScriptWritersInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numScriptWritersInputActionPerformed(evt);
            }
        });
        add(numScriptWritersInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 30));

        numDesignersInput.setBackground(new java.awt.Color(239, 248, 226));
        numDesignersInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        numDesignersInput.setForeground(new java.awt.Color(2, 4, 15));
        numDesignersInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numDesignersInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        numDesignersInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDesignersInputActionPerformed(evt);
            }
        });
        add(numDesignersInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, 30));

        numTranslatorsInput.setBackground(new java.awt.Color(239, 248, 226));
        numTranslatorsInput.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        numTranslatorsInput.setForeground(new java.awt.Color(2, 4, 15));
        numTranslatorsInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numTranslatorsInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 19, 43), 1, true));
        numTranslatorsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTranslatorsInputActionPerformed(evt);
            }
        });
        add(numTranslatorsInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 130, 30));

        saveFile.setBackground(new java.awt.Color(11, 19, 43));
        saveFile.setForeground(new java.awt.Color(239, 248, 226));
        saveFile.setText("Guardar");
        add(saveFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void dayBetweenReleaseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBetweenReleaseInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayBetweenReleaseInputActionPerformed

    private void numPlotTwistersInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPlotTwistersInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPlotTwistersInputActionPerformed

    private void dayLengthInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayLengthInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayLengthInputActionPerformed

    private void numAssemblersInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAssemblersInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAssemblersInputActionPerformed

    private void numAnimatorsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAnimatorsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAnimatorsInputActionPerformed

    private void numScriptWritersInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numScriptWritersInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numScriptWritersInputActionPerformed

    private void numDesignersInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDesignersInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDesignersInputActionPerformed

    private void numTranslatorsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTranslatorsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTranslatorsInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> companyName;
    private javax.swing.JTextField dayBetweenReleaseInput;
    private javax.swing.JTextField dayLengthInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField numAnimatorsInput;
    private javax.swing.JTextField numAssemblersInput;
    private javax.swing.JTextField numDesignersInput;
    private javax.swing.JTextField numPlotTwistersInput;
    private javax.swing.JTextField numScriptWritersInput;
    private javax.swing.JTextField numTranslatorsInput;
    private javax.swing.JButton saveFile;
    // End of variables declaration//GEN-END:variables
}
