import java.util.Scanner;
public class EjemploDoWhile{
	
	public static void main(String args[]){
		
		
		
		int limite;
		int conteo;
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Ingrese el numero inicial");
		conteo=sc.nextInt();
		System.out.println("Ingrese el limite");
		limite=sc.nextInt();
		System.out.println("- - - CONTEO - - -");
		
		if(conteo>=limite){
			System.out.println("No Se Puede Realizar");
		}else{
			do{
				System.out.println(conteo);
				conteo++;
			}
			while(conteo<=limite);
				
		}
	}
}