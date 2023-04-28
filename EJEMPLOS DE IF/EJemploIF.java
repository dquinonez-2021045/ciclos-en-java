// Creacuin de variables 
import java.util.Scanner;
public class EjemploIF{
	
	public static void main(String args[]){
	

		
		Scanner sc=new Scanner(System.in);
		
		
			// EJEERCICIO IF
			int aa;
			int opcion;
			int bb;
			int total;
			
			System.out.println(" - - - MENU - - - ");
			System.out.println("1. . . POSITIVO O NEGATIVO");
			System.out.println("2. . . MAYOR Y  MENOR");
			System.out.println("3. . . DIVISION");
			opcion=sc.nextInt();
			switch(opcion){
				case 1:
					System.out.println("ingrese el valor");
					aa=sc.nextInt();
					if (aa<0){
					System.out.println("Es negativo");
					}else if (aa>0){
					System.out.println("Es positivo");
					}else{
					System.out.println("Es neutro");
					}
				break;
				case 2:
					System.out.println("ingrese el primer valor");
					aa=sc.nextInt();
					System.out.println("ingrese el segundo valor");
					bb=sc.nextInt();
					if (aa>bb){
						System.out.println(aa +" ES MAYOR QUE "+ bb);
						
					}else if (aa<bb){
						System.out.println(bb +" ES MAYOR QUE " + aa);
					}else{
						System.out.println("NUMERO INVALIDO");
					}
				break;
				case 3:
					System.out.println("ingrese el primer valor");
					aa=sc.nextInt();
					System.out.println("ingrese el segundo valor");
					bb=sc.nextInt();
					if(bb==0){
						System.out.println("VALOR INVALIDO INGRESE NUEVAMENTE");
					}else{
						total=aa/bb;
						System.out.println("El total de la division es: "+total);
					}
				break;
				default:
					System.out.println("INCORRECTO");
					
			}
	}
}