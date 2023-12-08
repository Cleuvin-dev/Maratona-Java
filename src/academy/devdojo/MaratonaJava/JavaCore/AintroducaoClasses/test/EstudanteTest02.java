package academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.test;

import academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        // Neste exemplo abaixo vemos que a classe estudade com a chamada do atributo nome recebe um outro valor em
        //      sua variavel, fazendo assim a troca na impressão do atributo.
        estudante.nome = "Mudança";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("========================================================");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);



    }
}
