package academy.devdojo.MaratonaJava.JavaBasico;

// ESTRUTURA CONDICIONAL SWTICH CASE
// Exemplo a ser aplicado para a compreensão: Imprima o dia da semana, considerando 1 como domingo
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // O tipos de varivaeis que podem ser usadas são: char, int, byte, short, enum, String
        // No exemplo abaixo, vemos uma estrutura de switch onde a entrada do dia eh 7, entao ao passar pelos casos
        // ele irá verificar de acordo com a pergunta de case, sendo true ele retornara a impressão na tela.
        byte day = 7;
//       switch (day) {
//            case 1:
//                System.out.println("Domingo!");
//                break;
//            case 2:
//                System.out.println("Segunda!");
//                break;
//            case 3:
//                System.out.println("Terça!");
//                break;
//            case 4:
//                System.out.println("Quarta!");
//                break;
//            case 5:
//                System.out.println("Quinta!");
//                break;
//            case 6:
//                System.out.println("Sexta!");
//                break;
//            case 7:
//                System.out.println("Sabado!");
//                break;
//            default:
//                System.out.println("Opção Invalida!");

                System.out.println("------------------------------------------------------------------------------");
                // no exemplo abaixo seria um estrutura para saber atraves do charactere inserido qual o valor de retorno
                char sexo = 'F';
                switch (sexo){
                    case 'M':
                        System.out.println("É homem");
                        break;
                    case 'F':
                        System.out.println("É Mulher");
                        break;
                    default:
                        System.out.println("Insira um valor valido!");
                }
        }
    }
