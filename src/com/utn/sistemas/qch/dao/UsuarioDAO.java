package com.utn.sistemas.qch.dao;

import com.utn.sistemas.qch.entities.Usuario;

public interface UsuarioDAO {
    public boolean guardarUsuario(Usuario usuario);

    public Usuario obtenerUsuario(Integer usuarioId);
}
