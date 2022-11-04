/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_2010;

import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class CadImpressora {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        do {

            System.out.println("CADASTRO DE IMPRESSORAS");
            System.out.println("1 - Cadastrar impressora Matricial");
            System.out.println("2 - Cadastrar impressora Laser");
            System.out.println("3 - Listar impressora Matricial");
            System.out.println("4 - Listar impressora Laser");
            System.out.println("5 - Listar todas");
            System.out.println("6 - Sair");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1) {

                impMatricial();

            }
            if (opcao == 2) {
                impLaser();
            }
            if (opcao == 3) {
                System.out.println("LISTA MATRICIAIS");
                listarMatriciais();
            }
            if (opcao == 4) {
                System.out.println("LISTA LASERS");
                listarLasers();
            }
            if (opcao == 5) {
                System.out.println("LISTA TODAS");
                listarMatriciais();
                listarLasers();
            }

        } while (opcao != 6);

    }

    public static void impMatricial() {
        Scanner ler = new Scanner(System.in);
        Matricial nova = new Matricial();
        String colorido;
        String vias;

        System.out.println("CADASTRO IMPRESSORA MATRICIAL");
        System.out.println("Digite a marca: ");
        nova.setMarca(ler.nextLine());
        System.out.println("Digite o modelo: ");
        nova.setModelo(ler.nextLine());

        do {
            System.out.print("Imprime colorido (S/N): ");
            colorido = ler.nextLine();
            if (colorido.toUpperCase().equals("S")) {
                nova.setColorida(true);
            } else {
                nova.setColorida(false);
            }
        } while (!colorido.equalsIgnoreCase("N") && !colorido.equalsIgnoreCase("S"));

        do {
            System.out.print("Imprime vias (S/N): ");
            vias = ler.nextLine();
            if (vias.equalsIgnoreCase("S")) {
                nova.setImprimevias(true);
            } else {
                nova.setImprimevias(false);
            }
        } while (!vias.equalsIgnoreCase("N") && !vias.equalsIgnoreCase("S"));

        System.out.println("Número de agulhas: ");
        nova.setNumAgulhas(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o peso: ");
        nova.setPeso(Double.parseDouble(ler.nextLine().replace(",", ".")));
        Matricial.impMatricial.add(nova);
        System.out.println();
        System.out.println("IMPRESSORA MATRICIAL CADASTRADA");
        System.out.println();

    }

    public static void impLaser() {
        Scanner ler = new Scanner(System.in);
        Laser nova = new Laser();
        String colorido;
        String frenteverso;

        System.out.println("CADASTRO IMPRESSORA MATRICIAL");
        System.out.println("Digite a marca: ");
        nova.setMarca(ler.nextLine());
        System.out.println("Digite o modelo: ");
        nova.setModelo(ler.nextLine());
        do {
            System.out.print("Imprime colorido (S/N): ");
            colorido = ler.nextLine();
            if (colorido.equalsIgnoreCase("S")) {
                nova.setColorida(true);
            } else {
                nova.setColorida(false);
            }
        } while (!colorido.equalsIgnoreCase("N") && !colorido.equalsIgnoreCase("S"));
        do {
            System.out.print("Imprime frente e verso (S/N): ");
            frenteverso = ler.nextLine();
            if (frenteverso.equalsIgnoreCase("S")) {
                nova.setFrenteVerso(true);
            } else {
                nova.setFrenteVerso(false);
            }
        } while (!frenteverso.equalsIgnoreCase("N") && !frenteverso.equalsIgnoreCase("S"));
        System.out.println("Digite o peso: ");
        nova.setPeso(Double.parseDouble(ler.nextLine().replace(",", ".")));
        System.out.println("Capacidade toner: ");
        nova.setCapacidadeToner((Double.parseDouble(ler.nextLine().replace(",", "."))));

        Laser.impLaser.add(nova);
        System.out.println();
        System.out.println("IMPRESSORA LASER CADASTRADA");
        System.out.println();

    }

    public static void listarMatriciais() {
        System.out.println("IMPRESSORAS MATRICIAIS");
        if (Matricial.impMatricial.isEmpty()) {
            System.out.println("Nenhuma impressora cadastrada");
        } else {
            for (Matricial imp : Matricial.impMatricial) {
                System.out.println();
                System.out.println("Marca: " + imp.getMarca());
                System.out.println("Modelo: " + imp.getModelo());
                System.out.println("Impressão colorida: " + ((imp.isColorida()) ? "S" : "N"));
                System.out.println("Imprime vias: " + ((imp.isImprimevias()) ? "s" : "N"));
                System.out.println("Peso: " + imp.getPeso());
                System.out.println("Número de agulhas: " + imp.getNumAgulhas());
                System.out.println("===================================================");
                System.out.println();

            }
        }

    }
    public static void listarLasers() {
        System.out.println("IMPRESSORAS LASERS");
        if (Laser.impLaser.isEmpty()) {
            System.out.println("Nenhuma impressora cadastrada");
        } else {
            for (Laser imp : Laser.impLaser) {
                System.out.println();
                System.out.println("Marca: " + imp.getMarca());
                System.out.println("Modelo: " + imp.getModelo());
                System.out.println("Impressão colorida: " + ((imp.isColorida()) ? "S" : "N"));
                System.out.println("Imprime frente e verso: " + ((imp.isFrenteVerso()) ? "s" : "N"));
                System.out.println("Peso: " + imp.getPeso());
                System.out.println("Capacidade toner: " + imp.getCapacidadeToner());
                System.out.println("===================================================");
                System.out.println();

            }
        }

    }

}
