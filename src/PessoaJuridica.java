import java.util.Date;

public class PessoaJuridica extends Cliente{

    String cnpj;
    int Numero_funcionarios;
    String setor;

    PessoaJuridica(String nome, String endereco, String cnpj, int Numero_funcionarios, String setor){
        super(nome, endereco, new Date());
        this.cnpj = cnpj;
        this.Numero_funcionarios = Numero_funcionarios;
        this.setor = setor;
    }

    public boolean autenticar(String chave){
        return chave.equals(cnpj);
    }
}
