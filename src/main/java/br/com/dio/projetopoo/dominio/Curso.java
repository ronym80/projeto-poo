package br.com.dio.projetopoo.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Curso {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(4);
    private Set<Aluno> alunosCursando = new HashSet<>();
    private Set<Materia> materias = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Aluno> getAlunosCursando() {
        return alunosCursando;
    }

    public void setAlunosCursando(Set<Aluno> alunosCursando) {
        this.alunosCursando = alunosCursando;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome) && Objects.equals(descricao, curso.descricao) && Objects.equals(dataInicial, curso.dataInicial) && Objects.equals(dataFinal, curso.dataFinal) && Objects.equals(alunosCursando, curso.alunosCursando) && Objects.equals(materias, curso.materias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, alunosCursando, materias);
    }
}
