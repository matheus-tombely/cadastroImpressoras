/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_2010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class Matricial extends Impressora {

    public static List<Matricial> impMatricial = new ArrayList();
    int numAgulhas;
    boolean imprimevias;

    public Matricial() {
    }

    public Matricial(int numAgulhas, boolean imprimevias, String modelo, String marca, boolean colorida, double peso) {
        super(modelo, marca, colorida, peso);
        this.numAgulhas = numAgulhas;
        this.imprimevias = imprimevias;
    }

    public int getNumAgulhas() {
        return numAgulhas;
    }

    public void setNumAgulhas(int numAgulhas) {
        this.numAgulhas = numAgulhas;
    }

    public boolean isImprimevias() {
        return imprimevias;
    }

    public void setImprimevias(boolean imprimevias) {
        this.imprimevias = imprimevias;
    }

    
    

}
