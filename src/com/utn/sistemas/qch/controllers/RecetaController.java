package com.utn.sistemas.qch.controllers;

import com.utn.sistemas.qch.entities.Ingrediente;
import com.utn.sistemas.qch.entities.Receta;
import com.utn.sistemas.qch.entities.Usuario;

public class RecetaController {

    public Receta crearReceta() {
        return new Receta();
    }

    public void ingresarIngredienteAReceta(Ingrediente ingrediente, Receta receta) {
        receta.agregarIngrediente(ingrediente);
    }

    public void guardarReceta(Usuario usuario, Receta receta) {
        receta.guardar();

        usuario.setReceta(receta);
        usuario.guardar();
    }
}
