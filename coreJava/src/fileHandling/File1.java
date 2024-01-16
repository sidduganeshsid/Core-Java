package fileHandling;

import java.io.File;

public class File1 {

	public static void main(String[] args) throws Exception {
		
		String fileName = "abc.txt";
		File f = new File(fileName);
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
		
	}

}
