package dominio;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("Descrição Curso de java");
       curso1.setCargaHoraria(8);


       Curso curso2 = new Curso();
       curso2.setTitulo("Curso JS");
       curso2.setDescricao("Curso de js");
       curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("Curso de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/

Bootcamp bootcamp  = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

Dev devRodrigo = new Dev();
devRodrigo.setNome("Rodrigo");
devRodrigo.inscreverBootCamp(bootcamp);
System.out.println("Conteudos Inscritos "+devRodrigo.getConteudosInscritos());
devRodrigo.progredir();
devRodrigo.progredir();
System.out.println(" - ");
System.out.println("Conteudos Inscritos "+devRodrigo.getConteudosInscritos());
System.out.println("Conteúdos Concluídos Rodrigo:" + devRodrigo.getConteudosConcluidos());
System.out.println("XP: "+ devRodrigo.calcularTotalXp());

System.out.println(" - - - - - - - ");

Dev devJoao = new Dev();
devJoao.setNome("Joao"); 
devJoao.inscreverBootCamp(bootcamp);
System.out.println("Conteudos Inscritos "+devJoao.getConteudosInscritos());
devJoao.progredir();
devJoao.progredir();
devJoao.progredir();
System.out.println(" - ");
System.out.println("Conteudos Inscritos "+devJoao.getConteudosInscritos());
System.out.println("Conteúdos Concluídos Joao:" + devJoao.getConteudosConcluidos());
System.out.println("XP: "+ devJoao.calcularTotalXp());









    }
}
 