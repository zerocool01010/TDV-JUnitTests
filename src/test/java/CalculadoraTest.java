import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void testSumarTieneQueDarBien() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5");
    }

    @Test
    void testSumarTieneQueDarMal(){
        Calculadora calc = new Calculadora();
        int res = calc.sumar(3, 4);
        assertEquals(9, res, "La suma deberia ser 9");
    }
}
