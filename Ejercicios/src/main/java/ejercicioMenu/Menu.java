package ejercicioMenu;

import java.util.Scanner;

public class Menu {
	
	public static void imprimirMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a mi menu temporal");
		System.out.println("1 - Mostrar opcion uno");
		System.out.println("2 - Mostrar opcion dos");
		
		int option = sc.nextInt();
		
		switch (option) {
			case 1:
				System.out.println("Has introducido la opcion uno.");
				break;
			case 2:
				System.out.println("Has introducido la opcion dos.");
				break;
			default:

		}
		sc.close();
	}
	
}