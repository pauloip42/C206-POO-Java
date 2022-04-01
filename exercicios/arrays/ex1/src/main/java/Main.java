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

        Membro [] membros = new Membro[4];
        Musica [] musicas = new Musica[2];

        membros[0] = membro1;
        membros[1] = membro2;
        membros[2] = membro3;
        membros[3] = membro4;

        musicas[0] = musica1;
        musicas[1] = musica2;

        theBand.membros = membros;
        theBand.musicas = musicas;

        theBand.addMusicaNova(musica1);
        theBand.addMusicaNova(musica2);

        theBand.empresario = empresario;

        theBand.mostraInfo();

    }

}
