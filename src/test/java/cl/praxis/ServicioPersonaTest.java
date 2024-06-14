package cl.praxis;

import cl.praxis.modelos.Persona;
import cl.praxis.servicios.ServicioPersona;
import org.junit.jupiter.api.*;

import java.util.Map;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Nombre del Package :cl.praxis
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : viernes 14 de junio de 2024
 * 14-06-2024 13:12
 * Nombre del Proyecto ejercicio1maven
 */

@DisplayName("Tests Clase ServicioPersona")
public class ServicioPersonaTest {
    private static Logger logger = Logger.getLogger("cl.desafiolatam.servicios.ServicioPersonaTest");
    private final ServicioPersona servicioPersona = new ServicioPersona();


    @BeforeAll
    public static void setup() {
        logger.info("Inicio clase de prueba se iniciaantes que todo lo demas ");
    }


    @BeforeEach
    public void init(){
        logger.info("-> se ejecuta antes de cada prueba");
    }

@AfterEach
public void closeEach(){
    logger.info("*** se ejecuta Despues de cada prueba ***");
}

@AfterAll

public static void close(){
    logger.warning("*** se ejecuta Despues de todas las prueba ***");
}


    @Test
    public void testCrearPersona() {
        logger.info("info test crear persona");
        //crear persona pasandole los datos a la clase
        Persona juanito = new Persona("1234-1", "Juanito");

        //deja en la variable la respuesta del metodo con los datos para la creacion
        String respuestaServicio = servicioPersona.crearPersona(juanito);

        //valida que la respuesta esperada sea la indicada
        assertEquals("Creada", respuestaServicio);
    }

    @Test
    public void testCrearPersonaConReturnNull() {
        logger.info("info test crear no null persona");

        //deja en la variable la respuesta del metodo con los datos para la creacion
        String respuestaServicio = servicioPersona.crearPersona(null);

        //valida que la respuesta esperada sea la indicada
        assertEquals ("No creada", respuestaServicio);
    }



    @Test
    public  void  testActualizarPersona(){
        //identifica que test a que metodo se esta realizando la prueba
        logger.info("info Actualizar Persona");
        //se crea a la persona en la clase persona
        Persona persona = new Persona("14093470-4", "Cecilio");
        //recibe la respuesta del metodo con los datos que se le pasaron de la variable persona
        String respuestaServicio = servicioPersona.actualizarPersona(persona);
        //evalua la respuesta si es satisfactotia o no
        assertEquals("Actualizada", respuestaServicio);

    }

    @Test
    public void testingListarPersona(){
        logger.info("info Listar Persona");
        //prueba del metodo
        Map<String, String> listaPersonas = servicioPersona.listarPersonas();

        //resultado esperado no debe ser nulo
        assertNotNull(listaPersonas);

    }


    @Test
    public void testElimniiarPersona() {
        logger.info("info test Eliminar persona");
        //crear persona pasandole los datos a la clase
        Persona juanito = new Persona("1234-1", "Juanito");

        //deja en la variable la respuesta del metodo con los datos para la creacion
        String respuestaServicio = servicioPersona.eliminarPersona(juanito);

        //valida que la respuesta esperada sea la indicada
        assertEquals("Eliminada", respuestaServicio);
    }






}
