package POO1.E02;

import java.util.Scanner;

public class execicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		
		int dist = 0;
		
		// Compara caractere por caractere
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				dist++;
			}
		}
		
		System.out.println("Distancia de Hamming: " + dist);
	}
}
