public class PrincipalRepaso{
	public static void main(String args[]){
		
		ManejadorPerro mPerro=new ManejadorPerro();
		mPerro.agregarArreglo("Luna","Cocker",'h', "cafe", 3);
		mPerro.agregarArreglo("Figo", "Boxer", 'm', "negro", 2);
		mPerro.agregarArreglo("Agata", "Doberman", 'h', "Negro con cafe",1);
		
		mPerro.mostrarDatos();
		

	}
}