
package exemploapostila;

public class Fornecedor extends Pessoa{
    
    private int numeroFornecedor;
    private String cnpj;
    
    public Fornecedor(String Nome){
        this.nome = Nome;
    }
    
    public int getNumeroFornecedor(){
        return this.numeroFornecedor;
    }
    
    public void setNumeroFornecedor(int Numero){
        this.numeroFornecedor= Numero;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String Cnpj){
        this.cnpj = Cnpj;
    }
    
    @Override
    public void Comer(String comida, String sobremesa){
        System.out.println("Comida: " + comida + " Sobremesa: " + sobremesa);
    }
    
    @Override
    public void Beber(){
        System.out.println("Beber: Refrigerante");
    }
    
    @Override
    public void Correr(){
        System.out.println("Correr: Pouco");
    }
    
    @Override
    public void Enxergar(){
        System.out.println("Enxergar: Bem");
    }
    
    @Override
    public void Ouvir(){
        System.out.println("Ouvir: Muito Bem");
    }
    
    public void ControlarPedido(){
        System.out.println("Controle: Controla os pedidos");
    }
    
}
