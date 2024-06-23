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

        Conta conta1 = new ContaPoupanca(1234, joao, 0, 1500);
        Conta conta2 = new ContaUniversitaria(12121, joao, 10000, 1500);
        Conta conta3 = new ContaCorrente(12345, joao, 0, 15000);

        if (Alex.autenticar("121.3213124.862")){
            System.out.println("Alex tá autenticado");
        }
        if (! (Alex.autenticar("121.321312.86"))){
            System.out.println("Alex não tá autenticado");
        }

        System.out.println("Teste Conta Poupança");

        conta1.setLimite(10000);
        conta1.setLimite(200);
        conta1.setLimite(10);

        System.out.println("Teste Conta Universitaria");
        conta2.setLimite(600);
        conta2.setLimite(400);
        conta2.setLimite(-1);

        System.out.println("Teste Conta Corrente");
        conta3.setLimite(400);
        conta3.setLimite(-105);
    }
}