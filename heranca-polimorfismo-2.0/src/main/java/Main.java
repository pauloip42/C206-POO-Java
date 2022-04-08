public class Main {
    public static void main(String[] args) {
        BrownieNutella nutela = new BrownieNutella("Charles Brownie", 10.00, "Nutela");
        BrownieCafe cafe = new BrownieCafe("Brownie2", 11.00, "Cafe");
        BrownieDoceDeLeite doceDeLeite = new BrownieDoceDeLeite("Brownie3", 12.00, "Doce De Leite");

        nutela.addCarrinhoDeCompras();
        cafe.addCarrinhoDeCompras();
        doceDeLeite.addCarrinhoDeCompras();

        Comprador comprador = new Comprador("Chris", 10000000);
        comprador.efetuarCompra(nutela);
    }
}
