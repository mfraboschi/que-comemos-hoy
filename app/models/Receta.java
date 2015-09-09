package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import enums.Sexo;
import enums.Complexion;
import entities.Condimento;
import entities.Ingrediente;
import models.Usuario;
@Entity
public class Receta extends Model
{
	@Id
	public String nombreReceta;
	public Usuario duenio;
	//public List<Ingrediente> ingredientes;
	//public List<Condimento> condimentos;
	public Integer calificacion;
	//public List<String> categoria;
	public Integer dificultad;
	public String temporada;
	public Integer calorias;
	//public List<String> contraIndicaciones;
	//public List<String> procedimientos;

}
