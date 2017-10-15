package mundo;

public class Empleado extends Persona{

	private String cargo;
	private double sueldo;
	
	
	public Empleado(String id, String edad, String nombre) 
	{
		super(id, edad, nombre);
	}
	
	public Empleado(String id, String edad, String nombre, String cargo, double sueldo)
	{
		super(id,edad,nombre);
		this.cargo=cargo;
		this.sueldo=sueldo;
	}
	
	public double getSueldo()
	{
		return sueldo;
	}
	
	public String getCargo() 
	{
		return cargo;
	}

}
