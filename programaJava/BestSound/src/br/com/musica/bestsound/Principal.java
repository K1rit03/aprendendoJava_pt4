package br.com.musica.bestsound;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Pagode");
        musica1.setCurtidas(3000);
        musica1.setTotalReproducao(200000);
        musica1.setDuracao(2.31);
        musica1.setTitulo("Até que durou");
        musica1.setCompositor("Pericles");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("PodEV");
        podcast1.setApresentador("Thiago Oliveira");

        for (int i = 0; i < 5000; i++) {
           podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasFavoritas preferidas = new MinhasFavoritas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);


    }
}
