package Controller;
import Model.MegabytesModel;

public class MegabytesController {
	
	public double Conversion (MegabytesModel bytes) {
		double Mgbts = 0;
		Mgbts = bytes.getKilobytes()/1024;
		return Mgbts;
	}

}
