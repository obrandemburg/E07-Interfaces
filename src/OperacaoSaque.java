public class OperacaoSaque extends Operacao{

    OperacaoSaque(double valor) {
        super('s', valor);
    }
    public double calcularTaxas(){
        return 0.05;
    }
}
