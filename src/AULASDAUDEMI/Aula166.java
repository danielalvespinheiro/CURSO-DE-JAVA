package AULASDAUDEMI;

import java.io.File;
import java.util.Scanner;

public class Aula166 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		File[] filers = path.listFiles(File::isFile);
		
		System.out.println("\nFolders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}

		System.out.println("\nFiles: ");
		for(File filer : filers) {
			System.out.println(filer);
		}
		
		System.out.println("\nEnter a new folder name, ex: (\\Folder-name)");
		String foldName = sc.nextLine();
		
		boolean success = new File(strPath + foldName).mkdir();
		
		System.out.println("Directory created successfuly: " + success);
		
		sc.close();
	}
	
}
