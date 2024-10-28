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

			System.out.println("Erabiltzailea: ");
			erabiltzailea = sc.nextLine();
			System.out.println("Pasahitza: ");
			pasahitza = sc.nextLine();
			balidatuta = Balidazioak.balidatuGakoa(erabiltzailea, pasahitza);
			if (balidatuta == false) {
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.show(); // Muestra la ventana gráfica
				boolean atera = true; // Esto hace que el bucle se detenga
				return; // Evita que el flujo continúe ejecutándose
			}

		menu.menu1();

	}

}