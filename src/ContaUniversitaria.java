public class ContaUniversitaria extends Conta{

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite < 0){
            System.out.println("O limite mínimo é R$0");
        }
        else if(limite > 500){
            System.out.println("O limite máximo é R$500");
        }
        else {
            this.limite = limite;
        }
    }
}
