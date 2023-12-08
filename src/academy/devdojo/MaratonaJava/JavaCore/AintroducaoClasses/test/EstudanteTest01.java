package academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.test;

import academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Cleuvin";
        estudante.idade = 32;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
//Na classe estudanteTest01 temos a chamada dos atributos da classe de dominio
//       se refere ao estudade.nome = "Cleuvin";
// Ou seja a classe estudade com o uso do ponto, faz referencia ao atributo nome que no exemplo esta recebendo
//      o valor "Cleuvin"