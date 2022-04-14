public class Disciplina {
    String nome;
    Professor professor = new Professor();
    float notaFinal;

    public void exibirRelatorioDisc(){
        System.out.print("\nDisciplina: " + nome);
        System.out.print("\nNome do professor: " + professor);
        System.out.print("\nNota: " + notaFinal);
    }
    public float retornarNotaFinal(){
        return notaFinal;
    }
}
