import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double valorUm;
        String operacao;
        Double valorDois;

        System.out.println("Digite o primeiro valor: ");
        valorUm = input.nextDouble();

        System.out.println("Escolha a operação( +, -, *, / ): ");
        operacao = input.next();

        System.out.println("Digite o segundo valor: ");
        valorDois = input.nextDouble();

        Double resultado = realizarCalculo(valorUm, valorDois, operacao);
        if (resultado != null) {
            System.out.println("Resultado: " + resultado);
        }
        input.close();
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double respostaCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                if (valorDois != 0) {
                    respostaCalculo = valorUm / valorDois;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return null;
                }
                break;
            default:
                System.out.println("Operação inválida");
                return null;
        }
        return respostaCalculo;
    }
}
