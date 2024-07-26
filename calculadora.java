import java.util.Scanner;

/**
 * calculadora
 */
public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valor1;
        Double valor2;
        String operacao;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.println("Digite a operação(+, -, /, *): ");
        operacao = scanner.next();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        

    }
}