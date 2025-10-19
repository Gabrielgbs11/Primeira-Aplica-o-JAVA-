import java.util.Scanner;

public class desafioBancário {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        String nomeCliente = "Gabriel Barbosa";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int menu = 0;



        System.out.println("**********************************");

        System.out.printf("Dados Iniciais do Cliente " +
                          "\nNome: %s  " +
                         "\nTipo de Conta: " +
                         "%s \nSaldo: %.2f \n",  nomeCliente , tipoConta , saldoInicial );

        System.out.println("**********************************");

        while(menu != 4) {
            System.out.printf("1-Consultar saldo \n2-Transferir valor \n3-Receber Valor \n4-Sair \nDigite a opção desejada:");

            menu = dados.nextInt();

             if(menu == 1){
                 System.out.println("Saldo atual: " + saldoInicial);
             }
                else if (menu == 2) {
                 System.out.println("Qual valor deseja transferir?");
                 double valorTr = dados.nextDouble();


                  if( saldoInicial < valorTr){
                      System.out.println("Não à saldo suficiente para esta transferência");
                  }
                   else {
                       double novoSaldoTr = saldoInicial - valorTr;
                       saldoInicial = novoSaldoTr;
                      System.out.println("Novo Saldo: " + saldoInicial);
                  }
             }

                else if (menu == 3) {
                   System.out.println("Qual valor deseja receber?");
                   double valorRc = dados.nextDouble();
                   saldoInicial += valorRc;
                 System.out.println("Novo Saldo: " + saldoInicial);

                 }

                else {
                 System.out.println("Digite uma opção válida!");
             }

             }

        }



    }

