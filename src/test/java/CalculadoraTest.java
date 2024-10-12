import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    public int randomIntCalc(int origin, int bound){
        Random r = new Random();
        int entero = r.nextInt(origin, bound);
        return entero;
    }

    @Test
    void testSumaPositiva() {
        int resultado = calc.sumar(randomIntCalc(0, 100), randomIntCalc(0, 100));
        //assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5");
        assertTrue(resultado > 0, "El resultado debe ser positivo");
        assertNotEquals(0, resultado, "El resultado debe ser diferente de 0");
        assertFalse(resultado < 0, "El resultado no debe ser negativo");
    }

    @Test
    void testSumaNegativa(){
        int resultado = calc.sumar(randomIntCalc(-100, 0), randomIntCalc(-100, 0));
        assertFalse(resultado > 0, "El resultado debe ser negativo");
        assertNotEquals(0, resultado, "El resultado debe ser diferente de 0");
        assertTrue(resultado < 0, "El resultado no debe ser positivo");
    }
}
