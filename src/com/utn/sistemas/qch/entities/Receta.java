package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.RecetaDAO;

import java.util.ArrayList;
import java.util.List;

public class Receta {

    public Receta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    private static RecetaDAO recetaDAO;
    private List<Ingrediente> ingredientes;
    private String nombreReceta;

    public void agregarIngrediente(Ingrediente ingrediente) {
        if (ingredientes == null || ingredientes.isEmpty()) {
            ingredientes = new ArrayList<Ingrediente>();
        }

        ingredientes.add(ingrediente);
    }

    public void guardar() {
        recetaDAO.guardarReceta(this);
    }

    public static Receta obtenerReceta(Integer recetaId) {
        return recetaDAO.obtenerReceta(recetaId);
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }
}
