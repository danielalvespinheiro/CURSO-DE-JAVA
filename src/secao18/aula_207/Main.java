package secao18.aula_207;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Products> p = new ArrayList<Products>();
		
		p.add(new Products("Tv", 900.00));
		p.add(new Products("Mouse", 50.00));
		p.add(new Products("Tablet", 350.50));
		p.add(new Products("HD Case", 80.90));
		
		ProductsService ps = new ProductsService();
		
		 double sum = ps.filteredSum(p, v -> v.getName().charAt(0) == 'T');
		 //double sum = ps.filteredSum(p, v -> v.getPrice() < 100.00 );
		
		System.out.println(String.format("%.2f", sum));
		
	}

}
