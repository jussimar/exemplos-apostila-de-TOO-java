
package exemploapostila;



public class Funcionario extends Pessoa implements IEntradaSaida{
    private int numeroFuncionario;
    private String cpf;
    
    public Funcionario(String Nome){
        this.nome = Nome;
    }
    
    public int getNumeroFuncionario(){
        return this.numeroFuncionario;
    }
    
    public void setNumeroFuncionario(int Numero){
        this.numeroFuncionario = Numero;
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
    
    public boolean LogarCaixa(){
        if(numeroFuncionario == 12345){
            return true;
        }else{
            return false;
        } 
    }
    
    public String FecharCaixa()
    {
        return "Caixa Fechado";
    }
    
    public void AbrirCaixa()
    {
        System.out.println("Caixa Aberto");
    }
    
     public void AbrirCaixa(String nome)
    {
        System.out.println("Caixa Aberto Sr. " + nome);
    }
     
     @Override
    public void Sair() {
       System.out.println("Funcionario Deseja Sair?");
    }

    @Override
    public void Entrar(String nome, int cod) {
        System.out.println("Seja bem Vindo " + nome + " Cod.: " + cod);
    }
}
