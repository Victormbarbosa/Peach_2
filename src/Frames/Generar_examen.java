/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Asignatura;
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
public class Generar_examen extends javax.swing.JFrame {

    /**
     * Creates new form Generar_examen
     */
    Profesor p = new Profesor();
    Tema t;
    static boolean sw = true;

    public Generar_examen() {
        initComponents();
        this.setLocationRelativeTo(null);
        if (sw == true) {
            comboAsignatura(p);
            String nombre = (String) asignatura.getSelectedItem();
            comboTemas(p, nombre);
            sw = false;
        }

    }

    public void comboAsignatura(Profesor P) {
        for (Asignatura a : P.getAsignaturas()) {
            asignatura.addItem(a.getNombre());
        }
    }

    public void comboTemas(Profesor P, String nombre) {
        Asignatura asig = null;
        for (Asignatura a : P.getAsignaturas()) {
            if (a.getNombre().equals(nombre)) {
                asig = a;
            }
        }
        for (Tema t : asig.getTemas()) {
            temas.addItem(t.getNombre());
        }
    }

    public ArrayList<Pregunta> getPreguntasNivel(String x, String y, String i) {
        ArrayList<Pregunta> temp = new ArrayList();
        Asignatura asig = null;
        Tema tema;
        for (Asignatura a : p.getAsignaturas()) {
            if (a.getNombre().equals(x)) {
                asig = a;
            }
        }
        for (Tema t : asig.getTemas()) {
            if (t.getNombre().equals(y)) {
                tema = t;
            }
        }
//        switch (i) {
//            case "1":
//                temp = t.getPreguntas1();
//                break;
//            case "2":
//                temp = t.getPreguntas2();
//                break;
//            case "3":
//                temp = t.getPreguntas3();
//                break;
//        }
        temp = t.getPreguntas1();
        return temp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        asignatura = new javax.swing.JComboBox<>();
        temas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        preg = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nivpr = new javax.swing.JComboBox<>();
        fecha = new javax.swing.JTextField();
        evaluacion = new javax.swing.JTextField();
        materia = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre del Profesor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 110, -1));

        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Evaluacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));

        jLabel4.setText("Fecha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, -1));

        jLabel2.setText("Asignatura:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, -1));

        generar.setText("Generar Examen");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel1.add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 246, 48));

        jLabel5.setText("Tema");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel6.setText("Asignatura");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });
        jPanel1.add(asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 200, -1));

        temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temasActionPerformed(evt);
            }
        });
        jPanel1.add(temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 200, -1));

        jLabel7.setText("Numero de preguntas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        preg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel1.add(preg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, -1));

        jLabel8.setText("Nivel de dificultad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        nivpr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel1.add(nivpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 200, -1));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, -1));
        jPanel1.add(evaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, -1));
        jPanel1.add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, -1));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        // TODO add your handling code here:
        String titulo = "Examen de " + materia.getText();
        String nom = "Nombre del profesor: " + nombre.getText();
        String mat = "Asignatura: " + materia.getText();
        String ev = "Evaluacion: " + evaluacion.getText();
        String fec = "Fecha: " + fecha.getText();
        String numero = (String) preg.getSelectedItem();
        int num = Integer.parseInt(numero);
//        String nivel = (String) nivpr.getSelectedItem();
//        String x = (String) asignatura.getSelectedItem();
//        String y = (String) temas.getSelectedItem();
//        ArrayList<Pregunta> temp = new ArrayList();
//        temp = getPreguntasNivel(x, y, nivel);
//        int size = temp.size();
//        boolean a = true;

        XWPFDocument documento = new XWPFDocument();

        //Declaramos el titulo y le asignamos algunas propiedades
        XWPFParagraph titulo_doc = documento.createParagraph();
        titulo_doc.setAlignment(ParagraphAlignment.CENTER);
        titulo_doc.setVerticalAlignment(TextAlignment.TOP);

        //Declaramos el parrafo y le asignamos algunas propiedades
        XWPFParagraph parrafo = documento.createParagraph();
        parrafo.setAlignment(ParagraphAlignment.BOTH);
        XWPFRun r1 = titulo_doc.createRun();
        r1.setBold(true);
        r1.setText(titulo);
        r1.setFontFamily("Times New Roman");
        r1.setFontSize(14);
        r1.setTextPosition(10);
        r1.setUnderline(UnderlinePatterns.SINGLE);

        //Para el parrafo
        XWPFRun r2 = parrafo.createRun();
        r2.setText(nom);
        r2.setFontSize(12);
        r2.addCarriageReturn();

        XWPFRun r3 = parrafo.createRun();
        r3.setText(mat);
        r3.setFontSize(12);
        r3.addCarriageReturn();

        XWPFRun r4 = parrafo.createRun();
        r4.setText(ev);
        r4.setFontSize(12);
        r4.addCarriageReturn();

        XWPFRun r5 = parrafo.createRun();
        r5.setText(fec);
        r5.setFontSize(12);
        r5.addCarriageReturn();

//        int j = 5 + num;
//        int k = 5;
//
//        while(a){
//            int random = (int) (Math.random() * (0 - size));
//            String preg = temp.get(random).getContenido();
        String preg = "¿Por que la gallina cruzo el camino?";
        XWPFRun r6 = parrafo.createRun();
        r6.setText("1. "+preg);
        r6.setFontSize(12);
        r6.addCarriageReturn();

        if (num == 2) {
            String preg1 = "¿Que vino primero el huevo o la gallina?";
            XWPFRun r7 = parrafo.createRun();
            r7.setText("2. "+preg1);
            r7.setFontSize(12);
            r7.addCarriageReturn();
        }
//            k++;
//            if (k == j) {
//                a = false;
//            }
//        }
        FileOutputStream word = null;
        try {
            word = new FileOutputStream(titulo + ".docx");

            documento.write(word);
            word.close();

        } catch (IOException ex) {
            Logger.getLogger(Generar_examen.class.getName()).log(Level.SEVERE, null, ex);
        }

        //
        try {
            File path = new File(titulo + ".docx");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        InterfazPrincipal i = new InterfazPrincipal();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_generarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InterfazPrincipal i = new InterfazPrincipal();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaActionPerformed
        // TODO add your handling code here:
        comboAsignatura(p);
    }//GEN-LAST:event_asignaturaActionPerformed

    private void temasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temasActionPerformed
        // TODO add your handling code here:
        String nombre = (String) asignatura.getSelectedItem();
        comboTemas(p, nombre);
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
            java.util.logging.Logger.getLogger(Generar_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generar_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generar_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generar_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar_examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asignatura;
    private javax.swing.JTextField evaluacion;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton generar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField materia;
    private javax.swing.JComboBox<String> nivpr;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> preg;
    private javax.swing.JComboBox<String> temas;
    // End of variables declaration//GEN-END:variables
}
