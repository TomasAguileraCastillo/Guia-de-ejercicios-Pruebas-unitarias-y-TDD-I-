package cl.praxis.servicios;

import cl.praxis.modelos.Persona;

import java.util.HashMap;
import java.util.Map;

/**
 * Nombre del Package :cl.praxis.servicios
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : viernes 14 de junio de 2024
 * 14-06-2024 13:08
 * Nombre del Proyecto ejercicio1maven
 */
public class ServicioPersona {

    private Map<String, String> personasDB = new HashMap<>();

    //Metodos
    public String crearPersona(Persona persona) {
        if (persona != null) {
            personasDB.put(persona.getRut(), persona.getNombre());
            return "Creada";
        } else {
            return "No creada";
        }
    }

    public String actualizarPersona(Persona persona) {
        if (persona != null) {
            personasDB.put(persona.getRut(), persona.getNombre());
            return "Actualizada";
        } else {
            return "No actualizada";
        }
    }

    public Map<String, String> listarPersonas() {
        return personasDB;
    }


    public String eliminarPersona(Persona persona) {
        if (persona != null) {
            personasDB.remove(persona.getRut());
            return "Eliminada";
        } else {
            return "No eliminada";
        }
    }

}

