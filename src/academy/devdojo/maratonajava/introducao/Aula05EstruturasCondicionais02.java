package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        // Tabém tem a opção do "SE NÂO"

        int idadeDirigir = 18;

        if (idadeDirigir >= 18 ) {
            System.out.println("Posso DIRIGIR");
            // Caso o primeiro if nao for True, tem a opção do else if (se nao) pra depois fechar no Else pra encerrar a condição.
        } else if (idadeDirigir > 16 && idadeDirigir < 18 ) {
            System.out.println("Ja estou na expectativa!");
        } else {
            System.out.println("Noa tenho idade ainda -_-'");
        }
    }
}
