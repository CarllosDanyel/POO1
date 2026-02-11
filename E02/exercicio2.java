package POO1.E02;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().replace(" ", "");
		sc.close();
		
		int sum = 0;
		boolean dobrar = false;
		
		// Percorre da direita para esquerda
		for (int i = s.length() - 1; i >= 0; i--) {
			int d = s.charAt(i) - '0';
			
			if (dobrar) {
				d *= 2;
				if (d > 9) d -= 9;
			}
			
			sum += d;
			dobrar = !dobrar;
		}
		
		System.out.println(sum % 10 == 0 ? "Válido" : "Inválido");
	}
}
