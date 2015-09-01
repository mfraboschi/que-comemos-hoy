package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.GrupoDAO;

import java.util.HashSet;
import java.util.Set;

public class Grupo {
    private static GrupoDAO grupoDAO;

    public String nombre;
    public String intereses;
    public String preferencias;
    public Set<Usuario> listaUsuarios;
    public Usuario creador;
    
    public Grupo(String nombreGrupo, Usuario creador) {
        this.creador = creador;
        this.nombre = nombreGrupo;
        agregarUsuario(creador);
    }

    public void agregarUsuario(Usuario usuario) {
        if(listaUsuarios == null) {
            listaUsuarios = new HashSet<Usuario>();
        }

        listaUsuarios.add(usuario);
    }

    public boolean guardar() {
        return grupoDAO.guardarGrupo(this);
    }

    public static Grupo obtenerGrupo(Integer grupoId) {
        return grupoDAO.obtenerGrupo(grupoId);
    }
}
