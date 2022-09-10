package Controller;
import Model.BytesModels;

public class BytesController {
	
	public double Convertion(BytesModels bytes ) {
		
		double KB= 0;
			KB= bytes.getBytes()/1000;
			
		
		return KB;
	}

}
