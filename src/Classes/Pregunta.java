/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * almacena una pregunta con respecto a su contenido y nivel
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Pregunta {

    String contenido;
    int nivel;

    public Pregunta(String contenido, int nivel) {
        this.contenido = contenido;
        this.nivel = nivel;
    }

    public String getContenido() {
        return contenido;
    }

    public int getNivel() {
        return nivel;
    }
    
    

}
