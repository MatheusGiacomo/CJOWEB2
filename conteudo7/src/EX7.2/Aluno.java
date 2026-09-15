
public class Aluno {
    private String prontuario;
    private String nome;
    private double nota;

    public Aluno(String prontuario, String nome, double nota) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.nota = nota;
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}