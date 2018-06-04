/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Crea ArrayList con preguntas, esto depende de la dificultad
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Tema {

    String Nombre;
    Asignatura asignatura;
    ArrayList<Pregunta> preguntas_1 = new ArrayList();
    ArrayList<Pregunta> preguntas_2 = new ArrayList();
    ArrayList<Pregunta> preguntas_3 = new ArrayList();

    public Tema(String titulo, Asignatura asig) {
        this.Nombre = titulo;
        this.asignatura = asig;
        this.preguntas_1 = new ArrayList();
        this.preguntas_2 = new ArrayList();
        this.preguntas_3 = new ArrayList();
        try {
            setPreguntas(1);
            setPreguntas(2);
            setPreguntas(3);
        } catch (IOException ex) {
            Logger.getLogger(Tema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Llena los ArrayList filtrando las preguntas en dificultades, para que cada ArrayList almacene las preguntas
     * @param r
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void setPreguntas(int r) throws FileNotFoundException, IOException {
        File f = new File("Profesor/" + asignatura.Nombre + "/" + Nombre + "/Preguntas_" + r + ".txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        Metodos e = new Metodos();
        int h = 0;

        while (br.ready()) {
            String contenido = br.readLine();
            if (contenido != null) {
                String info = e.Desco(contenido, 2);
                int Dificultad = Integer.parseInt(e.Desco(contenido, 1));
                switch (Dificultad) {
                    case 1:
                        addPregunta_1(new Pregunta(contenido, 2));
                        break;
                    case 2:
                        addPregunta_2(new Pregunta(contenido, 2));
                        break;
                    case 3:
                        addPregunta_3(new Pregunta(contenido, 2));
                        break;
                }
            }
        }
    }

    public void addAsignatura(Asignatura asig) {
        asignatura = asig;
    }

    private void addPregunta_1(Pregunta e) {
        preguntas_1.add(e);
    }

    private void addPregunta_2(Pregunta e) {
        preguntas_2.add(e);
    }

    private void addPregunta_3(Pregunta e) {
        preguntas_3.add(e);
    }

    public String getNombre() {
        return this.Nombre;
    }

    public ArrayList<Pregunta> getPreguntas1() {
        return this.preguntas_1;
    }

    public ArrayList<Pregunta> getPreguntas2() {
        return this.preguntas_2;
    }

    public ArrayList<Pregunta> getPreguntas3() {
        return this.preguntas_3;
    }
    
    public String getPregunta1 (int i){
        return this.preguntas_1.get(i).getContenido();
    }
    
    public String getPregunta2 (int i){
        return this.preguntas_2.get(i).getContenido();
    }
    
    public String getPregunta3 (int i){
        return this.preguntas_3.get(i).getContenido();
    }

}
