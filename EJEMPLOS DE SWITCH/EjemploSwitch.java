import java.util.Scanner;
public class EjemploSwitch{
	public static void main(String args[]){


	Scanner sc=new Scanner(System.in);
		int opcion;
		int nume;
		int nume2;
		int total1;
		
		System.out.println(" - - - MENU - - - ");
		System.out.println("1. . . SUMA");
		System.out.println("2. . . RESTA");
		System.out.println("3. . . MULTIPLICACION");
		System.out.println("4. . . DIVISION");
		System.out.println("Ingrese una opcion del menu");
		opcion=sc.nextInt();
	
	
		System.out.println(" - - - - - - - - - - -");
		System.out.println("Ingrese el primer valor");
		nume=sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		nume2=sc.nextInt();
		
		
		
		switch(opcion){
			
			case 1:
				total1=nume+nume2;
				System.out.println("EL TOTAL DE LA SUMA ES: "+total1);
			break;
			case 2:
				total1=nume-nume2;
				System.out.println("EL TOTAL DE LA RESTA ES: "+total1);
			break;
			case 3:
				total1=nume*nume2;
				System.out.println("EL TOTAL DE LA MULTIPLICACION ES: "+total1);
			break;
			case 4:
				total1=nume/nume2;
				System.out.println("EL TOTAL DE LA DIVISION ES: "+total1);
			break;	
			default:
				System.out.println("No existe");
			}
	}		
}