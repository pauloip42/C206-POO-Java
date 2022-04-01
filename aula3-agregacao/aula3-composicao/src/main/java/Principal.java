public class Principal {
    public static void main(String[] args) {

        Conta c =  new Conta();
        Cliente cliente = new Cliente();

        c.cliente = cliente;

        /*
            Por agregação, atribuir cliente.nome ou c.cliente.nome é a mesma coisa
         */

        c.saldo = 1000;
        c.limite = 10;

//        cliente.nome = "Paulo";
//        cliente.cpf = "123";
//        cliente.idade = 22;

        c.cliente.nome = "Paulo";
        c.cliente.cpf = "123";
        c.cliente.idade = 22;




    }
}
