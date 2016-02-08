
package relacaoobjetos;


public class Filial {
    private String cidade;
    private int numFilial;
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumFilial() {
        return numFilial;
    }

    public void setNumFilial(int numFilial) {
        this.numFilial = numFilial;
    }   
}
