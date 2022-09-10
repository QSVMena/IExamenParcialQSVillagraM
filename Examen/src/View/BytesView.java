package View;
import java.util.Scanner;
import Model.BytesModels;

public class BytesView {

	public BytesModels imput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese numeros bytes");
		BytesModels bytes = new BytesModels();
		bytes.setBytes(scan.nextDouble());
		return bytes;
	}
	
	public void resultado(double result) {
		System.out.printf("El resultado en kilobytes es:%,2f ", result);
	}
}
