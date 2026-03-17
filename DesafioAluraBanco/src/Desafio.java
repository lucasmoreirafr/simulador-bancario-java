import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);

        String nome = "Lucas";
        String tipoConta = "Corrente";
        double saldo = 2500;
        double valor;

        String mensagem = """
          ************************************************
          Dados iniciais do cliente:
          
          Nome: %s
          TIPO: %s
          SALDO: R$ %.2f
          
          ************************************************
          """.formatted(nome, tipoConta, saldo);

        System.out.println(mensagem);

        String menu = """          
          Operações
          
          1 - Consultar saldos
          2 - Receber valor
          3 - Transferir valor
          4 - Sair
          
          Digite a opção desejada: 
          """;

        System.out.println(menu);

        int opcao = 0;

        while (opcao != 4) {
            opcao = banco.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$" + saldo);
                    System.out.println(menu);
                    break;

                case 2:
                    System.out.println("Informe o valor a receber: ");
                    valor = banco.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atualizado R$" + saldo);
                    System.out.println(menu);
                    break;

                case 3:
                    System.out.println("Informe o valor a pagar: ");
                    valor = banco.nextDouble();

                    if (saldo < valor) {
                        System.out.println("Saldo insuficiente!");
                        System.out.println(menu);
                    } else {
                        saldo -= valor;
                        System.out.println("Saldo atualizado R$" +saldo);
                        System.out.println(menu);
                    }
                    break;

                case 4:
                    System.out.println("Operação encerrada!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println(menu);
                    break;
            }
        }
        banco.close();
    }
}