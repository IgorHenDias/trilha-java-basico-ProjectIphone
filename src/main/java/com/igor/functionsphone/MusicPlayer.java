package com.igor.functionsphone;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MusicPlayer {
    private String musica;

    public void tocarMusica() {
        System.out.println("Tocando Música");
    }

    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Musica escolhida: " + musica);
    }
}
