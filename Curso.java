public class Curso {
    String nome;
    Disciplina disciplina1 = new Disciplina();
    Disciplina disciplina2 = new Disciplina();
    Disciplina disciplina3 = new Disciplina();


    public float calcularMedia(){
        return (disciplina1.notaFinal + disciplina2.notaFinal + disciplina3.notaFinal) / 3;
    }

    public boolean estaAprovado(){
        float x = this.calcularMedia();
        if(x > 60){
            return true;
        }
        return false;
    }

    public float notaPorDisciplina(int nun) {
        return 1;
    }
}