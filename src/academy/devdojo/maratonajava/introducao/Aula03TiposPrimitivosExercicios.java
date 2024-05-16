package academy.devdojo.maratonajava.introducao;
/**
 * Prática
 * Crie variáveis para os campos abaixo entre <> e imprima a seguinte mensagem;
 * Eu <nome>, morando no endereço <enderenço>, confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Cleuvin";
        String adress = "Times Square";
        double salary = 15000.00D;
        String date = "16/05/2024";

        System.out.println("Eu " + name + " morando no endereço " + adress + ", confirmo que recebi o salario " +
                salary + " na data de " + date);

        // Poderia ser declarado deste forma tambem como no exemplo abaixo
        String describe = "Eu " +name+ " morando no endereço " +adress+ ", confirmo que recebi o salario " +
                salary+ " na data de " +date;
        System.out.println(describe);

    }
}
