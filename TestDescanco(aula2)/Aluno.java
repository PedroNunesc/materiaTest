public class Aluno {
    public String nome; // Variavel que armazena o nome
    public Double descanso; // Variavel que armazena o cansaso

    public Aluno(String nome, Double descanco){ // construtctor
        this.nome = nome;
        this.descanso = descanco;
    }
    //Metodo que retorna o nome do aluno
    public String getNome(){
        return nome;
    }
    //Metodo que retorna o descanso
    public Double getDescanso(){
        return descanso;
    }
    //Metodo que altera o nivel de cansaco
    public void stCansaco(Double cansaco){
        descanso = cansaco;
    }
}
