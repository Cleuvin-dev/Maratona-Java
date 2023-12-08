package academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.test;

import academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println(professor.nome + " tem a idade de " + professor.idade + " e eh do sexo " + professor.sexo);
    }
}
