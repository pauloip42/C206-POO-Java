public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionou Brownie Nutella");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionou Nutella ao Carrinho");
    }
}
