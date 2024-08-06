import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    // int numeroDaContaScanner = Integer.valueOf(args[0]);
    // String agenciaScanner = args[1];
    // String nomeDoClienteScanner = args[2];
    // double saldoScanner = Integer.valueOf(args[3]);

    
  
    System.out.println("Olá, por favor, digite seu primeiro nome:");
    String nomeDoCliente = scanner.next();
    
    System.out.println("Seu sobrenome:");
    String sobrenome = scanner.next();
    
    System.out.println("Agora , digite o número da sua agência!");
    String agencia = scanner.next();

    System.out.println("Em seguida, o numero da sua conta:");
    int numeroDaConta = scanner.nextInt();

    System.out.println("Por fim seu saldo:");
    double saldo = scanner.nextDouble();

    System.out.println(
        "Olá "+ nomeDoCliente +" "+sobrenome  +", "+ 
        "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta +
        " e seu saldo " + saldo + " já está disponível para saque.");

    // TODO:Conhecer e importar a classe scanner

    // Exibir as mensagens para o nosso usuário

    // Obter pela scanner os valores digitados no terminal

    // Exibir mensagem conta criada
  }
}
