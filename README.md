# Projeto iPhone UML e Implementação em Java 📱

## Descrição

Este repositório inclui dois desafios práticos em Java:

1. **Desafio de Programação Orientada a Objetos (POO)**
    - Reforcar o conhecimento em POO com um desafio prático no contexto bancário. Os pilares da orientação a objetos são explorados de forma interativa e prática, onde pude implementar e evoluir uma solução de referência disponível no GitHub.
    
2. **Desafio iPhone UML e Implementação**
    - Modelagem e diagramação UML do componente `Desafio_Iphone.iPhone`, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Utiliza classes e interfaces para representar as funcionalidades dos pilares de POO.

## Desafio de Programação Orientada a Objetos (POO)

### Contexto do desafio

Neste desafio, foi explorado os conceitos de POO no contexto bancário, onde foi implementado um projeto de referência e desenvolver sua capacidade de abstração. O objetivo é reproduzir a solução e, se desejar, implementar suas próprias evoluções e melhorias.

### Funcionalidades do projeto bancário

- **Abstração:** Identificação e modelagem dos principais componentes do sistema bancário.
- **Encapsulamento:** Proteção dos dados dos objetos.
- **Herança:** Criação de hierarquias de classes.
- **Polimorfismo:** Implementação de métodos que podem ter comportamentos diferentes.

---

## Desafio iPhone UML e Implementação em Java 📱

### Contexto do desafio

Com base no vídeo de lançamento do Desafio_Iphone.iPhone de 2007, o aluno deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implementar as classes e interfaces no formato de arquivos .java.

[Lançamento Desafio_Iphone.iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8) 

### Diagrama UML

![Diagrama UML](assets/UML-DiagramaDeClassesDoProjeto.png)
<p align="center">Foi utilizado a plataforma Mermaid para desenvolver o diagrama de classes acima.</p>

### Interfaces

As interfaces servem para indicar que o iPhone tem acesso a todas elas e que o aparelho pode implementar todas as funcionalidades de um reprodutor musical, um aparelho telefônico e um navegador de internet.

**Reprodutor Musical:**
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

```java
public interface Desafio_Iphone.ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

public interface Desafio_Iphone.AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}
public interface Desafio_Iphone.NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
