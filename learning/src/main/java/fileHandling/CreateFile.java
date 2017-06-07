package fileHandling;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
	
	
	public static void createFileUsingBufferedOutputStream() throws IOException
	{
		FileOutputStream fos = new FileOutputStream("files\\BufferedOutputStream.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String line = "This is surajit.\nLearning Java...";
		byte[] data = line.getBytes();
		bos.write(data);
		bos.close();
	
	}
	

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("files\\MyTestFile.txt");
		if(!file.exists())
		{
			file.createNewFile();
		PrintWriter pw = new PrintWriter(file);
		//FileWriter fw = new FileWriter(file);
		for(int i=1;i<=10;i++)
		{
			pw.println("This is line "+i);
		}
		
		pw.close();
		
		System.out.println("Done.");
		}
		else{
			System.out.println("File already exists...");
		}
		
		createFileUsingBufferedOutputStream();
		System.out.println("File created...");
	}

}
