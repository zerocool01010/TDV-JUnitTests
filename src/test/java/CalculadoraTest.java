import org.example.Calculadora;
import org.junit.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private static Calculadora calc;

    public int randomIntCalc(int origin, int bound){
        Random r = new Random();
        int entero = r.nextInt(origin, bound);
        return entero;
    }

//    // Este método se ejecuta antes de cada test y puede usarse para inicializar variables
//    @BeforeEach
//    void setUp() {
//        // No inicializamos 'calc' aquí para que esté en null al inicio de cada test
//    }
//
//    @Test
//    @BeforeEach
//    void testCalculadoraNoExistiendo() {
//        // Aquí verificamos que 'calc' aún no se ha instanciado
//        assertNull(calc, "La instancia de Calculadora debe devolver null");
//    }
//
//    @Test
//    @AfterEach
//    void testCalculadoraExistiendo(){
//        calc = new Calculadora();
//        assertNotNull(calc, "La instancia de Calculadora no debe devolver null");
//    }

    @BeforeClass
    public static void setUpCalc(){
        calc = new Calculadora();
        System.out.println("Seteando calculadora");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Bye byte ");
    }

    @Test
    public void testSumaPositiva() {
        int resultado = calc.sumar(randomIntCalc(0, 100), randomIntCalc(0, 100));
        //assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5");
        assertTrue(resultado > 0, "El resultado debe ser positivo");
        assertNotEquals(0, resultado, "El resultado debe ser diferente de 0");
        assertFalse(resultado < 0, "El resultado no debe ser negativo");
    }

    @Test
    public void testSumaNegativa(){
        int resultado = calc.sumar(randomIntCalc(-100, 0), randomIntCalc(-100, 0));
        assertFalse(resultado > 0, "El resultado debe ser negativo");
        assertNotEquals(0, resultado, "El resultado debe ser diferente de 0");
        assertTrue(resultado < 0, "El resultado no debe ser positivo");
    }
}

