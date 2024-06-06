import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("Curso de nível básico da linguagem de Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Intermediário");
        curso2.setDescricao("Curso de nível médio da linguagem de Java.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria da linguagem de Java.");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para ser um Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudosConcluidos());
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

        System.out.println("--------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());








    }
}
