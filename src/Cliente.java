import java.util.Date;

public abstract class Cliente {

    protected String nome;

    protected Date data;

    protected String endereco;


    protected Cliente(String nome, String endereco, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
