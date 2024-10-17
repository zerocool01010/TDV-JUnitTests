import org.example.Persona;
import org.junit.*;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class PersonaTest {

    static Persona ejemplos[];
    static Persona casoActual;
    static Persona buCasoActual;

    @BeforeClass
    public static void cargarEjemplos() throws Exception {
        ejemplos= new Persona[6];

        ejemplos[0] = new Persona("Juan","26.150.235","1979-01-01",42,true);
        ejemplos[1]  = new Persona("Pedro","27.280.234","1980-02-01",41,true);
        ejemplos[2]  = new Persona("Maria","28.184.259","1981-03-01",47,true);
        ejemplos[3]  = new Persona("Cecilia","32.234.528","1983-04-01",38,true);
        ejemplos[4] = new Persona("Carlos","33.124.235","1985-04-01",36,true);
        ejemplos[5]  = new Persona("Jose","35.345.534","1987-04-01",34,true);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Bye byte ");
    }

    @Before
    public void elegirUno() throws Exception {
        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        //genera un numero entre 1 y 5 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = generadorAleatorios.nextInt(PersonaTest.ejemplos.length);
        casoActual=ejemplos[numeroAleatorio];
        //  buCasoActual= clone(casoActual)

    }

    @Test
    public void testHabilitadoParaVotar() {
        boolean obtenido = casoActual.isHabilitadoParaVotar();
        boolean esperado = casoActual.getEdad()>16;
        assertEquals(obtenido, esperado);
    }

}
