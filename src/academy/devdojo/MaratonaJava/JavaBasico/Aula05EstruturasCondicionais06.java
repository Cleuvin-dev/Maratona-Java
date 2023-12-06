package academy.devdojo.MaratonaJava.JavaBasico;
    // EXERCICIOS DE SWITCH
// Dados os valores de 1 a 7, imprima se é dia util ou final de semana
// Considerando 1 como Domingo
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        // Resolução abraixo






















        char dia = 4;
        switch (dia){
            case 1:
            System.out.println("Feriadão, Hoje é Domingo!");
            break;
            case 2:
                System.out.println("Dia útil, Hoje é Segundona!");
                break;
            case 3:
                System.out.println("Dia útil, Terça braba!");
                break;
            case 4:
                System.out.println("Dia útil, Quarta feira loca!");
                break;
            case 5:
                System.out.println("Dia útil, Quinta feira que passe logo!");
                break;
            case 6:
                System.out.println("Dia útil, Sextoooooo");
                break;
            case 7:
                System.out.println("Feriado, enfim descando no Sabadão!");
            default:
                System.out.println("Dado inserida errado!");
        }
        // Outra forma mais simples e pratica para exemplificar os comandos acima seria como no exemplo abaixo:
//        char dia = 4;
//        switch (dia){
//            case 1:
//            case 7:
//                System.out.println("Feriadão, Final de semana!");
//                break;
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Dia útil, bora ralar");
//                break;
//            default:
//                System.out.println("Dado inserido errado!");
//        }
    }
}
