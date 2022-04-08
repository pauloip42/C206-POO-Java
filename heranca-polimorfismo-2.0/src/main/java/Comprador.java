public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        System.out.println("\n");
        System.out.println("Comprador " + this.nome + " está fazendo uma compra");
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Nome do Brownie: " + brownie.nome);
    }
}
