package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Persona;
import repositories.RepositoryPersonas;

@Path("/personas")
public class ServicesPersonas {

    RepositoryPersonas repo;

    public ServicesPersonas() {
        this.repo = new RepositoryPersonas();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Persona> getPersonas() {
        return this.repo.getPersonas();
    }

    //si un Metodo tiene parametros,dichos parametros
    //deben estar declarados
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Persona getPersona(@PathParam("id") String id) {
        int idpersona = Integer.parseInt(id);
        return this.repo.BuscarPersona(idpersona);
    }
}
