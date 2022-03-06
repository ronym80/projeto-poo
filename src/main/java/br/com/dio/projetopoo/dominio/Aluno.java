package br.com.dio.projetopoo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Aluno {
    private String nome;
    private Set<Conteudo> materiasCursadas = new LinkedHashSet<>();
    private Set<Conteudo> materiasConcluídas= new LinkedHashSet<>();

    public void inscreverCurso(Curso curso){
        this.materiasCursadas.addAll(curso.getMaterias());
        curso.getAlunosCursando().add(this);
    }

    public void progredir(){
        Optional<Conteudo> materia = this.materiasCursadas.stream().findFirst();
        if(materia.isPresent()){
            this.materiasConcluídas.add(materia.get());
            this.materiasCursadas.remove(materia.get());
        }else{
            System.err.println("Você não está matriculado em nenhuma materia!");
        }
    }

    public double calcularTotalPontos(){
        return this.materiasConcluídas.stream().mapToDouble(materia -> materia.calcularPontos()).sum();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(Set<Conteudo> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public Set<Conteudo> getMateriasConcluídas() {
        return materiasConcluídas;
    }

    public void setMateriasConcluídas(Set<Conteudo> materiasConcluídas) {
        this.materiasConcluídas = materiasConcluídas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(materiasCursadas, aluno.materiasCursadas) && Objects.equals(materiasConcluídas, aluno.materiasConcluídas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, materiasCursadas, materiasConcluídas);
    }
}
