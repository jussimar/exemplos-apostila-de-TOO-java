
package relacaoobjetos;

public class Cliente extends Pessoa implements IDados{
    private int numConta;
    private String tipoConta;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    @Override
    public String mostrarCorrentePoup(String t){
        String tipo;
        if(t == "CP"){
            tipo = "Conta Poupança";
        }else if(t == "CC"){
            tipo = "Conta Corrente";
        }else{
            tipo = "Conta Indefinida";
        }
        
        return tipo;
    }
    
}
