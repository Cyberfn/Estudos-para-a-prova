import java.util.Scanner;

public class QuestaoProva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado;
        char operacao;

        do {
            System.out.print("Digite o primeiro número (ou -999 para sair): ");
            num1 = sc.nextDouble();

            if (num1 != -999) {
                System.out.print("Digite o segundo número: ");
                num2 = sc.nextDouble();

                System.out.print("Digite a operação (+, -, *, /): ");
                operacao = sc.next().charAt(0);

                switch (operacao) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        resultado = num1 / num2;
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        continue;
                }

                System.out.print("O resultado é ");

                if (resultado > 0) {
                    System.out.println("maior que zero.");
                } else if (resultado < 0) {
                    System.out.println("menor que zero.");
                } else {
                    System.out.println("igual a zero.");
                }

                if (resultado % 2 == 0) {
                    System.out.println("O resultado é par.");
                } else {
                    System.out.println("O resultado é ímpar.");
                }
            }

        } while (num1 != -999);

        System.out.println("Programa encerrado.");
    
    sc.close();
        
    }

}
