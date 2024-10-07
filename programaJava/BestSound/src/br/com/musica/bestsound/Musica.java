package br.com.musica.bestsound;

public class Musica extends Audio {

    private String compositor;

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 4000){
            return 10;
        }else{
            return 7;
        }
    }
}
