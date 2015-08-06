package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.UsuarioDAO;
import com.utn.sistemas.qch.enums.Complexion;
import com.utn.sistemas.qch.enums.Sexo;

import java.util.Date;
import java.util.List;

public class Usuario {

    private static UsuarioDAO usuarioDAO;

    private Receta receta;
    private Integer id;
    private Date fechaNacimiento;
    private Integer peso;
    private Integer alturaEnCentimetros;
    private Enum<Complexion> complexion;
    private Enum<Sexo> sexo;
    private String dieta;
    private String rutina;


    public static Usuario obtenerUsuario(Integer usuarioId) {
        return usuarioDAO.obtenerUsuario(usuarioId);
    }
    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public void guardar() {
        usuarioDAO.guardarUsuario(this);
    }

    public static List<Usuario> obtenerUsuariosPorSexo(Sexo sexo) {
        return usuarioDAO.obtenerUsuariosPorSexo(sexo);
    }
}
