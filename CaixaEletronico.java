import java.util.Scanner;

public class CaixaEletronico {
    
    private static double saldo = 1000.0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("======= Caixa Eletrônico =======");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar saque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarSaque();
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o caixa eletrônico!");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    
    private static void consultarSaldo() {
        System.out.println("Seu saldo atual é R$" + saldo);
    }
    
    private static void realizarDeposito() {
        System.out.print("Digite o valor a ser depositado: R$");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    private static void realizarSaque() {
        System.out.print("Digite o valor a ser sacado: R$");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente!");
        }
    }

}
