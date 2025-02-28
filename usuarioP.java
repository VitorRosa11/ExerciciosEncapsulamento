

package projeto2.usuariop;

public class usuarioP{

    public static void main(String[] args) {
    
    /**
 *
 * @author vitorb
 */

    
        
        Produto produto = new Produto("Celular", 1500.00);

        
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: R$" + produto.getPreco());

        
        produto.setNome("Notebook");
        produto.setPreco(3000.00);

        
        System.out.println("Após alteração:");
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: R$" + produto.getPreco());
    }
}


