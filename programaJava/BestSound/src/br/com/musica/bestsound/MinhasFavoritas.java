package br.com.musica.bestsound;

public class MinhasFavoritas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() +  " É considerado um querido do publico");
        }else{
            System.out.println(audio.getTitulo() +  " Excelente opção pra quem está procurando algo diferente!");
        }
    }
}
