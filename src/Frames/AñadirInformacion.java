/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Classes.Metodos;

/**
 *
 * @author Usuario
 */
public class AñadirInformacion extends javax.swing.JFrame {

    /**
     * Creates new form AñadirInformacion
     */
    public AñadirInformacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        Metodos e = new Metodos();
        int h = 0;
        try {
            h = e.Generador_de_Combobox("Profesor/Asignatura.txt", ComboAsignatura, h);
            if (h < 1) {
                JOptionPane.showMessageDialog(null, "No hay Asignaturas, deberia agregar alguna.");
            }
        } catch (IOException ex) {
            Logger.getLogger(AñadirInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboAsignatura = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ComboTemas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ComboDificultad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Pregunta = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(492, 542));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignatura");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 28));

        ComboAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        ComboAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAsignaturaActionPerformed(evt);
            }
        });
        jPanel1.add(ComboAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 36));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Temas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 20));

        ComboTemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        ComboTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTemasActionPerformed(evt);
            }
        });
        jPanel1.add(ComboTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 36));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dificultad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 20));

        ComboDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3" }));
        jPanel1.add(ComboDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        Pregunta.setViewportView(jTextArea1);

        jPanel1.add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 450, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Asignatura = (String) ComboAsignatura.getSelectedItem();
        String tema = (String) ComboTemas.getSelectedItem();
        Metodos e = new Metodos();
        String nom, jor;
        nom = Pregunta.getToolTipText();
        jor = (String) ComboDificultad.getSelectedItem();
        String total = jor + ";" + nom + ";";
        String temp = null;
        String x = "Profesor/" + Asignatura + "/" + tema + "/Preguntas_"+jor+".txt";
        if (Asignatura.equals("...")) {
            JOptionPane.showMessageDialog(null, "No ha Selccionado ninguna Asignatura.");
        } else {
            if (tema.equals("...")) {
                JOptionPane.showMessageDialog(null, "No ha Selccionado ningun Tema.");
            } else {
                if (jor.equals("...")) {
                    JOptionPane.showMessageDialog(null, "No ha Selccionado ninguna Dificultad.");
                } else {
                    if (nom.equals("")) {
                        JOptionPane.showMessageDialog(null, "No ha escrito ninguna pregunta.");
                    } else {
                        try {
                            temp = e.concatenar(x);
                            e.guardar(temp, x, total);
                        } catch (IOException ex) {
                            Logger.getLogger(AñadirInformacion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        InterfazPrincipal ia = new InterfazPrincipal();
                        ia.setVisible(true);
                        dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAsignaturaActionPerformed
        String Asignatura = (String) ComboAsignatura.getSelectedItem();
        Metodos e = new Metodos();
        ComboTemas.removeAllItems();
        ComboTemas.addItem("...");
        int h = 0;
        try {

            h = e.Generador_de_Combobox("Profesor/" + Asignatura + "/Temas.txt", ComboTemas, h);
            if (h < 1) {
                JOptionPane.showMessageDialog(null, "La Asignatura que ha seleccionado no tiene Temas, sí desea usar esta asignatura es necesario que añada temas.");

            }
        } catch (IOException ex) {
            Logger.getLogger(AñadirInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboAsignaturaActionPerformed

    private void ComboTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTemasActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirInformacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAsignatura;
    private javax.swing.JComboBox<String> ComboDificultad;
    private javax.swing.JComboBox<String> ComboTemas;
    private javax.swing.JScrollPane Pregunta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
