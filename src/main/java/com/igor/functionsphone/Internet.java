package com.igor.functionsphone;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Internet {
    private String url;

    public void ExibirPagina(String url) {
        this.url = url;
        System.out.println("Exibindo Página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar novo aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

}
