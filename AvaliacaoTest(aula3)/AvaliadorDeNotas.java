public class AvaliadorDeNotas {

    public static String AvaliacaoNotas(Estudante Estudante) {
        // Verificando o cansaco do aluno e retornando o tipo de descanso

        if (Estudante.getNotaFinal() < 30) {
            return "Reprovado!";
        } else if (Estudante.getNotaFinal() >= 30 && Estudante.getNotaFinal() < 50) {
            return "Nota insuficiente!";
        } else if (Estudante.getNotaFinal() >= 50 && Estudante.getNotaFinal() < 75) {
            return "Nota regular!";
        } else if (Estudante.getNotaFinal() >= 75 && Estudante.getNotaFinal() < 90){
            return "Nota boa!";
        } else if (Estudante.getNotaFinal() >= 90 && Estudante.getNotaFinal() <= 100) {
            return "Nota excelente!";
        } else {
            return "Nota nao esclarecida! Tente novamente.";
        }
    }
}

