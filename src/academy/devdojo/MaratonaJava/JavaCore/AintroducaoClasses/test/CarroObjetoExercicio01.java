package academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.test;

import academy.devdojo.MaratonaJava.JavaCore.AintroducaoClasses.dominio.CarroExercicio;

public class CarroObjetoExercicio01 {
    public static void main(String[] args) {
        CarroExercicio carroExercicio = new CarroExercicio();
        carroExercicio.marca = "Fiat";
        carroExercicio.modelo = "Punto";
        carroExercicio.ano = 1991;

        System.out.println("A compra do seu " + carroExercicio.marca+ " no Modelo de " + carroExercicio.modelo+ " do ano" +
                " de " + carroExercicio.ano);
    }
}
// atributos do objeto carro criados e recebidos valores, com uma chamada destes valores no final
