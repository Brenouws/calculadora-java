import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorum;
        double valordois;
        String operacao;

        System.out.println("Digite o Valor um:");
        valorum = scanner.nextDouble();

        System.out.println("Digite a Operação()");
        operacao = scanner.next();

        System.out.println("Digite o Valor Dois");
        valordois = scanner.nextDouble();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = valorum + valordois;
                break;
            case "-":
                resultado = valorum - valordois;
                break;
            case "*":
                resultado = valorum * valordois;
            case "/":
                if (valordois != 0) {
                    resultado = valorum / valordois;
                } else {
                    System.out.println("Divisão por zero não é possivel");
                    return;
                }
                break;
            default:

                System.out.println("Operação Invalida");
                return;
        }
        System.out.println("O Resultado da sua conta é :" + resultado);
    }
    }


