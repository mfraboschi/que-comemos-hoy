package com.utn.sistemas.qch.controllers;

import com.utn.sistemas.qch.entities.Ingrediente;
import com.utn.sistemas.qch.entities.Receta;

public class RecetaController {

    public Receta crearReceta() {
        return new Receta();
    }

    public void ingresarIngredienteAReceta(Ingrediente ingrediente, Receta receta) {
        receta.agregarIngrediente(ingrediente);
    }

    public void guardarReceta(Receta receta) {
        receta.guardar();
    }
}
