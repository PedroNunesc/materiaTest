import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliadorDeNotasTest {
    public Estudante estudante1, estudante2, estudante3, estudante4, estudante5;

    // Este metodo é executado antes de cada teste, prepranso os objetivos para o teste
    @BeforeEach
    public void setup() {
        System.out.println("Criando novos alunos ...");
//Criandos alunos com diferentes niveis de cansaso
        estudante1 = new Estudante("a", 10.0);// a com 80% de cansaso
        estudante2 = new Estudante("B", 30.0);
        estudante3 = new Estudante("C", 50.0);
        estudante4 = new Estudante("D", 75.0);
        estudante5 = new Estudante("E", 90.0);
    }

    // teste simples para verificar o descanco do aluno1
    @Test
    public void TestNotaReprovado() {
        System.out.println("Testando nota suficiente ...");
        String nota = AvaliadorDeNotas.AvaliacaoNotas(estudante1);
        assertEquals("Reprovado!", nota, "✓!");
        System.out.println("Estudante 1, Reprovado!");
    }

    @Test
    public void TestNotaInsuficiente() {
        System.out.println("Testando nota suficiente ...");
        String nota = AvaliadorDeNotas.AvaliacaoNotas(estudante2);
        assertEquals("Nota insuficiente!", nota, "✓!");
        System.out.println("Estudante 2, Nota insuficiente!");
    }
    @Test
    public void TestNotaRegular() {
        System.out.println("Testando nota suficiente ...");
        String nota = AvaliadorDeNotas.AvaliacaoNotas(estudante3);
        assertEquals("Nota regular!", nota, "✓!");
        System.out.println("Estudante 3, nota regular!");
    }
    @Test
    public void TestNotaBoa() {
        System.out.println("Testando nota suficiente ...");
        String nota = AvaliadorDeNotas.AvaliacaoNotas(estudante4);
        assertEquals("Nota boa!", nota, "✓!");
        System.out.println("Estudante 4, nota boa!");
    }
    @Test
    public void TestNotaExcelente() {
        System.out.println("Testando nota suficiente ...");
        String nota = AvaliadorDeNotas.AvaliacaoNotas(estudante5);
        assertEquals("Nota excelente!", nota, "✓!");
        System.out.println("Estudante 5, nota excelente!");
    }
}