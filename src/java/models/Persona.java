package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private String email;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, int edad, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    //<editor-fold defaultstate="collapsed" desc="getter and setter">
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//</editor-fold>
}
