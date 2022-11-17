import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao Mentoria Java");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria JavaScript");
        mentoria2.setDescricao("Descricao Mentoria JavaScript");
        mentoria2.setData(LocalDate.now());

    }
}

