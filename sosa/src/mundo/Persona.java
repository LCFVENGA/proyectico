package mundo;

public class Persona {
	
	private String id;
	private String edad;
	private String nombre;
	
	public Persona(String id,String edad,String nombre) 
	{
		this.id=id;
		this.edad=edad;
		this.nombre=nombre;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getEdad()
	{
		return edad;
	}

}
