/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Asignatura;
import Classes.Metodos;
import Classes.Pregunta;
import Classes.Profesor;
import Classes.Tema;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author DORIS SALCEDO
 */
public class Info_Examen extends javax.swing.JFrame {

    /**
     * Creates new form Generar_examen
     */
    static boolean contador = false;

    public Info_Examen() {
        initComponents();
        contador = false;
        this.setLocationRelativeTo(null);
        Metodos e = new Metodos();
        int h = 0;
        try {
            h = e.Generador_de_Combobox("Profesor/Asignatura.txt", asignatura, h);
        } catch (IOException ex) {
            Logger.getLogger(Info_Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (h < 1) {
            JOptionPane.showMessageDialog(null, "No hay Asignaturas, deberia agregar alguna.");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        generar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        asignatura = new javax.swing.JComboBox<>();
        temas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nivpr = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(4, 4));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generar.setText("Generar Examen");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel1.add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 246, 48));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tema");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asignatura");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });
        jPanel1.add(asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 30));

        temas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temasActionPerformed(evt);
            }
        });
        jPanel1.add(temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nivel de dificultad");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        nivpr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3" }));
        jPanel1.add(nivpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        contador = true;
        dispose();
    }//GEN-LAST:event_generarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaActionPerformed
        // TODO add your handling code here:
        String Asignatura = (String) asignatura.getSelectedItem();
        Metodos e = new Metodos();
        temas.removeAllItems();
        temas.addItem("...");
        int h = 0;
        try {
            h = e.Generador_de_Combobox("Profesor/" + Asignatura + "/Temas.txt", temas, h);
        } catch (IOException ex) {
            Logger.getLogger(Info_Examen.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (h < 1) {
            JOptionPane.showMessageDialog(null, "La Asignatura que ha seleccionado no tiene Temas, sí desea usar esta asignatura es necesario que añada temas.");

        }
    }//GEN-LAST:event_asignaturaActionPerformed

    private void temasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_temasActionPerformed

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
            java.util.logging.Logger.getLogger(Info_Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info_Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info_Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info_Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info_Examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JComboBox<String> asignatura;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nivpr;
    private javax.swing.JComboBox<String> temas;
    // End of variables declaration//GEN-END:variables
}
