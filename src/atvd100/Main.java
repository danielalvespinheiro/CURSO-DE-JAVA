package atvd100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atvd100.model.Funcionario;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Funcionario fc = new Funcionario();
		
		List<Funcionario> ls = new ArrayList<>();
		
		System.out.print("Digite a qtd de funcionários que desaja cadastrar: ");
		int qtdFun = sc.nextInt();
		
		for(int i=0; i<qtdFun; i++) {
			System.out.println();
			System.out.println("Funcionário #"+(i+1)+":");
			Integer id = fc.gerarId();
			System.out.println("Id: " + id);
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Funcionario fun = new Funcionario(id, name, salario);
			
			ls.add(fun);
		}
		
		// Funcionario fun = ls.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		System.out.println();
		System.out.print("Digite o id do funcionário que vai receber aumento: ");
		
		int idSalario = sc.nextInt();
		Integer posi = posiId(ls, idSalario);
		
		if(posi == null) {
			System.out.println("O id não existe!");
		}
		else {
			System.out.println();
			System.out.print("Digite a porcentagem: ");
			double pocentage = sc.nextDouble();
			ls.get(posi).aumento(pocentage);
		}
		
		System.out.println();
		System.out.println("Lista de funcionário: ");
		for(Funcionario f : ls) {
			System.out.println(f);
		}
		
		sc.close();
	}
	
	static Integer posiId(List<Funcionario> ls, int id) {
		
		for(int i=0; i<ls.size(); i++) {
			if(ls.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
