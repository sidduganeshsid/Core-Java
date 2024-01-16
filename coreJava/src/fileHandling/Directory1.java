package fileHandling;

import java.io.File;

//java.io api classes are built using the standards of Unix os
public class Directory1 {

	public static void main(String[] args) {
		String directoryName = "POKEMON TEAM";
		
		//JVM TREATS AS THE ABOVE STMT AS THE DIRECTORY
		File f = new File(directoryName);
		System.out.println(f.exists());
		
		f.mkdir();
		
		System.out.println();
		System.out.println(f.exists());
	}

}
