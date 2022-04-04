public class Main {
    public static void main(String[] args) {
        Banda theBand = new Banda("theBand", "Drink Water");

        Membro membro1 = new Membro("Hidratado", "Vocalista");
        Membro membro2 = new Membro("Bioleve", "Baterista");
        Membro membro3 = new Membro("H2O", "Guitarrista");
        Membro membro4 = new Membro("2 Litros por dia", "Contra Baixo");

        Musica musica1 = new Musica("Represa", 42);
        Musica musica2 = new Musica("Oceano", 22);

        Empresario empresario = new Empresario("Water", 1);

        theBand.addMembroNovo(membro1);
        theBand.addMembroNovo(membro2);
        theBand.addMembroNovo(membro3);
        theBand.addMembroNovo(membro4);

        theBand.addMusicaNova(musica1);
        theBand.addMusicaNova(musica2);

        theBand.empresario = empresario;

        theBand.mostraInfo();

    }

}
