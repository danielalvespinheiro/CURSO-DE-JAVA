package aula196.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for class A: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			a.add(num);
		}
		
		System.out.print("How many students for class B: ");
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			b.add(num);
		}
		
		System.out.print("How many students for class A: ");
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			c.add(num);
		}
		
		Set<Integer> tt = new HashSet<>(a);
		tt.addAll(b);
		tt.addAll(c);
		
		System.out.println("Total students: " + tt.size());
		
		sc.close();
	}

}
