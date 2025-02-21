public class Estudante {

    public String nome; // Variavel que armazena o nome
    public Double notaFinal; // Variavel que armazena o cansaso

    public Estudante(String nome, Double notaFinal){ // construtctor
        this.nome = nome;
        this.notaFinal = notaFinal;
    }
    //Metodo que retorna o nome do aluno
    public String getNome(){
        return nome;
    }
    //Metodo que retorna o descanso
    public Double getNotaFinal(){
        return notaFinal;
    }
}