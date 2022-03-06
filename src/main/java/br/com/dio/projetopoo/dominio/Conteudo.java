package br.com.dio.projetopoo.dominio;

public abstract class Conteudo {

    protected static final double pontos = 5d;

    private String titulo;
    private String descricao;

    public abstract double calcularPontos();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descriacao) {
        this.descricao = descriacao;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
