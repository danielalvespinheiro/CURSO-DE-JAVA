package AULASDAUDEMI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula165 {

	public static void main(String[] args) throws IOException {
		String[] lines = new String[] {"Good Mangustos", "Good car", "Good Gatos"};
		
		String path = "c:\\temp\\out.txt";
									// com esse true ele acrescenta no arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
	
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		
		} catch (IOException e) {
			System.out.println();
		}
		
		
	}

}
