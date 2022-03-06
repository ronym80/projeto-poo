package br.com.dio.projetopoo.dominio;

import java.time.LocalDate;
import java.util.Date;

public class Laboratorio extends Materia {


    private LocalDate dataLab;

    @Override
    public double calcularPontos() {
        return pontos + 10d;
    }

    public Laboratorio() {
    }


    public LocalDate getDataLab() {
        return dataLab;
    }

    public void setDataLab(LocalDate dataLab) {
        this.dataLab = dataLab;
    }

}
