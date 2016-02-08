
package exemplo.excecao;


public class ExemploExcecao {

  
    public static void main(String[] args) {
        try{
            calculo.Principal();
        }
        catch(IllegalArgumentException ex){
            System.out.println("Valor Invalido: " + ex);
        }
        catch(Exception e){
            System.out.println("Erro Geral: " + e);
        }
        finally{
            System.out.println("Fim do programa");
        }
    }
    
}
