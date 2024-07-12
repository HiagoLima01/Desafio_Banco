import java.util.Scanner;
public class Menu{

    Cliente cliente1 = new Cliente("Hiago Lima", "Corrente", 1500);
    Scanner sc = new Scanner(System.in);

    public Menu(){
        this.menu();
    }
    public void iniciarMenu(){
        System.out.printf("""
                Seja bem-vinde %s ao Banco Lima
                
                Tipo de Conta: %s
                saldo: R$ %.2f
                
                1 - Consultar Saldo
                2 - Depositar
                3 - Sacar
                4 - Sair
                
                Digite um número e aperte enter para seguir
                """, cliente1.getNome(), cliente1.getTipoDeConta(), cliente1.getSaldo());
    };

    public void menu(){
        iniciarMenu();
        boolean i = true;
        while (i) {
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: " + cliente1.getSaldo());
                    iniciarMenu();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado");
                    double valorDeposito = sc.nextDouble();
                    cliente1.depositar(valorDeposito);
                    System.out.print("Seu novo saldo é: " + cliente1.getSaldo());
                    iniciarMenu();
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado");
                    double valorSaque = sc.nextDouble();
                    cliente1.sacar(valorSaque);
                    System.out.println("Seu saldo é: " + cliente1.getSaldo());
                    iniciarMenu();
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso Sistema");
                    i = false;;
                    break;
            }
        }
    }
}
