public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionou o carrinho de compras");
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando valor da compra");
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }
}