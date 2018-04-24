

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainMethods {

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
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demoMethods")));
			
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
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demoMethods");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			
			File file2 = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demoMethods");
			FileReader fileReader2 = new FileReader(file);
			BufferedReader bufferedReader2 = new BufferedReader(fileReader);
			StringBuffer stringBuffer2 = new StringBuffer();
			String line2 = null;
			while ((line = bufferedReader.readLine()) != null) {
			String newline=breakString(line); 
				 newline=line.substring(1, line.lastIndexOf(".") ); 
				 String newline2=line.substring( line.lastIndexOf(".")+1 , line.lastIndexOf("(")); 
				
				 String mynewline="((SELECT ID from Classes WHERE ClassName='"+newline+"'),'"+newline2+"'),"; 
				stringBuffer.append(mynewline);
				stringBuffer.append("\n\n");
				
				
				
			}
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demo2MethodsClassNames")));
			
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
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demoMethods");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
			String newline=breakString(line); 
				 newline=line.substring( line.lastIndexOf(".") , line.length()); 
				stringBuffer.append(newline);
				stringBuffer.append("\n\n");
			}
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\demo3MethodsMethodNames")));
			
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
		
		/*try {
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
		}*/
		
		
	}
	
	
	public static  String breakString(String str)
	{
	    String newstr=str.replaceAll(" --- ", "\n"); 
	    return newstr; 
	}
}