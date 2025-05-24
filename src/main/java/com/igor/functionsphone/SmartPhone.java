package com.igor.functionsphone;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SmartPhone {
    private MusicPlayer reprodutor = new MusicPlayer();
    private PhoneDevice telefone = new PhoneDevice();
    private Internet navegador = new Internet();
}

