public class Aluno {
    int matricula;
    String nome;
    Curso curso = new Curso();
    // Quarto quarto = new Quarto();

    Aluno(int matri, String nome){
        this.matricula = matri;
        this.nome = nome;
    }

    public void exibirRelatorio() {
        System.out.print("Matricula: " + matricula + "\n");
        System.out.print("Nome: " + nome + "\n");
        if(curso.estaAprovado()){
            System.out.print("APROVADO");
        }else{
            System.out.print("REPROVADO");
        }
    }
}
