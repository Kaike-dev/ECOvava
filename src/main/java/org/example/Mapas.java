package org.example;
import java.util.HashMap;
import java.util.Map;

public class Mapas() {
   private final Map<Integer, String> mapas;
   private final Map<Integer, String> agentesRecomendados;

   public Mapas(){
       mapas = new HashMap<>();
       agentesRecomendados = new HashMap<>();

       //Adiciona mapas por número
       mapas.put(1,"Abyss");
       mapas.put(2,"Ascent");
       mapas.put(3,"Bind");
       mapas.put(4,"Breeze");
       mapas.put(5,"Fracture");
       mapas.put(6,"Haven");
       mapas.put(7,"Icebox");
       mapas.put(8,"Lotus");
       mapas.put(9,"Pearl");
       mapas.put(10,"Split");
       mapas.put(11,"Sunset");
       //Agentes recomendados
       agentesRecomendados.put(1,"Jett,Sova,Kay/O,Cypher,Astra");
       agentesRecomendados.put(2,"Jett,Sova,Kay/O,Killjoy,Omen");
       agentesRecomendados.put(3,"Raze,Skye,Fade or Kay/O, Cypher or Viper, Brimstone");
       agentesRecomendados.put(4,"Jett,Sova,Kay/O,Cypher,Viper");
       agentesRecomendados.put(5,"Raze,Tejo,Breach,Killjoy,Brimstone");
       agentesRecomendados.put(6,"Jett,Sova,Breach,Cypher,Omen");
       agentesRecomendados.put(7,"Jett,Sova,Sage/Harbor,Killjoy,viper");
       agentesRecomendados.put(8,"Raze,Breach,Fade,Cypher or Vyse,Omen");
       agentesRecomendados.put(9,"Jett,Sova,Kay/O or Tejo or Phoenix,");
       agentesRecomendados.put(10, "");
       agentesRecomendados.put(11, "");


    }

}





