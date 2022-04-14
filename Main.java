
class Main {


    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(1, "Reydner");
        Aluno aluno2 = new Aluno(2, "pedro");
       
        aluno1.curso.nome = "Ciencia da computação";
        aluno1.curso.disciplina1.nome = "Matematica";
        aluno1.curso.disciplina1.notaFinal = 7;
        aluno1.curso.disciplina1.professor.nome = "Pedro";

        aluno1.curso.disciplina2.nome = "Poo";
        aluno1.curso.disciplina2.notaFinal = 7;
        aluno1.curso.disciplina2.professor.nome = "Joao";

        aluno1.curso.disciplina3.nome = "Poo 2";
        aluno1.curso.disciplina3.notaFinal = 7;
        aluno1.curso.disciplina3.professor.nome = "Vitor";


        aluno2.curso.nome = "CPU";
        aluno2.curso.disciplina1.nome = "Matematica";
        aluno2.curso.disciplina1.notaFinal = 7;
        aluno2.curso.disciplina1.professor.nome = "Pedro";

        aluno2.curso.disciplina2.nome = "Poo";
        aluno2.curso.disciplina2.notaFinal = 7;
        aluno2.curso.disciplina2.professor.nome = "Joao";

        aluno2.curso.disciplina3.nome = "Poo 2";
        aluno2.curso.disciplina3.notaFinal = 7;
        aluno2.curso.disciplina3.professor.nome = "Vitor";


        aluno1.curso.calcularMedia();
        aluno2.curso.calcularMedia();

        aluno1.curso.disciplina1.retornarNotaFinal();

        aluno1.curso.disciplina1.exibirRelatorioDisc();
        aluno1.curso.disciplina2.exibirRelatorioDisc();

        aluno1.exibirRelatorio();
        aluno2.exibirRelatorio();



    }

  
}