package vendingMaquina;

import java.util.Scanner;

public class AdminKontsola {
	Scanner sc = new Scanner(System.in);
	private Metodoak menu = new Metodoak();


	public void Gakoa() {

		String erabiltzailea = "";
		String pasahitza = "";
		boolean balidatuta = false;
		System.out.println("Ongi etorri admin menura");
		do {

			System.out.println("Erabiltzailea: ");
			erabiltzailea = sc.nextLine();
			System.out.println("Pasahitza: ");
			pasahitza = sc.nextLine();
			balidatuta = Balidazioak.balidatuGakoa(erabiltzailea, pasahitza);
			if (balidatuta == false) {
				System.out.println("Erabiltzailea edo pasahitza okerra da");
				System.out.println("Sartu berriro");
				System.out.println("");
			}
		} while (balidatuta == false);

		menu.menu1();

	}

}