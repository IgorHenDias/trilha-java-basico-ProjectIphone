package com.igor.functionsphone;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PhoneDevice {
    String nome;

    public void ligar() {
        System.out.println("Ligando " + nome);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void desligar() {
        System.out.println("Desligando chamada ");
    }

    public void CorreioVoz() {
        System.out.println("Correio Voz");
    }
}
