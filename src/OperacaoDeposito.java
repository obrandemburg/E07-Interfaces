public class OperacaoDeposito extends Operacao{

    OperacaoDeposito(double valor){
        super('d', valor);
    }

    public double calcularTaxas(){
        return 0;
    }
}
