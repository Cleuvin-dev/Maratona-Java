package academy.devdojo.MaratonaJava.JavaCore.BintroducaoMetodos.test;

import academy.devdojo.MaratonaJava.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calulcadora 01");
        calculadora.subtraiDoisNumeros();
    }
}
