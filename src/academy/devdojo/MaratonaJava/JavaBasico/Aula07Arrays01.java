package academy.devdojo.MaratonaJava.JavaBasico;

/**
 * Um array na programação é uma estrutura de dados que armazena elementos do mesmo tipo,
 * acessíveis por índices. Esses elementos estão organizados de forma contígua na memória.
 * Os arrays podem ter tamanho fixo ou dinâmico, exigem declaração e inicialização,
 * e suportam operações comuns, como leitura, escrita, ordenação e busca.
 * Podem ser unidimensionais ou multidimensionais. Essenciais para lidar com conjuntos de dados,
 * os arrays oferecem eficiência no acesso direto aos elementos por meio de índices.
 */

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // declaração de um Array
        int [] idades = new int[2];
        idades[0] = 21;
        idades[1] = 32;
        idades[2] = 60;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
