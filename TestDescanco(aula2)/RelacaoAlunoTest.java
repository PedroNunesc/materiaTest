import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelacaoAlunoTest {
    public Aluno aluno1, aluno2, aluno3, aluno4;
    // Este metodo é executado antes de cada teste, prepranso os objetivos para o teste
@BeforeEach
    public void setup(){
System.out.println("Criando novos alunos ...");
//Criandos alunos com diferentes niveis de cansaso
    aluno1 = new Aluno("a", 80.0);// a com 80% de cansaso
    aluno2 = new Aluno("B", 10.0);
    aluno3 = new Aluno("C", 40.0);
    aluno4 = new Aluno("D", 90.0);
}
// teste simples para verificar o descanco do aluno1
    @Test
    public void TestDescansoSuficiente(){
    System.out.println("Testando descanso suficiente ...");
    String descanco = RelacaoAluno.calcularDescanco(aluno1);
    assertEquals("Ferias sao necessarias! O aluno esta exausto.", descanco, "Esperado descanco de ferias e o suficiente!");
    }
    // Teste para verificar o descanco dos outros alunos abaixo
}
@Test
public void TestDescansoModerado(){
    System.out.printf("Testando descanso suficiente ...");
    String descanco = RelacaoAluno.calcularDescanco(aluno2);
    assertEquals("Descanso diario suficiente! O aluno esta trenquilo.", descanco, "Esperado descanco de ferias e o suficiente!");
}