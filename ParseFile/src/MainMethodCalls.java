import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainMethodCalls {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\data");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			StringBuffer stringBuffer2 = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String methodsCalling= line.substring(1, line.indexOf("---")); 	
				String ClassFROM=methodsCalling.substring(0, methodsCalling.lastIndexOf("."));
				String MethodFROM=methodsCalling.substring(methodsCalling.lastIndexOf(".")+1, methodsCalling.indexOf("("));
				String methodsCalled=line.substring(line.lastIndexOf("---")+5, line.length()-1); 			
				String ClassTO=methodsCalled.substring(0, methodsCalled.lastIndexOf("."));
				String MethodTO=methodsCalled.substring(methodsCalled.lastIndexOf(".")+1, methodsCalled.indexOf("(")); 
				stringBuffer.append("((SELECT Methods.ID from Methods \r\n" + 
						"INNER JOIN Classes \r\n" + 
						"ON Classes.ID=Methods.ClassID\r\n" + 
						"where Methods.MethodName='"+MethodFROM+"'  AND Classes.ClassName='"+ClassFROM+"'),"
								+ "(SELECT Methods.ID from Methods "  + 
								"INNER JOIN Classes "  + 
														"ON Classes.ID=Methods.ClassID"  +
								" where Methods.MethodName='"+MethodTO+"'AND Classes.ClassName='"+ClassTO+"')),");
				stringBuffer.append("\n");
				/*stringBuffer2.append("(SELECT MethodsID from Methods \r\n" + 
						"INNER JOIN Classes \r\n" + 
						"ON Classes.ClassID=Methods.ClassID\r\n" + 
						"where Methods.MethodName='"+MethodTO+"'  AND Classes.ClassName='"+ClassTO+"')),"); 
				stringBuffer2.append("\n");*/
				//
			}
			
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\methodsCalling")));
			
			//write contents of StringBuffer to a file
			bwr.write(stringBuffer.toString());
			
			//flush the stream
			bwr.flush();
			
			//close the stream
			bwr.close();
			
BufferedWriter bwr2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\methodsCalled")));
			
//write contents of StringBuffer to a file
bwr2.write(stringBuffer2.toString());

//flush the stream
bwr2.flush();

//close the stream
bwr2.close();
			
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
		
		
	}
	
	
	
}