/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Metodos;
import Frames.InterfazPrincipal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ver_Preguntas extends javax.swing.JFrame {

    /**
     * Creates new form Ver_Preguntas
     */
    public Ver_Preguntas() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            AsigInicio();
        } catch (IOException ex) {
            Logger.getLogger(Ver_Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    File A;

    public void AsigInicio() throws IOException {
        Metodos e = new Metodos();
        int h = 0;
        try {
            e.Generador_de_Combobox("Profesor/Asignatura.txt", asignatura, h);
            e.Generador_de_Combobox("Profesor/Asignatura.txt", asign, h);
            if (h < 1) {
                JOptionPane.showMessageDialog(null, "No hay Asignaturas, deberia agregar alguna.");
            }
        } catch (IOException ex) {
            Logger.getLogger(AñadirInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Mostrar(String S) {
        try {
            A = new File(S);
            FileReader fr = new FileReader(A);
            BufferedReader br = new BufferedReader(fr);
            String n;
            String line = br.readLine();
            ver.setText(null);
            while (line != null) {
                ver.append(line + "\n");
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        asign = new javax.swing.JComboBox<>();
        tema = new javax.swing.JComboBox<>();
        dificultad = new javax.swing.JComboBox<>();
        verAsignatura = new javax.swing.JButton();
        verTemas = new javax.swing.JButton();
        verPreguntas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        asignatura = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ver = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(713, 542));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setBackground(new java.awt.Color(255, 255, 255));
        atras.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignatura");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temas");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preguntas");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 290, 150, -1));

        asign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignActionPerformed(evt);
            }
        });
        getContentPane().add(asign, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 140, -1));

        tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        getContentPane().add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 140, -1));

        dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3" }));
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });
        getContentPane().add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 140, -1));

        verAsignatura.setBackground(new java.awt.Color(255, 255, 255));
        verAsignatura.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verAsignatura.setText("Ver Asignatura");
        verAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAsignaturaActionPerformed(evt);
            }
        });
        getContentPane().add(verAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 130, -1));

        verTemas.setBackground(new java.awt.Color(255, 255, 255));
        verTemas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verTemas.setText("Ver temas");
        verTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTemasActionPerformed(evt);
            }
        });
        getContentPane().add(verTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 150, -1));

        verPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        verPreguntas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verPreguntas.setText("Ver Preguntas");
        verPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPreguntasActionPerformed(evt);
            }
        });
        getContentPane().add(verPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });
        jPanel3.add(asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, 240));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 170, 240));

        ver.setColumns(20);
        ver.setRows(5);
        jScrollPane1.setViewportView(ver);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 630, 186));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        InterfazPrincipal ip = new InterfazPrincipal();
        ip.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void verAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAsignaturaActionPerformed
        // TODO add your handling code here:
        Mostrar("Profesor/Asignatura.txt");
    }//GEN-LAST:event_verAsignaturaActionPerformed

    private void verTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTemasActionPerformed
        // TODO add your handling code here:
        String Asignatura = (String) asignatura.getSelectedItem();
        String direccion = "Profesor/" + Asignatura + "/Temas.txt";

        Mostrar(direccion);

    }//GEN-LAST:event_verTemasActionPerformed

    private void verPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPreguntasActionPerformed
        String Asignatura = (String) asign.getSelectedItem();
        String Tema = (String) tema.getSelectedItem();
        String Dificultad = (String) dificultad.getSelectedItem();
        String direccion = "Profesor/" + Asignatura + "/" + Tema + "/Preguntas_" + Dificultad + ".txt";

        Mostrar(direccion);

        
// TODO add your handling code here:
    }//GEN-LAST:event_verPreguntasActionPerformed

    private void asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_asignaturaActionPerformed

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificultadActionPerformed

    private void asignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignActionPerformed
        String Asignatura = (String) asign.getSelectedItem();
        Metodos e = new Metodos();
        tema.removeAllItems();
        tema.addItem("...");
        int h = 0;
        try {

            h = e.Generador_de_Combobox("Profesor/" + Asignatura + "/Temas.txt", tema, h);
            if (h < 1) {
                JOptionPane.showMessageDialog(null, "La Asignatura que ha seleccionado no tiene Temas, sí desea usar esta asignatura es necesario que añada temas.");

            }
        } catch (IOException ex) {
            Logger.getLogger(AñadirInformacion.class.getName()).log(Level.SEVERE, null, ex);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_asignActionPerformed

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
            java.util.logging.Logger.getLogger(Ver_Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asign;
    private javax.swing.JComboBox<String> asignatura;
    private javax.swing.JButton atras;
    private javax.swing.JComboBox<String> dificultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tema;
    private javax.swing.JTextArea ver;
    private javax.swing.JButton verAsignatura;
    private javax.swing.JButton verPreguntas;
    private javax.swing.JButton verTemas;
    // End of variables declaration//GEN-END:variables
}
