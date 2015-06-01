package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.RecetaDAO;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private RecetaDAO recetaDAO;

    private List<Ingrediente> ingredientes;

    public void agregarIngrediente(Ingrediente ingrediente) {
        if(ingredientes == null || ingredientes.isEmpty()) {
            ingredientes = new ArrayList<Ingrediente>();
        }

        ingredientes.add(ingrediente);
    }

    public void guardar() {
        recetaDAO.guardarReceta(this);
    }
}
