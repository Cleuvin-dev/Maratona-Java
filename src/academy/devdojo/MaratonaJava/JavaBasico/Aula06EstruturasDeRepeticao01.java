package academy.devdojo.MaratonaJava.JavaBasico;

// Estruturas de repetição: são representadas pelas palavras reservadas
// while = enquanto || do while = faça enquanto || for = para
public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1; // seria como se fosse count = count + 1
        }
        // a Diferença do WHile e Do-While é que o While ele executa somente se a condição passada for true
        // o Do-While ele executa pelo menos uma vez indenpente da situção como no exemplo abaixo.
        count = 0;
        do {
            System.out.println("Dentro do do-while contando até: " + ++count);
        } while (count < 10);
        System.out.println("-------------------------------------------------------------------------------------");
        // Estrudor For
        // Um for é representado da seguinte maneira:
        // for (variavel recebe um valor; condição deste valor; e oque sera feito com este valor atraveis da condição)
        for (int i = 0; i < 10; i++) {
            System.out.println("For "+i);
            /** <h1>Um exemplo de representação dele em Portugol seria deste forma</h1>
             * Algoritmo ExemploFor
             * Var
             *     contador: inteiro
             *
             * Inicio
             *     // A estrutura de repetição for abaixo irá contar de 1 a 5
             *     Para contador de 1 ate 5 faca
             *         Escreva("Contagem: ", contador)
             *     FimPara
             * FimAlgoritmo
             *
             */


        }
    }
}
