import br.com.dio.projetopoo.dominio.Aluno;
import br.com.dio.projetopoo.dominio.Curso;
import br.com.dio.projetopoo.dominio.Laboratorio;
import br.com.dio.projetopoo.dominio.Materia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Materia materia1 = new Materia();
        materia1.setTitulo("Materia de polimorfismo");
        materia1.setDescricao("Descrição da materia polimorfismo");
        materia1.setCargaHoraria(2);

        Materia materia2 = new Materia();
        materia2.setTitulo("Materia de abstração");
        materia2.setDescricao("Descrição da materia abstração");
        materia2.setCargaHoraria(1);

        Laboratorio laboratorio = new Laboratorio();
        laboratorio.setTitulo("Laboratorio");
        laboratorio.setDescricao("Descrição Laboratorio");
        laboratorio.setDataLab(LocalDate.now());


//        System.out.println(materia1);
//        System.out.println(materia2);
       //System.out.println(laboratorio);

        Curso curso = new Curso();
        curso.setNome("Materia polimorfismo");
        curso.setDescricao("Descriação materia polimorfismo");
        curso.getMaterias().add(materia1);
        curso.getMaterias().add(materia2);
        curso.getMaterias().add(laboratorio);


        Aluno jose = new Aluno();
        jose.setNome("José");
        jose.inscreverCurso(curso);
        System.out.println("Materias cursadas José "+ jose.getMateriasCursadas());
        jose.progredir();
        jose.progredir();
        System.out.println("-");
        System.out.println("Materias cursadas José "+ jose.getMateriasCursadas());
        System.out.println("Materias concluídas José "+ jose.getMateriasConcluídas());
        System.out.println("Pontos: "+ jose.calcularTotalPontos());

        System.out.println("------------------------");

        Aluno maria = new Aluno();
        maria.setNome("Maria");
        maria.inscreverCurso(curso);
        System.out.println("Materias cursadas Maria"+ maria.getMateriasCursadas());
        maria.progredir();
        maria.progredir();
        maria.progredir();
        System.out.println("-");
        System.out.println("Materias cursadas Maria"+ maria.getMateriasCursadas());
        System.out.println("Materias concluídas Maria"+ maria.getMateriasConcluídas());
        System.out.println("Pontos: "+ maria.calcularTotalPontos());


    }
}
