package dio.testandospringboot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTests {
    Calculadora calculadora = new Calculadora();
    
    @Test
    public void testSomarPositiveNumbers() {
        int result = calculadora.somar(5, 3);
        assertEquals(8, result);
    }

    @Test
        public void testSomarNegativeNumbers() {
            int result = calculadora.somar(-5, -3);
            assertEquals(-8, result);
        }

        @Test
        public void testSomarZeroAndPositiveNumber() {
            int result = calculadora.somar(0, 7);
            assertEquals(7, result);
        }

        @Test
        public void testSomarZeroAndNegativeNumber() {
            int result = calculadora.somar(0, -7);
            assertEquals(-7, result);
        }
}
