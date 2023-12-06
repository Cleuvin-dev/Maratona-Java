package academy.devdojo.MaratonaJava.JavaBasico;

import java.sql.SQLOutput;

/*
Nesta aula 04 iremos ver a respeito dos operadores Aritmeticos na sintaxe do Java
 */
public class Aula04Operadores {
    public static void main(String[] args) {
        // Opéradores basico " + adição, - menos, / divisao, * multiplicação"
        int num1 = 20;
        int num2 = 10;
        // Execute o codigo para ver o funcionamento de cada um.
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2);
        // Para fazer operações separas como em alguns caso na matetica, se usa as variveis entre parenteses
        System.out.println("------------------------------------------------------------------------------");
        int soma = 2;
        System.out.println(soma + (num1 + num2));
        System.out.println(soma - (num1 + num2));
        System.out.println(soma / (num1 + num2));
        System.out.println(soma * (num1 + num2));
        // Execute o codigo para ver o funcionamento de cada um.
        System.out.println("------------------------------------------------------------------------------");
        // Outros operadores são o de resto da divisao simbolizado pelo "%"
        int resto = 20 % 2;
        System.out.println(resto);
        System.out.println("------------------------------------------------------------------------------");
        // Operadores logicos usados pelos sinais de maior > e menor <, e tambem maior igual >= e menor igual <=
        // Opera de comparação é o igual igual ==
        // Operador de negação !=
        boolean isDezMaiorQUeVinte = 10 > 20;
        System.out.println("Dez eh maior que vinte? " + isDezMaiorQUeVinte); // aqui vai dar falso
        boolean isDezMenorQUeVinte = 10 < 20;
        System.out.println("Dez eh menor que vinte? " + isDezMenorQUeVinte); // aqui vai dar verdadeiro
        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("Dez eh igual a vinte? " + isDezIgualAVinte); // aqui vai dar falso
        boolean isDezIgualADez = 10 == 10;
        System.out.println("Dez eh igual a dez? " + isDezIgualADez); // aqui vai dar verdadeiro
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("Dez eh diferente de dez? " + isDezDiferenteDeDez); // aqui vai dar falso
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("Dez eh diferente de vinte? " + isDezDiferenteDeVinte); // aqui vai dar verdadeiro
        System.out.println("------------------------------------------------------------------------------");
        // Operador Logico AND (e) representado pelo &&
        // Operador Logico OR (ou) representado pelo ||
        // Operador Logico de negação representado pelo !

        // Exemplo do operador "e" &&
        int idade1 = 32;
        int idade2 = 20;
        float salario1 = 3500F;
        float salario2 = 3100F;
        boolean isDentroDaLeiMaiorQueTrinta = idade1 > 30 && salario1 >= 4612; // idade maior que 30 e salario maior que 4612
        boolean isDentroDaLeiMenorQueTrinta = idade2 < 30 && salario2 < 3381; // idade menor que 30 e salario menor que 4612
        System.out.println(isDentroDaLeiMaiorQueTrinta); // retorna falso
        System.out.println(isDentroDaLeiMenorQueTrinta); // retorna true
        System.out.println("------------------------------------------------------------------------------");
        // Exemplo do operador "ou" ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 500F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("O playStation 5 éh compravel? " + isPlaystationCincoCompravel); // retorna true
        System.out.println("------------------------------------------------------------------------------");
        // Mais sobre os Operadores
        // Agora os de atribuição = += -= *= /= %=
        double bonus = 1800;

        //  double bonus = bonus + 1000; // desta forma o Java nao aceita a compilação recebendo uma variavel dela mesma.
        // a forma correta de se fazer eh como no exemplo abaixo:
        bonus += 1000;
        System.out.println("Seu bonus foi para: " + bonus);
        System.out.println("------------------------------------------------------------------------------");
        // da mesma para retirar um valor da varivel
        bonus -= 1000;
        System.out.println("Agora o valor sera de: " + bonus);
        // Operadores Unarios
        System.out.println("------------------------------------------------------------------------------");
        int contador = 0;
       //  contador +=; Desta forma seria como se fosse -> contador = contador + 1
        contador ++; // Esta eh a forma correta de ser codificada
        System.out.println(contador);
        // Da mesma forma que tem o ++ tambem tem o de -- que seria o decrementador
        contador --;
        System.out.println(contador);
        System.out.println("------------------------------------------------------------------------------");
        // tambem existe a forma de incrementação e decrementação assim:
        ++contador;
        System.out.println(contador);
        --contador;
        System.out.println(contador);
        // A diferença entre elas sera o momento em que voce precise usa-las.


    }
}
