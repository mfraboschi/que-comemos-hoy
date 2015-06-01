package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.IngredienteDAO;

public class Ingrediente {

    private static IngredienteDAO ingredienteDAO;

    private String nombre;

    public static Ingrediente buscarIngrediente(Ingrediente ingrediente) {
        return ingredienteDAO.obtenerIngredientePorNombre(ingrediente.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
