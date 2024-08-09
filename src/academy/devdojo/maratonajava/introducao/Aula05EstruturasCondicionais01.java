package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // Declaração da variavel recebendo o valor de 20
        int idade = 20;
        // Declaração de variavel booleana recebendo o valo condicional de, se idade for mais ou igual a18
        boolean isAutorizadoComprarBebida = idade >= 18;
        // inicio da condição - Se variavel booleana for tue imprime a saida de dados no corpo do IF
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica");
            // Se nao for, imprime a saida de dados do corpo do ELSE
        } else {
            System.out.println("Nao autorizado a comprar bebida alcolica!!");
        }
        // Somente para mostar um exemplo do codigo que esta fora do condicional
        System.out.println("Fora do IF");

        System.out.println("===========================================================");

    }
}
