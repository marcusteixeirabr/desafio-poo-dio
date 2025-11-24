import com.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8); 
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Descrição da mentoria de JavaScript");
        mentoria2.setData(LocalDate.of(2024, 11, 20));

        System.out.println(mentoria1);  
        System.out.println(mentoria2);

        Conteudo curso3 = new Curso();
        curso3.setTitulo("Curso Python");
        curso3.setDescricao("Descrição do curso Python");   
        ((Curso) curso3).setCargaHoraria(6);

        Conteudo mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria de Python");
        mentoria3.setDescricao("Descrição da mentoria de Python");
        ((Mentoria) mentoria3).setData(LocalDate.of(2024, 12, 15));

        System.out.println(curso3);
        System.out.println(mentoria3);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devMarcus = new Dev();
        devMarcus.setNome("Marcus");
        devMarcus.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos de Marcus: " + devMarcus.getConteudosInscritos());
        devMarcus.progredir();
        devMarcus.progredir();
        System.out.println("Conteúdos concluídos de Marcus: " + devMarcus.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Marcus: " + devMarcus.getConteudosInscritos());
        System.out.println("XP de Marcus: " + devMarcus.calcularTotalXP());

        System.out.println("-----------------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos de Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("Conteúdos concluídos de Ana: " + devAna.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos de Ana: " + devAna.getConteudosInscritos());
        System.out.println("XP de Ana: " + devAna.calcularTotalXP());


    }
}
