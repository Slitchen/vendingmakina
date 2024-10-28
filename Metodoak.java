package vendingMaquina;

import java.util.Scanner;

public class Metodoak {
	// Produktuen datuak gordetzeko arrayak
	public String[] motak = new String[4];
	public String[] izenak = new String[30];
	public String[] kodeak = new String[30];
	public double[] prezioak = new double[30];
	public String[] argazkiIzenak = new String[30];
	public int produktuKop = 0; // arrayan sartzen diren produktu kopurua

	public void menu1() {
		Scanner sc = new Scanner(System.in);
		int aukera = 0;
		String saukera = "";
		String mota1 = "";
		String izena1 = "";
		String kode1 = "";
		boolean error = true;
		boolean gora = true;
		boolean salir = false;
		boolean encontrado = false;
		do {
			do {
				System.out.println("Menu nagusi");
				System.out.println("1. Gehitu produktuak: ");
				System.out.println("2. Ezabatu produktuak: ");
				System.out.println("3. Modifikatu produktuak: ");
				System.out.println("4. exit: ");
				saukera = sc.nextLine();
				Balidazioak.balidazio1(aukera, saukera);
				error = Balidazioak.balidazio1(aukera, saukera);
			}

			while (error);
			aukera = Integer.parseInt(saukera);
			switch (aukera) {
			case 1:
				System.out.println("|Gehitu Menua|");
				System.out.println("Ipini produktuen mota: ");
				motak[produktuKop] = sc.nextLine();
				System.out.println("Ipini produktuen izena: ");
				izenak[produktuKop] = sc.nextLine();
				System.out.println("Ipini produktuen kodea: ");
				kodeak[produktuKop] = sc.nextLine();
				System.out.println("Ipini produktuen prezioa: ");
				prezioak[produktuKop] = sc.nextDouble();
				sc.nextLine(); // Consumir el salto de línea
				System.out.println("Ipini produktuen argazki izena: ");
				argazkiIzenak[produktuKop] = sc.nextLine();
				produktuKop++; // Incrementar el contador de productos
				break;
			case 2:
				// Ezabatu produktuak
				System.out.println("|Ezabatu Menua|");
				System.out.println("Ipini produktuen mota: ");
				mota1 = sc.nextLine();
				System.out.println("Ipini produktuen izena: ");
				izena1 = sc.nextLine();
				System.out.println("Ipini produktuen kodigoa: ");
				kode1 = sc.nextLine();

				// Buscar el producto para eliminar
				encontrado = false;
				for (int i = 0; i < produktuKop; i++) {

					if (mota1.equals(motak[i]) && izena1.equals(izenak[i]) && kode1.equals(kodeak[i])) {
						// Eliminar el producto
						encontrado = true;
						// Desplazar los elementos a la izquierda
						for (int j = i; j < produktuKop - 1; j++) {
							motak[j] = motak[j + 1]; // Mueve el siguiente tipo de producto al lugar actual
							izenak[j] = izenak[j + 1]; // Mueve el siguiente nombre de producto
							kodeak[j] = kodeak[j + 1]; // Mueve el siguiente código de producto
							prezioak[j] = prezioak[j + 1]; // Mueve el siguiente precio
							argazkiIzenak[j] = argazkiIzenak[j + 1]; // Mueve el siguiente nombre de imagen
						}
						motak[produktuKop - 1] = null; // Opcional: limpiar el último elemento
						izenak[produktuKop - 1] = null; // Opcional: limpiar el último elemento
						kodeak[produktuKop - 1] = null; // Opcional: limpiar el último elemento
						prezioak[produktuKop - 1] = 0; // Opcional: limpiar el último elemento
						argazkiIzenak[produktuKop - 1] = null; // Opcional: limpiar el último elemento
						produktuKop--; // Reducir el contador de productos
						System.out.println("Produktu ezabatu da.");
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Produktu ez da aurkitu.");
				}
				break;
			case 3:
				System.out.println("Ipini produktuen mota: ");
				mota1 = sc.nextLine();
				System.out.println("Ipini produktuen izena: ");
				izena1 = sc.nextLine();
				System.out.println("Ipini produktuen kodigoa: ");
				kode1 = sc.nextLine();

				// Buscar el producto para eliminar
				encontrado = false;
				for (int i = 0; i < produktuKop; i++) {

					if (mota1.equals(motak[i]) && izena1.equals(izenak[i]) && kode1.equals(kodeak[i])) {
						// Eliminar el producto
						encontrado = true;
						// Desplazar los elementos a la izquierda
						for (int j = i; j < produktuKop - 1; j++) {
							motak[j] = motak[j + 1]; // Mueve el siguiente tipo de producto al lugar actual
							izenak[j] = izenak[j + 1]; // Mueve el siguiente nombre de producto
							kodeak[j] = kodeak[j + 1]; // Mueve el siguiente código de producto
							prezioak[j] = prezioak[j + 1]; // Mueve el siguiente precio
							argazkiIzenak[j] = argazkiIzenak[j + 1]; // Mueve el siguiente nombre de imagen
						}
						System.out.println("Ipini produktuen mota berria: ");
						motak[produktuKop -1] = sc.nextLine();
						System.out.println("Ipini produktuen izen berria: ");
						izenak[produktuKop-1] = sc.nextLine();
						System.out.println("Ipini produktuen kode berria: ");
						kodeak[produktuKop-1] = sc.nextLine();
						System.out.println("Ipini produktuen prezio berria: ");
						prezioak[produktuKop-1] = sc.nextDouble();
						sc.nextLine(); // Consumir el salto de línea
						System.out.println("Ipini produktuen argazki izen berria: ");
						argazkiIzenak[produktuKop-1] = sc.nextLine();
						System.out.println("Produktu aldatu da.");
					}
				}
				break;
			case 4:
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.show(); // Muestra la ventana gráfica
				salir = true; // Esto hace que el bucle se detenga
				return; // Evita que el flujo continúe ejecutándose
			default:
			}

			for (int i = 0; i < produktuKop; i++) {
				System.out.println(motak[i]);
				System.out.println(kodeak[i]);
				System.out.println(izenak[i]);
				System.out.println(argazkiIzenak[i]);
				System.out.println(prezioak[i]);
				System.out.println(produktuKop);
			}

		} while (gora);
	}
}
