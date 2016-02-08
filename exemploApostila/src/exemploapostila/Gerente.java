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
public class Gerente extends Funcionario implements IEntradaSaida{
    
    private String senhaCofre;
    
    public Gerente(String Nome){
        super(Nome);
        this.nome = Nome;
    }
    
    public String getSenhaCofre(){
        return this.senhaCofre;
    }
    
    public void setSenhaCofre(String SenhaCofre){
        this.senhaCofre = SenhaCofre;
    }
    
     public void ControPonto()
    {
        System.out.println("Controla o ponto dos funcionarios");
    }
    
    public void GerenciaPagamento()
    {
        System.out.println("Gerencia Pagamento dos Funcionarios");
    }
    
    @Override
    public String FecharCaixa()
    {
        return super.FecharCaixa() +  "E relatório Emitido";
    }
    
    @Override
    public void Sair() {
       System.out.println("Gerente Deseja Sair?");
    }

    @Override
    public void Entrar(String nome, int cod) {
        System.out.println("Seja bem Vindo " + nome + " Cod.: " + cod);
    }
}
