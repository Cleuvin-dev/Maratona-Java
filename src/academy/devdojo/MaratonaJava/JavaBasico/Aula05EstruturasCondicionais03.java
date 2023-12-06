package academy.devdojo.MaratonaJava.JavaBasico;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador ternario
        // Doar se o salario for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reias";
        String mensagemNaoDoar = "Ainda nao posso doar";

        /* Esta seria a forma de realizar o If-Else da forma passada na aula anterior

        if (salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        */

        // Forma de representar no modelo de condição ternario
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        // representado como se o ? fosse IF e o : fosse o ELSE
        System.out.println(resultado);

    }
}
