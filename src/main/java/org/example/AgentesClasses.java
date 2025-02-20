package org.example;

import java.util.*;

public class AgentesClasses {
    private final Map<Integer,String> classesAgentes;

    public AgentesClasses() {
        classesAgentes = new HashMap<Integer, String>();
        classesAgentes.put(1, "Duelista");
        classesAgentes.put(2, "Iniciador");
        classesAgentes.put(3, "Sentinela");
        classesAgentes.put(4, "Controlador");


    }
    public List<String> getClassesAgentesOrdenados(){
        List<String> listaClasses = new ArrayList<>(classesAgentes.values());
        Collections.sort(listaClasses);
        return listaClasses;

    }
    public String getClasseAgente(int numero){
        return classesAgentes.getOrDefault(numero,"Por favor escolha um número entre 1-4");
    }

}
