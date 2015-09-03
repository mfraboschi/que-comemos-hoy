package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import enums.Sexo;
import enums.Complexion;
import entities.Receta;
@Entity
public class Usuario extends Model
{
	@Id
	private String id;
	private String password;
	public String nombre;
	public String apellido;
	public Date fechaNacimiento;
	public Integer alturaEnCentimetros;
	public Integer peso;
	public String dieta;
	
	

	public void guardar()
	{
	}

	public static List<Usuario> obtenerUsuariosPorSexo(Sexo sexo)
	{
		return new ArrayList<Usuario>();
	}
}
