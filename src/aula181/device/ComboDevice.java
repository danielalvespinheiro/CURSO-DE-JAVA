package aula181.device;

public class ComboDevice extends Device implements Scanner, Printer{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
		
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}

}
