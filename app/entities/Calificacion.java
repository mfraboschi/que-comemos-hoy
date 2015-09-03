package entities;

import dao.CalificacionDAO;
import models.*;

public class Calificacion {
    private static CalificacionDAO calificacionDAO;

    private Integer calificacionNumero;
    private Receta receta;
    private Usuario usuario;

    public Calificacion(Integer calificacionNumero, Receta receta, Usuario usuario) {
        this.calificacionNumero = calificacionNumero;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
