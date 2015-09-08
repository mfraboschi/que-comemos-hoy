package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Receta;
import enums.Sexo;
import enums.Complexion;


public class Usuario
{
	public String id;
	public String password;
	public String nombre;
	public char sexo;
	public Date fechaNacimiento;
	public Integer alturaEnCentimetros;
	public Integer peso;
	public String dieta;
	private String rutina;
	public Enum<Complexion> complexion;
	public List<Receta> recetas;
	public Receta receta;
	
	public static Usuario obtenerUsuario(Integer usuarioId)
	{
		return new Usuario();
	}


	public void setReceta(Receta receta)
	{
		this.receta=receta;
	}

	public void guardar()
	{
	}

	public static List<Usuario> obtenerUsuariosPorSexo(Sexo sexo)
	{
		return new ArrayList<Usuario>();
	}
}
