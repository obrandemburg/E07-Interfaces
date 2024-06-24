import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Para gerar um CPF válido, utilize o seguinte link:
        // https://www.4devs.com.br/gerador_de_cpf
        PessoaFisica joao = new PessoaFisica(
                "João",
                "Av. Antonio Carlos. 6627",
                36,
                'm',
                "324.310.130-14"

        );
        PessoaFisica matheus = new PessoaFisica(
                "Matheus",
                "Sabara, MG, 6627",
                17,
                'm',
                "136.244.106-60"

        );
        PessoaJuridica Alex = new PessoaJuridica(
                "Alex Brandemburg",
                "Rondônia",
                "121.3213124.862",
                20,
                "Dono"

        );

        Conta conta1 = new ContaPoupanca(1234, Alex, 100, 1500);
        Conta conta2 = new ContaUniversitaria(12121, matheus, 200, 1500);
        Conta conta3 = new ContaCorrente(12345, joao, 300, 1500);

        System.out.println("Imprimindo informações das contas:\n");

        conta1.imprimir();
        conta2.imprimir();
        conta3.imprimir();

        conta1.depositar(100);
        conta2.depositar(20);
        conta3.depositar(40);

        conta1.sacar(50);
        conta2.sacar(9.99);
        conta3.sacar(10);


        System.out.println("Imprimindo o extrato das contas:\n");

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();


        System.out.println("Imprimindo taxas cobradas de cada conta:\n");

        conta1.imprimirExtratoTaxas();
        conta2.imprimirExtratoTaxas();
        conta3.imprimirExtratoTaxas();

    }
}