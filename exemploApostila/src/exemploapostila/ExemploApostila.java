
package exemploapostila;



public class ExemploApostila {

    public static void main(String[] args) {
        
        
        Funcionario f = new Funcionario("Joaquim");
        f.setSobreNome("Ferreira");
        f.setIdade(30);
        f.setPeso(80.3);
        f.setCor("Branco");
        f.setNumeroFuncionario(12345);
        f.setCpf("000.000.000-00");
        
        
        Utilitario.data = Utilitario.getData();
        Utilitario.MostrarDados(f.nome, f.getSobreNome(), f.getCor(), f.getIdade(), 
                f.getPeso(), f.getNumeroFuncionario(), f.getCpf());
        
        f.Comer("Virada Paulista","Sorvete");
        f.Beber();
        f.Correr();
        f.Enxergar();
        f.Ouvir();
        
        if(f.LogarCaixa()){
            f.AbrirCaixa();
            f.AbrirCaixa(f.nome);
        }else{
           System.out.println(f.FecharCaixa());
        }
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        Fornecedor f2 = new Fornecedor("Marcela");
        f2.setSobreNome("Oliveira");
        f2.setIdade(30);
        f2.setPeso(80.3);
        f2.setCor("Branco");
        f2.setNumeroFornecedor(12345);
        f2.setCnpj("0000.0000.0000/0000");
        
        
        System.out.println("Nome Completo: " + f2.getNome() + " " + f2.getSobreNome());
        System.out.println("Idade: " + f2.getIdade());
        System.out.println("Peso: " + f2.getPeso());
        System.out.println("Cor: "+ f2.getCor());
        System.out.println("Numero de Fornecedor: "+ f2.getNumeroFornecedor());
        System.out.println("CNPJ: "+ f2.getCnpj());
        
        f2.Comer("Virada Paulista","Sorvete");
        f2.Beber();
        f2.Correr();
        f2.Enxergar();
        f2.Ouvir();
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        Cliente c = new Cliente("Paulo");
        c.setSobreNome("Costa");
        c.setIdade(30);
        c.setPeso(83.8);
        c.setCor("Branco");
        c.setNumeroCliente(123);
        c.setCpf("000.000.000-00");
        
        System.out.println("Nome Completo: " + c.getNome() + " " + c.getSobreNome());
        System.out.println("Idade: " + c.getIdade());
        System.out.println("Peso: " + c.getPeso());
        System.out.println("Cor: "+ c.getCor());
        System.out.println("Numero de Cliente: "+ c.getNumeroCliente());
        System.out.println("CPF: "+ c.getCpf());
        
        c.Comer("Virada Paulista","Sorvete");
        c.Beber();
        c.Correr();
        c.Enxergar();
        c.Ouvir();
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        Gerente g = new Gerente("Joaquim");
        g.setSobreNome("Ferreira");
        g.setIdade(30);
        g.setPeso(80.3);
        g.setCor("Branco");
        g.setNumeroFuncionario(1234);
        g.setCpf("000.000.000-00");
        
        System.out.println("Nome Completo: " + g.getNome() + " " + g.getSobreNome());
        System.out.println("Idade: " + g.getIdade());
        System.out.println("Peso: " + g.getPeso());
        System.out.println("Cor: "+ g.getCor());
        System.out.println("Numero de Funcionario: "+ g.getNumeroFuncionario());
        System.out.println("CPF: "+ g.getCpf());
        
        g.Comer("Virada Paulista","Sorvete");
        g.Beber();
        g.Correr();
        g.Enxergar();
        g.Ouvir();
        g.ControPonto();
        g.GerenciaPagamento();
        if(g.LogarCaixa()){
            g.AbrirCaixa();
        }else{
            System.out.println(g.FecharCaixa());
        }
    }    
}
