import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Cria uma instância da classe scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNum = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNum = scanner.nextInt();

        // Cria uma instância da classe calculadora
        Calculadora calculadora = new Calculadora(primeiroNum, segundoNum);

        System.out.println("A soma dos números é: " + calculadora.Soma());
        System.out.println("A subtração dos números é: " + calculadora.Subtracao());
        System.out.println("A multiplicação dos números é: " + calculadora.Multiplicacao());
        System.out.println("A divisão dos números é: " + calculadora.Divisao());

        // Fecha o scanner
        scanner.close();
    }
}