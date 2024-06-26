package aulasDaUdemi;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aula55 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		
		//não é correto declara uma variável com letra maiúscula!
		char R;
		do {
            try {
                System.out.print("Digite a temperatura em celsius: ");
                float c = sc.nextFloat();
                float fahrenheit = (c * 9 / 5) + 32;
                System.out.printf("Equivalente em fahrenheit %.2f%n", fahrenheit);
                sc.nextLine(); // limpa o buffer do scanner

                while (true) {
                    System.out.print("Deseja repetir(s/n)? ");
                    R = sc.next().charAt(0);
                    if (R == 's' || R == 'n') {
                        break; // sai do loop interno se a entrada for válida
                    } else {
                        System.out.println("Entrada inválida! Apenas digite 's' ou 'n'.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número para a temperatura.");
                sc.next(); // limpa a entrada inválida do scanner
                R = 's'; // força a repetição do loop externo
            }
        } while (R != 'n');
		
		System.out.println("FIM");
		
		sc.close();
	}

}
