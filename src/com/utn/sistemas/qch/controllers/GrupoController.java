package com.utn.sistemas.qch.controllers;

import com.utn.sistemas.qch.entities.Grupo;
import com.utn.sistemas.qch.entities.Usuario;

public class GrupoController {

    public void crearGrupo(String nombreGrupo, Usuario creadorGrupo) {
        Grupo grupo = new Grupo(nombreGrupo, creadorGrupo);

        grupo.guardar();
    }

    public void agregarUsuario(Integer usuarioId, Integer grupoId) {
        Usuario usuario = Usuario.obtenerUsuario(usuarioId);
        Grupo grupo = Grupo.obtenerGrupo(grupoId);

        grupo.agregarUsuario(usuario);

        grupo.guardar();


    }

}

//esto deberia aparecer