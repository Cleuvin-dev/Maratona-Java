package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // 1 - todos escritos com letras minusculas
        // 2 - int, double, float, char, byte, short, long, boolean

        int numero = 33;
        double peso = 95.5D; // se coloca o D depoois do numero para fazer o casting de Double
        /**
         * para criar uma variavel segue o exemplo acima, a palavra reservada
         * (como no exemplo do comentario 2), e o nome da variavel com o valor
         * a ser atribuido, ou seja, a ser recebido.
         */

        // Para imprimir o valor adicionado a variavel segue o formato a baixo

        System.out.println(numero);
        // Para concatenar ou seja juntar uma frase com o valor atribuido a varivel, segue o exemplo abaixo.

        System.out.println("Seu peso é " + peso);
        // O texto entre aspas, com o sinal de + mais o nome da variavel

        float salario = 5500.00F; // se coloca o F depoois do numero para fazer o casting de Float
        byte anosDeXp = 1;
        short anosDeCarreira = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 10000000;
        char caractere = 'M';

        System.out.println("Terei um salario muito mairo que " + salario);
        System.out.println("De inicio a experiencia sera " + anosDeXp + " anos!");
        System.out.println("Terei um salario desse bem antes de " + anosDeCarreira + " anos!");
        System.out.println("Isso tudo é " + verdadeiro);
        System.out.println("Jamais será " + falso);
        System.out.println("Exemplo de uma variavel do tipo long: " + numeroGrande);
        System.out.println("Exemplo de uma variavel do tipo char: " + caractere);

        /**
         * Para declarar uma variavel que recebe um valor de texto, declaramos uma classe chamada String
         * onde ela recebe um valor ilimitado de caracteres formando um texto, segue exemplo abaixo.
         */
         String nomeDoSeuFuturoFuncionario = "Cleuvin Santos, me contrata como Dev";
         // para visualizar o texto segue o exemplo abaixo.
        System.out.println(nomeDoSeuFuturoFuncionario);

        /**
         * Apatir do Java 10, para declarar variaveis pode ser utilizar a sintave usando a palavra reservada
         * "var", mas para versões anterioremos ela nao irá funcionar.
         */
     //   var suaEmpresa = "Sera mais produtiva me contratando";
     //   System.out.println(suaEmpresa);

    }
}
