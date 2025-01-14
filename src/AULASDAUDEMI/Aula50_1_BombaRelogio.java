package AULASDAUDEMI;

import java.util.Scanner;

public class Aula50_1_BombaRelogio {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String senhaCorreta = "353";
        
        String bombaEstatusOn = "desarmada";
        
        String bombaEstatusOff = "AAAAAAHHHHHHH";
        
        int tempoIn = 0;
        
        boolean[] bombaDesarmada = {false};
        
        System.out.println("Rápido, a bomba vai explodir em 15 segundos");
        
        // Thread para contagem regressiva
        Thread contagemThread = new Thread(() -> {
            for (int i = 15; i > tempoIn; i--) {
                System.out.println("Segundos restantes: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Erro: " + e.getMessage());
                }
                if (bombaDesarmada[0]) {
                    break;
                }
            }
            if (!bombaDesarmada[0]) {
                System.out.println("BOOOOOOOMMMMMM \n" + bombaEstatusOff);
                System.out.println("A bomba explodiu!!!!");
            }
        });
        
        // Thread para leitura da senha
        Thread senhaThread = new Thread(() -> {
            while (!bombaDesarmada[0]) {
                System.out.println("Digite a senha para desarmar a bomba:");
                String senha = sc.nextLine();
                if (senha.equals(senhaCorreta)) {
                    System.out.println("Eita, foi por pouco! Bomba " + bombaEstatusOn);
                    bombaDesarmada[0] = true;
                } else {
                    System.out.println("Senha incorreta! Tente novamente.");
                }
            }
        });
        
        contagemThread.start();
        senhaThread.start();
        
        try {
            contagemThread.join();
            senhaThread.join();
        } catch (InterruptedException e) 
        {
            System.err.println("Erro: " + e.getMessage());
        }
        
        sc.close();
    }
}
