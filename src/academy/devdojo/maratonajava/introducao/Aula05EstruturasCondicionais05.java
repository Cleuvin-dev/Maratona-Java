package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Estrura condicional - Switch

        // Variavel diaDaSemana recebe o valor 1
        int diaDaSemana = 1;
        //Caso o diaDaSemana for 1, executara o caso 1 "Domingo", caso 2 executará o case 2 "Segunda"
        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
            break;
            // default encerrada o condicional e por padrão adicionamos uma msg caso as entrada estejam erradas
            default:
                System.out.println("Opção errada!");
                break;
        }
    }
}
