public class Perro{
	String nombre;
	String raza;
	char sexo;
	String color;
	int edad;
	
	public Perro(String nombre, String raza, char sexo, String color, int edad){
		this.nombre=nombre;
		this.raza=raza;
		this.sexo=sexo;
		this.color=color;
		this.edad=edad;
	}
	
	public String retornarNombre(){
		return nombre;
	}
	public String retornarRaza(){
		return raza;
	}
	public char retornarSexo(){
		return sexo;
	}
	public String retornarColor(){
		return color;
	}
	public int retornarEdad(){
		return edad;
	}



	public void obtenerNombte(String nombre){
		this.nombre=nombre;
	}
	public void obtenerRaza(String raza){
		this.raza=raza;
	}
	public void obtenerSexo(char sexo){
		this.sexo=sexo;
	}
	public void obtenerColor(String color){
		this.color=color;
	}
	public void obtenerEdad(int edad){
		this.edad=edad;
	}

	

	public void Ladrar(){
		System.out.println("Estoy ladrando");
	}		
	
}