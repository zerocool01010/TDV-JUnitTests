package org.example;

import java.util.HashMap;
import java.util.Map;

public class Padron {

    private Map<String, Persona> participantes = new HashMap<>();
    private Map<String, Boolean> votado = new HashMap<>();

    public Padron() {

    }
    public Persona getPersona(String key) {
        return participantes.get(key);
    }
    public void setVoto(String key) {
        Persona p = getPersona(key);
        if (p==null);
        boolean voto=votado.get(key);
        if (voto==true);
        votado.put(key, true);
    }

    public void AddVotante( Persona p) {
        participantes.put(p.getDNI(),p);
        votado.put(p.getDNI(), false);
    }

    public Map<String, Persona>getPartipantes(){
        return participantes;
    }
    public Map<String, Boolean> getVotado(){
        return votado;
    }


}