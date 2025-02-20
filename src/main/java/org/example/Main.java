package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Mapas mapas = new Mapas();
         AgentesClasses agentesClasses = new AgentesClasses();

         List<String> mapasOrdenados = mapas.getMapasOrdenados();
         System.out.println("Mapas Disponiveis");
         int numMapass =1;
         for (String mapa : mapasOrdenados){
             System.out.println(numMapass+"-"+mapa);
             numMapass++;
         }

         int escolhaMapas = 0;//evitar nao entrar no loop
         while(escolhaMapas < 1 || escolhaMapas > 11) {
             System.out.println("Escolha o número do mapa a ser jogado (1-11):");
             if (sc.hasNextInt()) {
                 escolhaMapas = sc.nextInt();
                 sc.nextLine(); // Consumir quebra de linha
                 if(escolhaMapas >=1 && escolhaMapas <= 11) {
                 String mapaEscolhido = mapas.getMapa(escolhaMapas);
                 String agentes = mapas.getAgentesRecomendados(escolhaMapas);

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
         List<String> agentesClassesOrdenados = agentesClasses.getClassesAgentesOrdenados();
         System.out.println("Classes Disponiveis para Seleção de Agentes");
         int numClasses = 1;
         for (String classe : agentesClassesOrdenados){
             System.out.println(numClasses+"-"+classe);
             numClasses++;
         }
         int escolhaClasses = 0;
         while (escolhaClasses<1|| escolhaClasses > 4) {
             System.out.println("Selecione uma das Classes entre 1-4:");
             if (sc.hasNextInt()) {
                 escolhaClasses = sc.nextInt();
                 sc.nextLine();
                 if(escolhaClasses >=1 && escolhaClasses <= 4) {
                     String classeEscolhida = agentesClasses.getClasseAgente(escolhaClasses);
                     System.out.println("Classe escolhido: " + classeEscolhida);
                 }
                 else{
                     System.out.println("Numero invalido, por favor selecione entre 1-4:");
                 }

             }
             else{
                 System.out.println("Numero invalido, por favor selecione entre 1-4:");
                 sc.nextLine();
             }
         }



         sc.close(); // Fechar scanner
     }
}






