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
public class Laser extends Impressora {

    public static List<Laser> impLaser = new ArrayList();
    double capacidadeToner;
    boolean frenteVerso;

    public Laser(double capacidadeToner, boolean frenteVerso, String modelo, String marca, boolean colorida, double peso) {
        super(modelo, marca, colorida, peso);
        this.capacidadeToner = capacidadeToner;
        this.frenteVerso = frenteVerso;
    }

    public Laser() {
    }

    public double getCapacidadeToner() {
        return capacidadeToner;
    }

    public void setCapacidadeToner(double capacidadeToner) {
        this.capacidadeToner = capacidadeToner;
    }

    public boolean isFrenteVerso() {
        return frenteVerso;
    }

    public void setFrenteVerso(boolean frenteVerso) {
        this.frenteVerso = frenteVerso;
    }

    

}
