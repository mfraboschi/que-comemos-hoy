package entities;

import dao.UsuarioDAO;
import enums.Complexion;
import enums.Sexo;

import java.util.Date;
import java.util.List;

public class Usuario
{

	private static UsuarioDAO usuarioDAO;

	private String id;
	private String password;
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
		return usuarioDAO.obtenerUsuario(usuarioId);
	}


	public void setReceta(Receta receta)
	{
		this.receta=receta;
	}

	public void guardar()
	{
		usuarioDAO.guardarUsuario(this);
	}

	public static List<Usuario> obtenerUsuariosPorSexo(Sexo sexo)
	{
		return usuarioDAO.obtenerUsuariosPorSexo(sexo);
	}
}
