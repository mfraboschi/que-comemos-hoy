package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.UsuarioDAO;

public class Usuario {

    private UsuarioDAO usuarioDAO;
    private Receta receta;

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public void guardar() {
        usuarioDAO.guardarUsuario(this);
    }
}
