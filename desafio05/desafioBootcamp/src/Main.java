import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Bootcamp java developer");
        b1.setDescricao("Descrição bootcamp java");
        b1.getConteudos().add(curso1);
        b1.getConteudos().add(curso2);
        b1.getConteudos().add(mentoria);

        Dev d1 = new Dev();
        d1.setNome("Gabriel");
        d1.inscreverBootcamp(b1);
        System.out.println("Conteudos inscritos Gabriel: " + d1.getConteudosInscritos());
        d1.progredir();
        d1.progredir();
        d1.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Gabriel: " + d1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Gabriel: " + d1.getConteudosConcluidos());
        System.out.println("Xp adquirido Gabriel: " + d1.calcularTotalXp());

        System.out.println("--------");
        Dev d2 = new Dev();
        d1.setNome("Camila");
        d2.inscreverBootcamp(b1);
        System.out.println("Conteudos inscritos Camila: " + d2.getConteudosInscritos());
        d2.progredir();
        d2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila: " + d2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila: " + d2.getConteudosConcluidos());
        System.out.println("Xp adquirido Camila: " + d2.calcularTotalXp());


    }
}
