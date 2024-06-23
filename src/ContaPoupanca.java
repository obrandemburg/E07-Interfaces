public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < 100){
            System.out.println("O limite mínimo é R$ 100");
        }
        else if(limite > 1000){
            System.out.println("O limite máximo é R$1000");
        }
        else {
            this.limite = limite;
        }
    }
}




