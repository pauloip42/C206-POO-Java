public class Banda {
    private String nome;
    private String genero;
    Empresario empresario;

    Musica [] musicas;
    Membro [] membros;

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;

        musicas = new Musica[2];
        membros = new Membro[4];
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);

        System.out.println("Musicas: ");
        for (int i = 0; i < this.musicas.length; i++) {
            if(this.musicas[i] != null){
                System.out.println("Musica " + (i+1) + ": " + this.musicas[i].getNome());
                System.out.println("Duração: " + this.musicas[i].getDuracao());
                System.out.println("\n");
            }
        }

        System.out.println("\n");

        System.out.println("Membros:");
        for (int i = 0; i < this.membros.length; i++) {
            if(this.membros[i] != null){
                System.out.println("Nome: " + this.membros[i].getNome());
                System.out.println("Funcao: " + this.membros[i].getFuncao());
                System.out.println("\n");
            }
        }

        System.out.println("\n");

        if(empresario != null){
            System.out.println("Empresario:");
            System.out.println("Nome: " + this.empresario.getNome());
            System.out.println("Cnpj: " + this.empresario.getCnpj());
        }
    }

    public void addMusicaNova(Musica musica){
        for (int i = 0; i < this.musicas.length; i++) {
            if(musicas[i] == null){
                musicas[i] = musica;
                return;
            }
        }
    }

    public void addMembroNovo(Membro membro) {
        for (int i = 0; i < this.membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = membro;
                return;
            }
        }
    }

}
