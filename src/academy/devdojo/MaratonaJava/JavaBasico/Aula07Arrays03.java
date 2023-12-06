package academy.devdojo.MaratonaJava.JavaBasico;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5, 6};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);


            for (int num:numeros3) {
                System.out.println(num);
            }
        }
    }

