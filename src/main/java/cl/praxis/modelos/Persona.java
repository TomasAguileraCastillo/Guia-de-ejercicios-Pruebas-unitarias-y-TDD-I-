package cl.praxis.modelos;

/**
 * Nombre del Package :cl.praxis.modelos
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : viernes 14 de junio de 2024
 * 14-06-2024 13:07
 * Nombre del Proyecto ejercicio1maven
 */
public class Persona {
    private String rut;
    private String nombre;
    public Persona(String rut, String nombre) {
        super();
        this.rut = rut;
        this.nombre = nombre;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
