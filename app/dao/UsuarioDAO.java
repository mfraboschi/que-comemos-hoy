package dao;

import java.util.List;

import entities.Usuario;
import enums.Sexo;

public interface UsuarioDAO {
    public boolean guardarUsuario(Usuario usuario);

    public Usuario obtenerUsuario(Integer usuarioId);

    public List<Usuario> obtenerUsuariosPorSexo(Sexo sexo);
}
