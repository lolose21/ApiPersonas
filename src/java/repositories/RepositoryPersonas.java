package repositories;

import java.util.ArrayList;
import java.util.List;
import models.Persona;

public class RepositoryPersonas {

    private List<Persona> personas;

    public RepositoryPersonas() {
        this.personas = new ArrayList<>();
        Persona p = new Persona(1, "Sofia", 10, "sofi@panti.com");
        this.personas.add(p);
        p = new Persona(7, "Pantoja", 11, "panti@pantini.com");
        this.personas.add(p);
        p = new Persona(2, "manolo", 10, "manolin@npi.com");
        this.personas.add(p);
        p = new Persona(3, "Paco", 22, "paquirin@tinti.com");
        this.personas.add(p);
        p = new Persona(4, "Teresa", 11, "teru@pi.com");
        this.personas.add(p);
        p = new Persona(5, "Nana", 22, "nadada@pai.com");
        this.personas.add(p);
        p = new Persona(6, "Pablo", 10, "pablin@nti.com");
        this.personas.add(p);
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }

    public Persona BuscarPersona(int id) {
        for (Persona p : this.personas) {
            if (p.getIdPersona() == id) {
                return p;
            }
        }
        return null;
    }
}
