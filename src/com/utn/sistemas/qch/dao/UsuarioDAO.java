package com.utn.sistemas.qch.dao;

import com.utn.sistemas.qch.entities.Usuario;
import com.utn.sistemas.qch.enums.Sexo;

import java.util.List;

public interface UsuarioDAO {
    public boolean guardarUsuario(Usuario usuario);

    public Usuario obtenerUsuario(Integer usuarioId);

    public List<Usuario> obtenerUsuariosPorSexo(Sexo sexo);
}
