package Frames;

import Classes.Asignatura;
import Classes.Metodos;
import Classes.Pregunta;
import Classes.Profesor;
import Classes.Tema;
import Frames.Generar_examen;
import static Frames.Info_Examen.contador;
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
import java.text.SimpleDateFormat;
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
            Logger.getLogger(Añadir_Preguntas.class.getName()).log(Level.SEVERE, null, ex);
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
        Home = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        rSButtonMetro4 = new rsbuttom.RSButtonMetro();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        rSButtonMetro5 = new rsbuttom.RSButtonMetro();
        rSButtonMetro6 = new rsbuttom.RSButtonMetro();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        Npreg = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        Preguntas = new rsbuttom.RSButtonMetro();
        Temas = new rsbuttom.RSButtonMetro();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 0, 102));
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
        jPanel4.add(VerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 50));

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
        jPanel4.add(AddInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 190, 50));

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
        jPanel4.add(VerPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 190, 50));

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
        jPanel4.add(NueExa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 190, 50));

        Home.setBackground(new java.awt.Color(255, 204, 0));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_2302(0)_48.png"))); // NOI18N
        Home.setText("Home");
        Home.setColorHover(new java.awt.Color(255, 204, 102));
        Home.setColorNormal(new java.awt.Color(255, 204, 0));
        Home.setColorPressed(new java.awt.Color(153, 0, 153));
        Home.setHideActionText(true);
        Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel4.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 190, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 570));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMetro4.setColorHover(new java.awt.Color(255, 153, 102));
        rSButtonMetro4.setColorNormal(new java.awt.Color(255, 102, 0));
        rSButtonMetro4.setColorPressed(new java.awt.Color(249, 112, 0));
        rSButtonMetro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro4ActionPerformed(evt);
            }
        });
        jPanel5.add(rSButtonMetro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 60, -1));

        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_2630(0)_80.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(255, 153, 102));
        rSButtonMetro1.setColorNormal(new java.awt.Color(255, 102, 0));
        rSButtonMetro1.setColorPressed(new java.awt.Color(249, 112, 0));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        jPanel5.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        rSButtonMetro5.setColorHover(new java.awt.Color(255, 153, 102));
        rSButtonMetro5.setColorNormal(new java.awt.Color(255, 102, 0));
        rSButtonMetro5.setColorPressed(new java.awt.Color(249, 112, 0));
        rSButtonMetro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro5ActionPerformed(evt);
            }
        });
        jPanel5.add(rSButtonMetro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 60, -1));

        rSButtonMetro6.setColorHover(new java.awt.Color(244, 0, 0));
        rSButtonMetro6.setColorNormal(new java.awt.Color(255, 102, 0));
        rSButtonMetro6.setColorPressed(new java.awt.Color(255, 102, 102));
        rSButtonMetro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro6ActionPerformed(evt);
            }
        });
        jPanel5.add(rSButtonMetro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 60, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        MPanel.setBackground(new java.awt.Color(255, 51, 51));

        jPanel10.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
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
        jPanel6.add(verAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 130, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignatura");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 150, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 240));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temas");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, -1));

        verTemas.setBackground(new java.awt.Color(255, 255, 255));
        verTemas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verTemas.setText("Ver temas");
        verTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTemasActionPerformed(evt);
            }
        });
        jPanel6.add(verTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 150, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preguntas");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 150, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });
        jPanel3.add(asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 170, 240));

        asign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        asign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignActionPerformed(evt);
            }
        });
        jPanel6.add(asign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 140, -1));

        tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel6.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 140, -1));

        dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3" }));
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });
        jPanel6.add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 140, -1));

        verPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        verPreguntas.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        verPreguntas.setText("Ver Preguntas");
        verPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPreguntasActionPerformed(evt);
            }
        });
        jPanel6.add(verPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 140, -1));

        ver.setColumns(20);
        ver.setRows(5);
        jScrollPane1.setViewportView(ver);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 630, 186));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 170, 240));

        MPanel.addTab("tab1", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 200, -1));
        jPanel7.add(materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 200, -1));
        jPanel7.add(evaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, -1));

        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Asignatura:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, -1));

        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Fecha:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 110, -1));

        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("Evaluacion:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, -1));

        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("Nombre del Profesor:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, -1));

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 200, -1));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Numero de preguntas:");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        generar.setText("Generar Examen");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel11.add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 246, 48));
        jPanel11.add(Npreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 200, -1));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 460, 570));

        MPanel.addTab("tab2", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 153, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Preguntas.setBackground(new java.awt.Color(255, 204, 0));
        Preguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_d83d(2)_256.png"))); // NOI18N
        Preguntas.setColorHover(new java.awt.Color(255, 255, 0));
        Preguntas.setColorNormal(new java.awt.Color(255, 204, 0));
        Preguntas.setColorPressed(new java.awt.Color(204, 102, 0));
        Preguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreguntasActionPerformed(evt);
            }
        });
        jPanel8.add(Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 280, 180));

        Temas.setBackground(new java.awt.Color(255, 102, 102));
        Temas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_d83d(1)_256.png"))); // NOI18N
        Temas.setColorHover(new java.awt.Color(255, 153, 153));
        Temas.setColorNormal(new java.awt.Color(255, 102, 102));
        Temas.setColorPressed(new java.awt.Color(237, 94, 94));
        Temas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemasActionPerformed(evt);
            }
        });
        jPanel8.add(Temas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 280, 180));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Temas - Asignaturas");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 280, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Preguntas");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 280, 30));

        MPanel.addTab("tab3", jPanel8);

        jPanel1.add(MPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 800, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoActionPerformed
        /*Ver_Preguntas g = new Ver_Preguntas();
        g.setVisible(true);
        dispose();*/
 /*jPanel4.setVisible(false);
       sw = false;*/
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
 /*jPanel4.setVisible(false);
       sw = false;*/
        MPanel.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_NueExaActionPerformed

    private void AddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInfoActionPerformed
        /*jPanel4.setVisible(false);
       sw = false;*/
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
            Logger.getLogger(Añadir_Preguntas.class.getName()).log(Level.SEVERE, null, ex);
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

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        // TODO add your handling code here:
        String titulo = "Examen de " + materia.getText();
        String nom = "Nombre del profesor: " + nombre.getText();
        String mat = "Asignatura: " + materia.getText();
        String ev = "Evaluacion: " + evaluacion.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fec = "Fecha: " + dateFormat.format(fecha.getDate());

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
        int i = 1;
        int NumePreg = Integer.parseInt(Npreg.getText());

        while (i <= NumePreg) {
           
                i++;
                Info_Examen ie = new Info_Examen();
                ie.setVisible(true);
                String preg3 = "" + i;
                XWPFRun r7 = parrafo.createRun();
                r7.setText("1." + preg3);
                r7.setFontSize(12);
                r7.addCarriageReturn();
                
            JOptionPane.showMessageDialog(null, "Hola");
            contador = false;
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
        /*if (sw == true) {
            jPanel4.setVisible(false);
            sw = false;
        } else {
            jPanel4.setVisible(true);
            sw = true;
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void TemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemasActionPerformed
        Add_Asignatura_Tema ad = new Add_Asignatura_Tema();
        ad.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_TemasActionPerformed

    private void PreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreguntasActionPerformed
        Añadir_Preguntas ad = new Añadir_Preguntas();
        ad.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_PreguntasActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        /*jPanel4.setVisible(false);
       sw = false;*/
        MPanel.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void rSButtonMetro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro4ActionPerformed

    private void rSButtonMetro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro5ActionPerformed

    private void rSButtonMetro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro6ActionPerformed

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
    private rsbuttom.RSButtonMetro Home;
    private javax.swing.JTabbedPane MPanel;
    private javax.swing.JTextField Npreg;
    private rsbuttom.RSButtonMetro NueExa;
    private rsbuttom.RSButtonMetro Preguntas;
    private rsbuttom.RSButtonMetro Temas;
    private rsbuttom.RSButtonMetro VerInfo;
    private rsbuttom.RSButtonMetro VerPerfil;
    private javax.swing.JComboBox<String> asign;
    private javax.swing.JComboBox<String> asignatura;
    private javax.swing.JComboBox<String> dificultad;
    private javax.swing.JTextField evaluacion;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JTextField nombre;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro4;
    private rsbuttom.RSButtonMetro rSButtonMetro5;
    private rsbuttom.RSButtonMetro rSButtonMetro6;
    private javax.swing.JComboBox<String> tema;
    private javax.swing.JTextArea ver;
    private javax.swing.JButton verAsignatura;
    private javax.swing.JButton verPreguntas;
    private javax.swing.JButton verTemas;
    // End of variables declaration//GEN-END:variables
}
