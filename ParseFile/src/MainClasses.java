

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClasses {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\data");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String newline=breakString(line); 
				
				stringBuffer.append(newline);
				stringBuffer.append("\n");
				//
			}
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demo")));
			
			//write contents of StringBuffer to a file
			bwr.write(stringBuffer.toString());
			
			//flush the stream
			bwr.flush();
			
			//close the stream
			bwr.close();
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try {
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demo");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
			String newline=breakString(line); 
				 newline=line.substring(0, line.lastIndexOf(".") ); 
				stringBuffer.append(newline);
				stringBuffer.append("\n\n");
			}
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demo2")));
			
			//write contents of StringBuffer to a file
			bwr.write(stringBuffer.toString());
			
			//flush the stream
			bwr.flush();
			
			//close the stream
			bwr.close();
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\finalfile");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
			String newline=breakString(line); 
				 newline="('"+newline+"'),"; 
				stringBuffer.append(newline);
				stringBuffer.append("\n\n");
			}
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\classdatabasefile")));
			
			//write contents of StringBuffer to a file
			bwr.write(stringBuffer.toString());
			
			//flush the stream
			bwr.flush();
			
			//close the stream
			bwr.close();
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static  String breakString(String str)
	{
	    String newstr=str.replaceAll(" --- ", "\n"); 
	    return newstr; 
	}
}