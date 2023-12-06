package academy.devdojo.MaratonaJava.JavaBasico;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        // Em cada tipo esta descrito seu tamanho e capacidade

        int age = 32; // 4 bytes                        -2,147,483,648 a 2,147,483,647

        double salarioDouble = 2000; // 8 bytes         1.7e-308 a 1.7e+038

        float salarioFloat = 2500F; // 4 bytes           3.4e-038 a 3.4e+038

        byte idadeByte = 10; // 1 byte                  -128 a 127

        short idadeShort = 10; // 2 bytes               -32768 a 32767

        boolean verdadeiro = true; // i bit             true ou false

        boolean falso = false; // i bit                 true ou false

        char caractere = 'M'; // 2 bytes                \u0000
        char caractere2 = '\u0041'; // 2 bytes                \u0000

        System.out.println("A idade é: " + age);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(caractere2);

        // Strings, descrição abaixo de como declarar

        String name = "Cleuvin";
        System.out.println("Meu nome é: "+name);

    }
}
