public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < -100){
            System.out.println("O limite mínimo é R$ -100");
        }
        else {
            this.limite = limite;
        }
    }
}
