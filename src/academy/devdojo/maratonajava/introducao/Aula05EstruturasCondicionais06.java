package academy.devdojo.maratonajava.introducao;
            // EXERCICIO CONDICIONAL SWITCH
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como Domingo e 7 como Sabado

        int dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Hoje é Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Hoje é dia de Trabalhar pião!");
                break;

            default:
                System.out.println("Dados incorretamente inseridos");
                break;
        }




    }
}
