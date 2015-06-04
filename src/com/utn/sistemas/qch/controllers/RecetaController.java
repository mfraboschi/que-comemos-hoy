package com.utn.sistemas.qch.controllers;

import com.utn.sistemas.qch.entities.Calificacion;
import com.utn.sistemas.qch.entities.Ingrediente;
import com.utn.sistemas.qch.entities.Receta;
import com.utn.sistemas.qch.entities.Usuario;

public class RecetaController {

    public Receta crearReceta(String nombreReceta) {
        Receta receta = new Receta(nombreReceta);
        receta.guardar();

        return receta;
    }

    public void ingresarIngredienteAReceta(Integer ingredienteId, Receta receta) {
        Ingrediente ingrediente = Ingrediente.buscarIngrediente(ingredienteId);

        receta.agregarIngrediente(ingrediente);
    }

    public void guardarReceta(Usuario usuario, Receta receta) {
        receta.guardar();

        usuario.setReceta(receta);
        usuario.guardar();
    }

    public void calificarReceta(Integer recetaId, Integer usuarioId, Integer calificacionNumero) {
        Usuario usuario = Usuario.obtenerUsuario(usuarioId);
        Receta receta = Receta.obtenerReceta(recetaId);
        Calificacion calificacion = new Calificacion(calificacionNumero, receta, usuario);

        calificacion.guardar();
    }
}
