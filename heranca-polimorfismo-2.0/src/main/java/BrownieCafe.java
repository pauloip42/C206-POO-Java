public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adicionou Café");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionou Café ao Carrinho");
    }
}
