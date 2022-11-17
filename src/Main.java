import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao Mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java");
        bootcamp1.setDescricao("Descricao Bootcamp Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1 Java");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Dev1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("---------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev2 Java");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());




    }
}

