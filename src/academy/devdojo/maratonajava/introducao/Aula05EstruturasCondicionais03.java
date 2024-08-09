package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operadores Ternarios

        double salario = 6000; // Condição: Doar se salario for > que 5000
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter!";
       // String resultado;

        /* A forma comun seria assim:
        if (salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        */
        // No modo ternario é assim:
        // Se salario for mairo que 5000  imprima Doar  Senao Imprima NaoDoar
         String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);



    }
}
