package POO1.E02;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		while (true) {
			int n = sc.nextInt();
			if (n == -1) break;
			
			count++;
			sum += n;
			if (n > max) max = n;
			if (n < min) min = n;
		}
		
		System.out.println("Quantidade: " + count);
		System.out.println("Maior: " + max);
		System.out.println("Menor: " + min);
		System.out.println("Media: " + (double) sum / count);
		sc.close();
	}
}
