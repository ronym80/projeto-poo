package br.com.dio.projetopoo.dominio;

public class Materia extends Conteudo{


    private int cargaHoraria;

    @Override
    public double calcularPontos() {
        return pontos * cargaHoraria;
    }

    public Materia() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Materias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
