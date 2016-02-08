
package relacaoobjetos;

import java.util.List;

public class RelacaoObjetos {

    
    public static void main(String[] args) {
       Banco b = new Banco();
       b.setNome("Banco ETEC");
       
       
       Pessoa p1 = new Pessoa();
       p1.setNome("João");
       p1.setCpf("000.000.000-00");
       p1.setBanco(b);
       
       Pessoa p2 = new Pessoa();
       p2.setNome("Maria");
       p2.setCpf("000.000.000-00");
       p2.setBanco(b);
       
       Pessoa p3 = new Pessoa();
       p3.setNome("Pedro");
       p3.setCpf("000.000.000-00");
       p3.setBanco(b);
       
       b.pessoas.add(p1);
       b.pessoas.add(p2);
       b.pessoas.add(p3);
       
       b.MostrarPessoas();
       
       Cliente c1 = new Cliente();
       c1.setNome("Mariana");
       c1.setCpf("000.000.000-00");
       c1.setNumConta(12369);
       c1.setBanco(b);
       c1.setTipoConta(c1.mostrarCorrentePoup("CC"));
       
       Cliente c2 = new Cliente();
       c2.setNome("Joaquim");
       c2.setCpf("000.000.000-00");
       c2.setNumConta(21548);
       c2.setBanco(b);
       c2.setTipoConta(c2.mostrarCorrentePoup("CP"));
       
       b.clientes.add(c1);
       b.clientes.add(c2);
       
       b.MostrarClientes();
       
       Filial f1 = new Filial();
       f1.setCidade("Itanhaém");
       f1.setNumFilial(1);
       f1.setBanco(b);
       
       Filial f2 = new Filial();
       f2.setCidade("Mongagua");
       f2.setNumFilial(2);
       f2.setBanco(b);
       
       b.filiais.add(f1);
       b.filiais.add(f2);
       
       b.MostrarFiliais();
       
    }
    
}
