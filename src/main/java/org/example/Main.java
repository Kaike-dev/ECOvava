package org.example;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Mapas mapas = new Mapas();
         System.out.println("Qual o mapa a ser jogado");
         if (sc.hasNextInt()) {
             int escolha = sc.nextInt();
             sc.nextLine();

             String mapaesclhido = mapas.getMapa(escolha);
         }







         }
     }





