# 📱 Diagrama de Classes - FunctionsPhone

```mermaid
classDiagram
    class SmartPhone {
        -MusicPlayer reprodutor
        -PhoneDevice telefone
        -Internet navegador
        +getReprodutor() MusicPlayer
        +getTelefone() PhoneDevice
        +getNavegador() Internet
    }

    class MusicPlayer {
        -String musica
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
    }

    class PhoneDevice {
        -String nome
        -String numero
        +ligar(String numero)
        +atender()
        +desligar()
        +CorreioVoz()
    }

    class Internet {
        -String url
        +ExibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    SmartPhone --> MusicPlayer : composition
    SmartPhone --> PhoneDevice : composition
    SmartPhone --> Internet : composition