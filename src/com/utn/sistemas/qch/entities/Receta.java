package com.utn.sistemas.qch.entities;

import com.utn.sistemas.qch.dao.RecetaDAO;
import com.utn.sistemas.qch.enums.Periodo;

import java.util.ArrayList;
import java.util.List;

public class Receta {

    public Receta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    private static RecetaDAO recetaDAO;
    private List<Ingrediente> ingredientes;
    private String nombreReceta;
    private Integer dificultad;
    private String temporada;
    private Integer calorias;
    private List<String> contraIndicaciones;

    public void agregarIngrediente(Ingrediente ingrediente) {
        if (ingredientes == null || ingredientes.isEmpty()) {
            ingredientes = new ArrayList<Ingrediente>();
        }

        ingredientes.add(ingrediente);
    }

    public void guardar() {
        recetaDAO.guardarReceta(this);
    }

    public static Receta obtenerReceta(Integer recetaId) {
        return recetaDAO.obtenerReceta(recetaId);
    }

    public static List<Receta> obtenerRecetasDeUsuarios(List<Usuario> usuarios) {
        return recetaDAO.obtenerRecetasDeUsuarios(usuarios);
    }

    public static List<Receta> obtenerRecetasPorDificultad(Periodo periodo, String dificultad) {
        return recetaDAO.obtenerRecetasPorDificultad(periodo, dificultad);
    }

    public static List<Receta> obtenerRecetasMasConsultadas(Periodo periodo) {
        return recetaDAO.obtenerRecetasMasConsultadas(periodo);
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    public List<String> obtenerContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(List<String> contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public Integer obtenerNivelEnPiramideAlimenticia() {
        if(ingredientes.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Ingrediente ingrediente : ingredientes) {
            sum += ingrediente.obtenerNivelPiramideAlimenticia();
        }

        return sum / ingredientes.size();
    }
}
