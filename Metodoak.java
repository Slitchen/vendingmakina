package vendingMaquina;

import java.util.Scanner;

public class Metodoak {
	// Produktuen datuak gordetzeko arrayak
	public String[] motak = new String[30];
	public String[] izenak = new String[30];
	public String[] kodeak = new String[30];
	public double[] prezioak = new double[30];
	public String[] argazkiIzenak = new String[30];
	public int produktuKop = 15; // arrayan sartzen diren produktu kopurua

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
		
		//Inicializar arrays.
		
		//janaria
		motak[0] = "janaria";
		izenak[0] = "chocoboomWhite";
		kodeak[0] = "A001";
		prezioak[0] = 0.80;
		argazkiIzenak[0] = "chocoBoombl";
		
		motak[1] = "janaria";
		izenak[1] = "chocoboomBlack";
		kodeak[1] = "A002";
		prezioak[1] = 0.80;
		argazkiIzenak[1] = "chocoBoomng";
		
		motak[2] = "janaria";
		izenak[2] = "oreo";
		kodeak[2] = "A003";
		prezioak[2] = 1;
		argazkiIzenak[2] = "oreo";
		
		motak[3] = "janaria";
		izenak[3] = "ruflesjamon";
		kodeak[3] = "A004";
		prezioak[3] = 0.50;
		argazkiIzenak[3] = "ruflesjamon";
		
		motak[4] = "janaria";
		izenak[4] = "ruflesjoriginal";
		kodeak[4] = "A005";
		prezioak[4] = 0.50;
		argazkiIzenak[4] = "ruflesoriginal";
		
		motak[5] = "janaria";
		izenak[5] = "ruflesyork";
		kodeak[5] = "A006";
		prezioak[5] = 0.50;
		argazkiIzenak[5] = "ruflesyork";
		
		//edariak
		motak[6] = "edaria";
		izenak[6] = "torolocoopalo";
		kodeak[6] = "A007";
		prezioak[6] = 1;
		argazkiIzenak[6] = "torolocoopalo";

		motak[7] = "edaria";
		izenak[7] = "torolocooriginal";
		kodeak[7] = "A008";
		prezioak[7] = 1;
		argazkiIzenak[7] = "torolocooriginal";
		
		motak[8] = "edaria";
		izenak[8] = "torolocomango";
		kodeak[8] = "A009";
		prezioak[8] = 1;
		argazkiIzenak[8] = "torolocomango";
		
		motak[9] = "edaria";
		izenak[9] = "monsterzuria";
		kodeak[9] = "A010";
		prezioak[9] = 1;
		argazkiIzenak[9] = "monsterzuria";
		
		//erretzaile
		
		motak[10] = "erretzaile";
		izenak[10] = "malboro";
		kodeak[10] = "A011";
		prezioak[10] = 4;
		argazkiIzenak[10] = "fumarmata";
		
		motak[11] = "erretzaile";
		izenak[11] = "luckystrike";
		kodeak[11] = "A012";
		prezioak[11] = 3;
		argazkiIzenak[11] = "luckystrike";
		
		motak[12] = "erretzaile";
		izenak[12] = "camel";
		kodeak[12] = "A013";
		prezioak[12] = 6;
		argazkiIzenak[12] = "camel";
		
		//sexshop
		
		motak[13] = "sexshop";
		izenak[13] = "durexnormal";
		kodeak[13] = "A014";
		prezioak[13] = 12;
		argazkiIzenak[13] = "condonesdurex1";
		
		motak[14] = "sexshop";
		izenak[14] = "durexextrasensitive";
		kodeak[14] = "A015";
		prezioak[14] = 15;
		argazkiIzenak[14] = "extrasensitive";
		
		do {
			do {
				System.out.println("Menu nagusi");
				System.out.println("1. Gehitu produktuak: ");
				System.out.println("2. Ezabatu produktuak: ");
				System.out.println("3. Modifikatu produktuak: ");
				System.out.println("4. Produktuen lista: ");
				System.out.println("5. exit: ");
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
				
				System.out.println("Produktuak");
				for (int h = 0; h < izenak.length; h++) {
					if(izenak[h]!=null) {
					System.out.println(h+"."+" "+"Mota: "+motak[h]+" "+"Izena: "+izenak[h]+" "+"Kodea: "+kodeak[h]+" "+"Prezioa: "+prezioak[h]+"€"+" "+"Argazki_Izena: "+argazkiIzenak[h]);
					}
				}	
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
						
						System.out.println("Produktuak");
						for (int h = 0; h < izenak.length; h++) {
							if(izenak[h]!=null) {
							System.out.println(h+1+"."+" "+"Mota: "+motak[h]+" "+"Izena: "+izenak[h]+" "+"Kodea: "+kodeak[h]+" "+"Prezioa: "+prezioak[h]+"€"+" "+"Argazki_Izena: "+argazkiIzenak[h]);
							}
						}	
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
					System.out.println("Produktuak");
					for (int h = 0; h < izenak.length; h++) {
						if(izenak[h]!=null) {
						System.out.println(h+1+"."+" "+"Mota: "+motak[h]+" "+"Izena: "+izenak[h]+" "+"Kodea: "+kodeak[h]+" "+"Prezioa: "+prezioak[h]+"€"+" "+"Argazki_SIzena: "+argazkiIzenak[h]);
						}
					}	
				}
				System.out.println("Ez dago produkturik");
				break;
			case 4:
					System.out.println("Produktuak");
				for (int i = 0; i < izenak.length; i++) {
					if(izenak[i]!=null) {
					System.out.println(i+1+"."+" "+"Mota: "+motak[i]+" "+"Izena: "+izenak[i]+" "+"Kodea: "+kodeak[i]+" "+"Prezioa: "+prezioak[i]+"€"+" "+"Argazki_Izena: "+argazkiIzenak[i]);
					}
				}	
				break;
			case 5:
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.show(); // Muestra la ventana gráfica
				boolean atera = true; // Esto hace que el bucle se detenga
				return; // Evita que el flujo continúe ejecutándose
			default:
			}
		} while (gora);
	}
}
