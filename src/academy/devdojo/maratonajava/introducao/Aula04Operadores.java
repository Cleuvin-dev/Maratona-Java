package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /**
         * O operadores básicos no Java são o + (adição), - (subtração), * (Multiplicação) e / (Divisão)
         */

        int num01 = 20;
        int num02 = 11;

        System.out.println("Exemplo de uma adição: " + (num01 + num02));
        System.out.println("Exemplo de uma subtração: " + (num01 - num02));
        System.out.println("Exemplo de uma multiplicação: " + (num01 * num02));
        System.out.println("Exemplo de uma Divisão: " + (num01 / num02));
        System.out.println("==============================================================");
        /**
         * Os demais operadores básicos (Mas nao muito kkk), são os de resto da divisão - % -
         * e os operadores lógicos
         */
        // O operador de resto da divisão é bastante usado para descobrir se um numero é par ou impar

        int resto = 20 % 2;
        System.out.println(resto);
        // Exemplo de condicional para saber se é par ou impar
        /**
         * if (resto == 0){
         *             System.out.println("O numero é par");
         *         }else{
         *             System.out.println("O numero é impar");
         *         }
         */
        System.out.println("==============================================================");
        // Operadores lógicos sempre retornaram um valor booleano ou seja True ou False
        // são eles: < (Menor) > (Maior) <= (Menor ou igual) >= (Maior ou igual) == (igual) != (Diferente)
        int num03 = 15;
        int num04 = 29;
        System.out.println(num03 > num04); // False
        System.out.println(num03 < num04); // True
        System.out.println(num03 <= num04); // True
        System.out.println(num03 >= num04); // False
        System.out.println(num03 == num04); // False
        System.out.println(num03 != num04); // True
        System.out.println("==============================================================");
        System.out.println("OPERADORES LOGICOS");
        /**
         * O operadores logicos são os que separam as acões tipo "vou fazer algo E(AND) ou coisa"
         * Ou então "VOu fazer isso OU(OR) aquilo"
         * AND é o &&
         * OR é o ||
         */
        // EXEMPLOS AND
        int idade = 33;
        float salario = 3500F;
        // Essa opera se lè: Se idade for maior que 30 E salario maior que 4212
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        // Essa opera se lè: Se idade for menor ou igual a 30 E salario maior ou igual a 3381
        boolean isDentrodaLeiMenorQueTrinta = idade <= 33 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentrodaLeiMenorQueTrinta " + isDentrodaLeiMenorQueTrinta);
        System.out.println("==============================================================");
        // EXEMPLO OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Compravel " + isPlaystationCincoCompravel);

        // Operadores de atribuição: =, +=, -=, *=, /=, %=
        double salarioBonus = 1800;
        System.out.println("O salario é " + salarioBonus);
        // double bonus = bonus + 1000;  - Desta forma nao esta correto fazer a atribuição
        // double bonus += 1000;  = Desta forma é mais profissional de declarar a atribuição
        salarioBonus += 1000;
        System.out.println("O salario agora é " + salarioBonus);
        // mais exemplos
        salarioBonus -= 1000;
        System.out.println(salarioBonus);
        salarioBonus *= 2; // salarioBonus = salarioBonus * 2
        System.out.println(salarioBonus);
        salarioBonus /= 2; // salarioBonus = salarioBonus / 2
        System.out.println(salarioBonus);
        salarioBonus %= 2; // salarioBonus = salarioBonus % 2
        System.out.println(salarioBonus);
        System.out.println("==============================================================");
        // Operadores Unarios
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++; // è a mesma coisa do exemplo acima, adionado mais 1 na var contador
        contador --; // contador = contador - 1
        // Acima ele executa a funcao e depois incrementa
        // Abaixo ele incrementa e depois executa a função
        ++contador;
        --contador;
        System.out.println(contador);


    }
}
