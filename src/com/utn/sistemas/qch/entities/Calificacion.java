package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.CalificacionDAO;

public class Calificacion {
    private static CalificacionDAO calificacionDAO;

    private Integer calificacionNumero;
    private Receta receta;

    public Calificacion(Integer calificacionNumero, Receta receta) {
        this.calificacionNumero = calificacionNumero;
        this.receta = receta;
    }

    public void guardar() {
        calificacionDAO.guardar(this);
    }
    public Integer getCalificacionNumero() {
        return calificacionNumero;
    }

    public void setCalificacionNumero(Integer calificacionNumero) {
        this.calificacionNumero = calificacionNumero;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
