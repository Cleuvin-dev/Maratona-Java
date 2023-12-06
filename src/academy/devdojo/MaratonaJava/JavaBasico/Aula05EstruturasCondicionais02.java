package academy.devdojo.MaratonaJava.JavaBasico;

// EXERCICIO
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // iodade < 15 categoria infatil
        // idade >= 15 && idade < 18 categoria junvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        } else{
            System.out.println("Categoria Adulto");
        }
    }
}
