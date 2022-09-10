package View;
import Controller.BytesController;
import Controller.MegabytesController;
import View.BytesView;
import java.util.Scanner;
import View.MegabytesView;

public class Main {

	public static void main(String[] args) {
		
		int Opcion = 0;
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("\n1: Convertir de Bytes a Kilobytes");
			System.out.println("2: Convertir de Kilobytes a Megabytes");
			System.out.println("3: Salir");
			System.out.println("\nIngresar Opcion");
			Opcion= scan.nextInt();
			
			
			switch(Opcion) {
			case 1:
				System.out.println("\nConversion de Bytes a Kilobytes\n");
				BytesController bytesControl = new BytesController ();
				BytesView bytesView = new BytesView();
				double result = 0;
				result=bytesControl.Convertion(bytesView.imput());
				bytesView.resultado(result);
				break;
			case 2: 
				System.out.println("\nConversion de Kilobytes a Megabytes\n");
				MegabytesController Megabytes = new MegabytesController();
				MegabytesView MegaView = new MegabytesView();
				double resultado = 0;
				resultado = Megabytes.Conversion(MegaView.megabytes());
				MegaView.resultado(resultado);
				break;
				
				default:
				System.out.println("Funcion Incorrecta!!!");
				break;
			}
			
		} while(Opcion !=3);
		

	}

}
