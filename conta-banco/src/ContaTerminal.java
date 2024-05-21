import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, bem vindo ao Sintaxe - Desafio da DIO");
        System.out.println("Esse aplicativo irá simular a entrada de dados de banco e retornar os valores");
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Cliente, Digite seu nome: ");
        String nome = scanner.next();

        System.out.println(nome + ", Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println(nome + " " + sobrenome + ", Digite o numero de 4 digitos da sa conta: ");
        int numero = scanner.nextInt();

        System.out.println(nome + " " + sobrenome + ", Digite o numero da sua agencia: Exemplo(xxx-x)");
        String agencia = scanner.next();

        System.out.println(nome + " " + sobrenome + ", Digite o saldo atual em sua conta: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " + nome + " " + sobrenome + " , obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " , conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");


    }
}
