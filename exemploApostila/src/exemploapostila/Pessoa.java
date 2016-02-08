
package exemploapostila;

public abstract class Pessoa {
    protected String nome;
    private String sobreNome;
    private int idade;
    private double peso;
    private String cor;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobreNome(){
        return this.sobreNome;
    }
    
    public void setSobreNome(String Sobrenome){
        this.sobreNome = Sobrenome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int Idade){
        this.idade = Idade;
    }
    
     public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double Peso){
        this.peso = Peso;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String Cor){
        this.cor = Cor;
    }
    
    public abstract void Comer(String comida, String sobremesa);
    
    public abstract void Beber();
    
    public abstract void Correr();
    
    public abstract void Enxergar();
    
    public abstract void Ouvir();
}
