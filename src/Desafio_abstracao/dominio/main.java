package Desafio_abstracao.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(90);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso c");
        curso1.setDescricao("descrição curso c");
        curso1.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java dev");
        bootcamp.setDescricao("descricao do bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Nicolas");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudo inscritos: \n " + dev.getConteudosInscritos());
        System.out.println("\nConteudo Concluidos: \n " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularXp());
        dev.progredir();
        System.out.println("\nConteudo inscritos: \n " + dev.getConteudosInscritos());
        System.out.println("XP depois: " + dev.calcularXp());

        System.out.println("\n--------------------------\n");

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudo inscritos: \n " + dev1.getConteudosInscritos());
        dev1.progredir();

        System.out.println("\nConteudo Concluidos: \n " + dev1.getConteudosConcluidos());
        System.out.println("\nConteudo inscritos depois: \n " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev.calcularXp());






    }
}
