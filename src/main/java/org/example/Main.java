package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Mapas mapas = new Mapas();

         List<String> mapasOrdenados = mapas.getMapasOrdenados();
         System.out.println("Mapas Disponiveis");
         int num =1;
         for (String mapa : mapasOrdenados){
             System.out.println(num+"-"+mapa);
             num++;
         }

         int escolha = 0;//evitar nao entrar no loop
         while(escolha < 1 || escolha > 11) {
             System.out.println("Escolha o número do mapa a ser jogado (1-11):");
             if (sc.hasNextInt()) {
                 escolha = sc.nextInt();
                 sc.nextLine(); // Consumir quebra de linha
                 if(escolha >=1 && escolha <= 11) {
                 String mapaEscolhido = mapas.getMapa(escolha);
                 String agentes = mapas.getAgentesRecomendados(escolha);

                 System.out.println("Mapa escolhido: " + mapaEscolhido);
                 System.out.println("Agentes recomendados: " + agentes);
             } else {
                 System.out.println("Entrada inválida. Por favor,Escolha o número do mapa a ser jogado (1-11)");
             }
                }else{
                 System.out.println("Entrada inválida. Por favor,Escolha o número do mapa a ser jogado (1-11)");
                 sc.nextLine();//Evitar loop infinito
             }
         }
         sc.close(); // Fechar scanner
     }
}






