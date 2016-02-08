/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploapostila;

/**
 *
 * @author Jussimar
 */
public class Cliente extends Pessoa implements IEntradaSaida{
    
    private int numeroCliente;
    private String cpf;
    
    public Cliente(String Nome){
        this.nome = Nome;
    }
    
    public int getNumeroCliente(){
        return this.numeroCliente;
    }
    
    public void setNumeroCliente(int Numero){
        this.numeroCliente = Numero;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String Cpf){
        this.cpf = Cpf;
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
    
     public boolean LogarCompra(){
        if(numeroCliente == 123){
            return true;
        }else{
            return false;
        } 
    }
    public void Comprar()
    {
        System.out.println("Compra Efetuada");
    }
    
    public void AbrirCaixa()
    {
        System.out.println("Pagamento Efetuado");
    }

    @Override
    public void Sair() {
       System.out.println("Cliente Deseja Sair?");
    }

    @Override
    public void Entrar(String nome, int cod) {
        System.out.println("Seja bem Vindo " + nome + " Cod.: " + cod);
    }
}
