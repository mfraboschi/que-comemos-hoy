package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.IngredienteDAO;

public class Ingrediente {

    private static IngredienteDAO ingredienteDAO;

    private String nombre;
    private Integer nivelPiramideAlimenticia;

    public static Ingrediente buscarIngrediente(Integer ingredienteId) {
        return ingredienteDAO.obtenerIngredientePorNombre(ingredienteId);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer obtenerNivelPiramideAlimenticia() {
        return nivelPiramideAlimenticia;
    }

    public void setNivelPiramideAlimenticia(Integer nivelPiramideAlimenticia) {
        this.nivelPiramideAlimenticia = nivelPiramideAlimenticia;
    }
}
