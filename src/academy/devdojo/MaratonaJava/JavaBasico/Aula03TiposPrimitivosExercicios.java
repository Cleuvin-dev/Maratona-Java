package academy.devdojo.MaratonaJava.JavaBasico;

/**
 * <b>Exercico de pratica</b>
 * Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * Eu <nome> morando no endereço <endereço>,
 * confirmo que recebi o salario de <salario> na data <data>
 *
 *     resolução abaixo.
 */













public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Cleuvin";
        String adress = "Rua: Java, Numero: 20";
        double salary = 4562.00;
        String date = "05/12/2013";

        System.out.println("Eu "+name+" morando no endereço "+adress+", confirmo que recebi o salario de "+salary+" " +
                "na data de "+date+".");
    }
}
