package aula181.aplication;

import aula181.device.ComboDevice;
import aula181.device.ConcretePrinter;
import aula181.device.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1234");
		p.processDoc("My letter");
		p.print("My letter");

		ConcreteScanner s = new ConcreteScanner("1313");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println("____________________________________________ \n");
		
		ComboDevice d = new ComboDevice("6767");
		d.processDoc("My dissertation");
		d.print("My dissertation");
		System.out.println("Scan result: " + d.scan());
	}

}
