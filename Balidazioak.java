package erronka;

public class Balidazioak {
	public static boolean balidazio1(int aukera, String saukera) {
		boolean error = true;

		try {
			aukera = Integer.parseInt(saukera);
			error = false;
		}
		catch (Exception e) {
		}
		
		return error;
	}
	
	public static boolean balidatuGakoa(String erabiltzailea, String pasahitza) {
		boolean balidatuta = false;

		if (erabiltzailea.equals("admin") && pasahitza.equals("admin")) {
			balidatuta = true;
			return balidatuta;
		} else {
			return balidatuta;
		}

	}
}
