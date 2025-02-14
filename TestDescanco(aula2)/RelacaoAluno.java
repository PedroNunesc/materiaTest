public class RelacaoAluno { //Metodo que calcula o tipo de descanso que ele precisa

    public static String calcularDescanco(Aluno Aluno) {
        // Verificando o cansaco do aluno e retornando o tipo de descanso

        if (Aluno.getDescanso() <= 20) {
            return "Descanso diario suficiente! O aluno esta trenquilo.";
        } else if (Aluno.getDescanso() <= 50) {
            return "Descanso nos fins de semana! O aluno esta moderamente descansado.";
        } else if (Aluno.getDescanso() <= 80) {
            return "Ferias sao necessarias! O aluno esta exausto.";
        } else {
            return "Alerta! O aluno esta completamente exausto!";
        }
    }
}