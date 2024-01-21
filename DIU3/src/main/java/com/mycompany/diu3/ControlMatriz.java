/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu3;

import javax.swing.JTextArea;



/**
 *
 * @author TESTER
 */
public class ControlMatriz {
    
    private Matriz m;
    private String mtexto;
    private int limite; // Nuevo atributo para almacenar el límite actual
    private final JTextArea textoMatriz;

    public ControlMatriz(JTextArea textoMatriz) {
        this.m = new Matriz();
        this.limite = 1;
        this.textoMatriz = textoMatriz;  // Inicializar el área de texto
    }
    
    /**
     * Methods
     */

    public void llenarMatriz(){
        this.m.llenarMatriz(0, 10);
        this.verMatriz();
    }
    
    public void actualizarMatriz(int lower, int upper, int limite){
        this.m.llenarMatriz(lower, upper);
        this.limite = limite; // Actualizar el límite actual
        this.verMatriz();
    }
    
    public void verEstaMatriz(int n){
        this.verMatriz();
    }
    
    public void verMatriz() {
    int[][] currentMatrix = this.m.getM();
    this.mtexto = new String();

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (currentMatrix[i][j] < this.limite) {
                mtexto += " - ";
            } else {
                mtexto += " " + currentMatrix[i][j] + " ";
            }
        }
        mtexto += "\n";
    }
    // Actualiza el área de texto después de cambiar la visualización
    // sin modificar la matriz subyacente
    textoMatriz.setText(mtexto);
}

    public void actualizarLimite(int nuevoLimite) {
        this.limite = nuevoLimite;
    }
    
    public String getTexto(){
        return this.mtexto;
    }
    
    public Matriz getMatriz(){
        return this.m;
    }
}
