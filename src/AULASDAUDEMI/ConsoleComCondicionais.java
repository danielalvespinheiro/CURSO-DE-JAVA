package AULASDAUDEMI;

import java.sql.Time;
import java.text.spi.NumberFormatProvider;
import java.util.InputMismatchException;
import java.util.Scanner;
import aula67ProdutoEmEstoque.model.Produto;

public class ConsoleComCondicionais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto pd = new Produto();

        //Loop inicial, sempre que o usuario realizar alguma ação que não seja a de finalização
        //O loop reiniciara
        while(true) {
        	System.out.println("Bem-vindo ao terminal de logística");
        	System.out.println("");
        	System.out.println("Espere so alguns segundos para aparecer as opções ");
        	
        	try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("A Operação foi cancelada! " + "Code -> ߍ");
			}
            System.out.println("Digite abaixo a opção que você deseja:");
            System.out.println("1 - Status do estoque");
            System.out.println("2 - Adicionar produtos ao estoque");
            System.out.println("0 - Sair do programa");
            System.out.println("");
            
            int resp = sc.nextInt();
            sc.nextLine(); 
            
            if(resp == 0) {
            	System.out.println("finalizando....");
            	try {
            		Thread.sleep(1500);
            		System.out.println("Finalizado! ");
            	} catch(InterruptedException e) {
            		System.out.println("Finalização interrompida " + e);
            	}
            	break;
            	
            	//Logica para visualizar os produtos cadastrados
            }else if(resp == 1) {
            	System.out.println("");
            	System.out.println("Imprimindo estatus do estoque: ");
            	System.out.println(pd.nome + "| preço do produto R$" 
            	+ pd.preco 
            	+ "| quantidade no estoque " 
            	+ pd.qtdEstoque);
            	
            	try {
            		Thread.sleep(1500);
            	} catch(InterruptedException e) {
            		System.out.println("Finalização interrompida " + e);
            	}
            	System.out.println("");
            	//Logica para adicionar produtos
            }else if(resp == 777) { 
            	System.out.println("Curioso...");
            	try {
					Thread.sleep(2500);
				} catch (Exception e) {
					System.out.println("Agora é so esperar :)");
				}
            } else if(resp == 2) {
            	System.out.println("");
            	System.out.println("Coloque os dados dos produtos! ");
        		System.out.print("nome do Produto: ");
        		pd.nome = sc.nextLine();
        		
        		//Logica da adição dos preços, aqui ela entra em um while por conta da virgula
        		// agora o usuario pode usar virgula ao inves de ponto
        		while(true) {
        			try {
        				System.out.println("");
        				System.out.print("Preço: ");
        				String parsePreco = sc.nextLine().replace(",", ".");
        				pd.preco = Double.parseDouble(parsePreco);
        				break;
        			}catch(NumberFormatException e) {
                		System.out.println("Porfavor insira um valor valido! Tem que ser um valor com virgula!");
                	}
        		}
        		//Logica para adicionar a quantidade de produtos
        		while(true) {
        			try {
        				System.out.println("");
        				System.out.print("Quantidade em estoque: ");
        				pd.qtdEstoque = sc.nextInt();
        				break;
					} catch (InputMismatchException e) {
						System.out.println("Erro: digite um valor válido. O valor tem que ser decimal");
						sc.nextLine();
					}
        			
        		}
        		System.out.println("");
        		System.out.println("Produto adicionado com sucesso! ");
        		System.out.println("");
            }else {
            	System.out.println("");
            	System.out.println("Digite uma opção que exista, basta olhar a mensagem inicial :)");
            	System.out.println("");
            }
        }
        
    }
}
