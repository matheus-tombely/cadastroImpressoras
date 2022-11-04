/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_2010;

/**
 *
 * @author laboratorio
 */
public class Impressora {
     String modelo;
     String marca;
     boolean colorida;
     double peso;

    public Impressora() {
    }

    public Impressora(String modelo, String marca, boolean colorida, double peso) {
        this.modelo = modelo;
        this.marca = marca;
        this.colorida = colorida;
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isColorida() {
        return colorida;
    }

    public void setColorida(boolean colorida) {
        this.colorida = colorida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
