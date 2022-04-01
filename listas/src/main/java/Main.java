public class Main {
    public static void main(String[] args) {

        Nave n1 = new Nave();
        Nave n2 = new Nave();
        Nave n3 = new Nave();

        n3.setVida(250);

        n2.trocavida(n3);

        System.out.println(n2.cont);
        n1.mostraInfo();
        n2.mostraInfo();

        System.out.println(Nave.cont);

        System.out.println(n1.vida);


//        Nave n1 = new Nave("Nave1", 100);
//        Nave n2 = new Nave("Nave2", 200);
//
//        System.out.println(n1.getVida());
//
//        if(n1 != n2){
//            n1.setVida(50);
//        } else
//            n2.setVida(70);
//        n2 = n1;
//
//        System.out.println(n2.getVida() + " " + n1.getVida());
    }
}
