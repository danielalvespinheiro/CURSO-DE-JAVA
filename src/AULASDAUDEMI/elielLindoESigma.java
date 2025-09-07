package AULASDAUDEMI;

public class elielLindoESigma {
	public static void main(String[] args) throws InterruptedException {
		int horas = 0, minutos = 0, segundos = 0;
		
		while(horas < 24) {
			System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
			Thread.sleep(1000);
			
			segundos ++;
			
			if (segundos == 60) {
				segundos = 0;
				minutos ++;
			}
				
			if (minutos == 60) {
				minutos = 0;
				horas ++;
			}
		}
	}
}