package View;
import Model.MegabytesModel;
import java.util.Scanner;

public class MegabytesView {
	
	public MegabytesModel megabytes() {
		
		MegabytesModel Mgb = new MegabytesModel();
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese numeros Kilobytes");
		Mgb.setKilobytes(scan.nextDouble());
		
		return Mgb;
		
	}
	
	public void resultado(double result) {
		System.out.printf("El resultado en megabytes es:%,2f ", result);
	}

}
