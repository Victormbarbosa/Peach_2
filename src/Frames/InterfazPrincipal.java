package Frames;

import Classes.Asignatura;
import Classes.Metodos;
import Classes.Pregunta;
import Classes.Profesor;
import Classes.Tema;
import Frames.Generar_examen;
import Frames.Menu_Añadir;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    Profesor p = new Profesor();
    Tema t;
    static boolean sw = true;

    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    UIManager.put("TabbedPane.borderHightlightColor", java.awt.Color.CYAN); 
    UIManager.put("TabbedPane.darkShadow", java.awt.Color.CYAN); 
    UIManager.put("TabbedPane.light", java.awt.Color.CYAN);
    UIManager.put("TabbedPane.selectHighlight", java.awt.Color.CYAN);
    UIManager.put("TabbedPane.darkShadow", java.awt.Color.CYAN);
    UIManager.put("TabbedPane.focus", java.awt.Color.CYAN);
    }

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
            File A = new File(S);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        VerInfo = new rsbuttom.RSButtonMetro();
        AddInfo = new rsbuttom.RSButtonMetro();
        VerPerfil = new rsbuttom.RSButtonMetro();
        NueExa = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        MPanel = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        verAsignatura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        verTemas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        asignatura = new javax.swing.JComboBox<>();
        asign = new javax.swing.JComboBox<>();
        tema = new javax.swing.JComboBox<>();
        dificultad = new javax.swing.JComboBox<>();
        verPreguntas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ver = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        materia = new javax.swing.JTextField();
        evaluacion = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        nivpr = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        preg = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        temas = new javax.swing.JComboBox<>();
        asignatura1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(124, 7, 100));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerInfo.setBackground(new java.awt.Color(255, 204, 0));
        VerInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_e70a(0)_48.png"))); // NOI18N
        VerInfo.setText("Ver Informacion");
        VerInfo.setColorHover(new java.awt.Color(255, 204, 102));
        VerInfo.setColorNormal(new java.awt.Color(255, 204, 0));
        VerInfo.setColorPressed(new java.awt.Color(153, 0, 153));
        VerInfo.setHideActionText(true);
        VerInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInfoActionPerformed(evt);
            }
        });
        jPanel4.add(VerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

        AddInfo.setBackground(new java.awt.Color(255, 204, 0));
        AddInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_e738(0)_48.png"))); // NOI18N
        AddInfo.setText("Añadir Informacion");
        AddInfo.setColorHover(new java.awt.Color(255, 204, 102));
        AddInfo.setColorNormal(new java.awt.Color(255, 204, 0));
        AddInfo.setColorPressed(new java.awt.Color(153, 0, 153));
        AddInfo.setHideActionText(true);
        AddInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInfoActionPerformed(evt);
            }
        });
        jPanel4.add(AddInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 50));

        VerPerfil.setBackground(new java.awt.Color(255, 204, 0));
        VerPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_d83d(1)_48.png"))); // NOI18N
        VerPerfil.setText("Perfil");
        VerPerfil.setColorHover(new java.awt.Color(255, 204, 102));
        VerPerfil.setColorNormal(new java.awt.Color(255, 204, 0));
        VerPerfil.setColorPressed(new java.awt.Color(153, 0, 153));
        VerPerfil.setHideActionText(true);
        VerPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VerPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPerfilActionPerformed(evt);
            }
        });
        jPanel4.add(VerPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 50));

        NueExa.setBackground(new java.awt.Color(255, 204, 0));
        NueExa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_d83d(0)_48.png"))); // NOI18N
        NueExa.setText("Nuevo Examen");
        NueExa.setColorHover(new java.awt.Color(255, 204, 102));
        NueExa.setColorNormal(new java.awt.Color(255, 204, 0));
        NueExa.setColorPressed(new java.awt.Color(153, 0, 153));
        NueExa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NueExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueExaActionPerformed(evt);
            }
        });
        jPanel4.add(NueExa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 195, 560));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_2630(0)_80.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(255, 102, 0));
        rSButtonMetro1.setColorNormal(new java.awt.Color(255, 102, 0));
        rSButtonMetro1.setColorPressed(new java.awt.Color(255, 102, 0));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        jPanel5.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 64, 52));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

        MPanel.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        MPanel.addTab("tab4", jPanel10);

        jPanel6.setBackground(new java.awt.Color(255, 153, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verAsignatura.setBackground(new java.awt.Color(255, 255, 255));
        verAsignatura.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verAsignatura.setText("Ver Asignatura");
        verAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAsignaturaActionPerformed(evt);
            }
        });
        jPanel6.add(verAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 130, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignatura");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 240));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temas");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 150, -1));

        verTemas.setBackground(new java.awt.Color(255, 255, 255));
        verTemas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verTemas.setText("Ver temas");
        verTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTemasActionPerformed(evt);
            }
        });
        jPanel6.add(verTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 150, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preguntas");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 150, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });
        jPanel3.add(asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 170, 240));

        asign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignActionPerformed(evt);
            }
        });
        jPanel6.add(asign, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 140, -1));

        tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel6.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 140, -1));

        dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3" }));
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });
        jPanel6.add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 140, -1));

        verPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        verPreguntas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verPreguntas.setText("Ver Preguntas");
        verPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPreguntasActionPerformed(evt);
            }
        });
        jPanel6.add(verPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 140, -1));

        ver.setColumns(20);
        ver.setRows(5);
        jScrollPane1.setViewportView(ver);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 630, 186));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 170, 240));

        MPanel.addTab("tab1", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 153, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 200, -1));
        jPanel7.add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 200, -1));
        jPanel7.add(evaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 200, -1));
        jPanel7.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 200, -1));

        nivpr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel7.add(nivpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, -1));

        jLabel8.setText("Nivel de dificultad:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        preg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel7.add(preg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, -1));

        jLabel7.setText("Numero de preguntas:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temasActionPerformed(evt);
            }
        });
        jPanel7.add(temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 200, -1));

        asignatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignatura1ActionPerformed(evt);
            }
        });
        jPanel7.add(asignatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, -1));

        jLabel6.setText("Asignatura");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel5.setText("Tema");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        generar.setText("Generar Examen");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel7.add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 246, 48));

        jLabel4.setText("Asignatura:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, -1));

        jLabel9.setText("Fecha:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 110, -1));

        jLabel10.setText("Evaluacion:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 110, -1));

        jLabel11.setText("Nombre del Profesor:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 110, -1));

        MPanel.addTab("tab2", jPanel7);

        jPanel8.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        MPanel.addTab("tab3", jPanel8);

        jPanel1.add(MPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 970, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoActionPerformed
        /*Ver_Preguntas g = new Ver_Preguntas();
        g.setVisible(true);
        dispose();*/
        jPanel4.setVisible(false);
        sw=false;
        try {
            AsigInicio();
        } catch (IOException ex) {
            Logger.getLogger(Ver_Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
        MPanel.setSelectedIndex(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_VerInfoActionPerformed

    private void NueExaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueExaActionPerformed
        /*Generar_examen g = new Generar_examen();
        g.setVisible(true);
        dispose();*/
        jPanel4.setVisible(false);
        sw=false;
        MPanel.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_NueExaActionPerformed

    private void AddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInfoActionPerformed
        jPanel4.setVisible(false);
        sw=false;
        MPanel.setSelectedIndex(3);
        /*Menu_Añadir ma = new Menu_Añadir();
        ma.setVisible(true);
        dispose();*/
// TODO add your handling code here:
    }//GEN-LAST:event_AddInfoActionPerformed

    private void VerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerPerfilActionPerformed

    private void verAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAsignaturaActionPerformed
        // TODO add your handling code here:
        Mostrar("Profesor/Asignatura.txt");
    }//GEN-LAST:event_verAsignaturaActionPerformed

    private void asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asignaturaActionPerformed

    private void verTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTemasActionPerformed
        // TODO add your handling code here:
        String Asignatura = (String) asignatura.getSelectedItem();
        String direccion = "Profesor/" + Asignatura + "/Temas.txt";

        Mostrar(direccion);
    }//GEN-LAST:event_verTemasActionPerformed

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

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dificultadActionPerformed

    private void verPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPreguntasActionPerformed
        String Asignatura = (String) asign.getSelectedItem();
        String Tema = (String) tema.getSelectedItem();
        String Dificultad = (String) dificultad.getSelectedItem();
        String direccion = "Profesor/" + Asignatura + "/" + Tema + "/Preguntas_" + Dificultad + ".txt";

        Mostrar(direccion);

        // TODO add your handling code here:
    }//GEN-LAST:event_verPreguntasActionPerformed

    private void temasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temasActionPerformed
        // TODO add your handling code here:
        String nombre = (String) asignatura.getSelectedItem();

    }//GEN-LAST:event_temasActionPerformed

    private void asignatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignatura1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_asignatura1ActionPerformed

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
        /* XWPFRun r2 = parrafo.createRun();
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

        String preg = "¿Por que la gallina cruzo el camino?";
        XWPFRun r6 = parrafo.createRun();
        r6.setText("1. " + preg);
        r6.setFontSize(12);
        r6.addCarriageReturn();*/
        String Salir = "No";
        int i = 0;
        while ("No".equals(Salir)) {
            i++;
            String preg = "" + i;
            XWPFRun r6 = parrafo.createRun();
            r6.setText("1. " + preg);
            r6.setFontSize(12);
            r6.addCarriageReturn();
            Salir = JOptionPane.showInputDialog(null, "Desea terminar si o no?");

        }
        if (num == 2) {
            String preg1 = "¿Que vino primero el huevo o la gallina?";
            XWPFRun r7 = parrafo.createRun();
            r7.setText("2. " + preg1);
            r7.setFontSize(12);
            r7.addCarriageReturn();
        }

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

    }//GEN-LAST:event_generarActionPerformed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        if(sw==true){
        jPanel4.setVisible(false);
        sw=false;
        }else{
        jPanel4.setVisible(true);
        sw=true;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro AddInfo;
    private javax.swing.JTabbedPane MPanel;
    private rsbuttom.RSButtonMetro NueExa;
    private rsbuttom.RSButtonMetro VerInfo;
    private rsbuttom.RSButtonMetro VerPerfil;
    private javax.swing.JComboBox<String> asign;
    private javax.swing.JComboBox<String> asignatura;
    private javax.swing.JComboBox<String> asignatura1;
    private javax.swing.JComboBox<String> dificultad;
    private javax.swing.JTextField evaluacion;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton generar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField materia;
    private javax.swing.JComboBox<String> nivpr;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> preg;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private javax.swing.JComboBox<String> tema;
    private javax.swing.JComboBox<String> temas;
    private javax.swing.JTextArea ver;
    private javax.swing.JButton verAsignatura;
    private javax.swing.JButton verPreguntas;
    private javax.swing.JButton verTemas;
    // End of variables declaration//GEN-END:variables
}
