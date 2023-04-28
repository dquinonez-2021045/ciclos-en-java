// Creacuin de variables 
import java.util.Scanner;
public class While{
	
	public static void main(String args[]){
		
		/* CREAR UN PROGRAMA DONDE SE INDIQE DONDE QUIERE INICIAR A CONTAR Y HASTA DONDE QUIERE LLEGAR
		TOMAR EN CUENTA QUE EL INICIO NO PUEDE SER MAYOR QUE EL LIMITE*/
		
		Scanner sc=new Scanner(System.in);
		
		int limite;
		int conteo;
		
	
		
		System.out.println("Ingrese el numero inicial");
		conteo=sc.nextInt();
		System.out.println("Ingrese el limite");
		limite=sc.nextInt();
		System.out.println("- - - CONTEO - - -");
		
		if(conteo>=limite){
			System.out.println("No Se Puede Realizar");
		}else{
		
			while(conteo<=limite){
				System.out.println(conteo);
				conteo++;
			}
		}
	}
}