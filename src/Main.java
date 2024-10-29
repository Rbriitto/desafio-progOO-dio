import dominioo.Curso;
import dominioo.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("Curso de java");
       curso1.setCargaHoraria(8);


       Curso curso2 = new Curso();
       curso2.setTitulo("Curso JS");
       curso2.setDescricao("Curso de js");
       curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("Curso de java");
        mentoria.setData(LocalDate.now());



       System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);
    }
}
 