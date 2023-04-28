import java.util.ArrayList;
public class ManejadorPerro{
	ArrayList<Perro> arregloPerro=new ArrayList<Perro>();
	
	public void agregarArreglo(String nombre, String raza, char sexo, String color, int edad){
		arregloPerro.add(new Perro(nombre, raza, sexo, color, edad));
	}
	public void mostrarDatos(){
		String nombre;
		String nombre2;
		String nombre3;
		
		nombre=arregloPerro.get(0).retornarNombre();
		System.out.println("- - - - - - - - - - - - - - - - -");
		System.out.println("EL NOMBRE DEL PRIMER PERRO ES: "+nombre);

		nombre2=arregloPerro.get(1).retornarNombre();
		System.out.println("EL NOMBRE DEL SEGUNDO PERRO ES: "+nombre2);
		
		nombre3=arregloPerro.get(2).retornarNombre();
		System.out.println("EL NOMBRE DEL TERCER PERRO ES: "+nombre3);
		System.out.println("- - - - - - - - - - - - - - - - -");
		
		for(int x=0; x<arregloPerro.size(); x++){
			System.out.println(arregloPerro.get(x).retornarNombre());
			
			
			
		}

	}
	
	
	
	
}
