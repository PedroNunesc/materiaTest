import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void Soma() {
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 147483648;
        int soma = calculadora.soma(147483647, 1);
        Assertions.assertEquals(resultadoesperado, soma);

    }
    @Test
    public void Subtracao(){
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 12;
        int subtracao = calculadora.subtracao(20, 8);
        Assertions.assertEquals(resultadoesperado, subtracao);
    }
    @Test
    public void Multiplicacao(){
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 24;
        int multiplicacao = calculadora.multiplicacao(4, 6);
        Assertions.assertEquals(resultadoesperado, multiplicacao);
    }
    @Test
    public void Divisao(){
        Calculadora calculadora = new Calculadora();
        int resultadoesperado = 100;
        int divisao = calculadora.divisao(1000, 10);
        Assertions.assertEquals(resultadoesperado, divisao);
    }
}
//@BeforeAll – Executa um método antes de todos os testes na classe.
//@AfterAll – Executa um método após todos os testes na classe.
//@Disabled – Desativa um teste ou classe de teste.