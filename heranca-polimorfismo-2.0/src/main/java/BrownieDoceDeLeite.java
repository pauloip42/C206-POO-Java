public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionou Doce de Leite");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionou Doce de Leite ao Carrinho");
    }
}
