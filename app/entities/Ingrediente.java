package entities;

import dao.IngredienteDAO;

public class Ingrediente
{

	private static IngredienteDAO ingredienteDAO;

	public String nombre;
	public Integer nivelPiramideAlimenticia;
	public Integer contraindicaciones;
	public Integer caloriasXPorcion;

	public static Ingrediente buscarIngrediente(Integer ingredienteId)
	{
		return ingredienteDAO.obtenerIngredientePorNombre(ingredienteId);
	}

	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	public Integer obtenerNivelPiramideAlimenticia()
	{
		return nivelPiramideAlimenticia;
	}

	public void setNivelPiramideAlimenticia(Integer nivelPiramideAlimenticia)
	{
		this.nivelPiramideAlimenticia=nivelPiramideAlimenticia;
	}
}
