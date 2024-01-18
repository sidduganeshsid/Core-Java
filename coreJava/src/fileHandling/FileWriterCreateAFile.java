package fileHandling;

import java.io.File;
import java.io.FileWriter;

public class FileWriterCreateAFile {

	public static void main(String[] args) throws Exception {
		String fileName = "Story.txt";
		File f = new File(fileName);
		f.createNewFile();
		System.out.println(f.exists());
		FileWriter fw = new FileWriter(fileName);
		fw.write("The Meadow's Lesson: A Tale of Speed and Steadfastness\n");
		fw.write("In a peaceful meadow, the swift and boastful rabbit Robbie challenges the slow but determined tortoise Terry to a race. Robbie takes an early lead but becomes overconfident, deciding to nap midway. Meanwhile, Terry persists at a steady pace, ultimately winning the race while Robbie sleeps. The story teaches a valuable lesson about the importance of determination and consistency, showcasing that slow and steady effort can lead to success, as the meadow animals learn to appreciate both speed and perseverance.");
		
		//flush
		fw.flush();
		fw.close();
		
		
	}

}
