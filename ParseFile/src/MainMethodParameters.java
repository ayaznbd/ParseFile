import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainMethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\datarefined")));
			
			//write contents of StringBuffer to a file
			bwr.write(stringBuffer.toString());
			
			//flush the stream
			bwr.flush();
			
			//close the stream
			bwr.close();
			fileReader.close();
		//	System.out.println("Contents of file:");
		//	System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			File file = new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\datarefined");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			StringBuffer stringBuffer2 = new StringBuffer();
			StringBuffer stringBuffer3 = new StringBuffer();
			StringBuffer stringBuffer4 = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String classname= line.substring(1, line.lastIndexOf(".")); 	
				String methodname= line.substring(line.lastIndexOf(".")+1, line.indexOf("(")); 
				String parameters= line.substring(line.lastIndexOf("(")+1, line.indexOf(")")); 
				String returnvalue= line.substring(line.lastIndexOf(")")+1, line.length()); 
				stringBuffer.append(classname);
				stringBuffer.append("\n");
				stringBuffer2.append(methodname); 
				stringBuffer2.append("\n");
				if( parameters.contains("java/lang") || parameters.length()<=6) {
					stringBuffer3.append(""); 
					stringBuffer3.append("\n"); 
				}
				else {
					stringBuffer3.append(parameters); 
					stringBuffer3.append("\n"); 
				}
				if(returnvalue.contains("java/lang")|| returnvalue.length()<=6) {
					stringBuffer4.append(""); 
					stringBuffer4.append("\n"); 
				}
				else {
					stringBuffer4.append(returnvalue); 
					stringBuffer4.append("\n"); 
				}
			
				//
			}
			
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\classnames")));
			
			//write contents of StringBuffer to a file
			bwr.write(stringBuffer.toString());
			
			//flush the stream
			bwr.flush();
			
			//close the stream
			bwr.close();
			
	BufferedWriter bwr2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\methodnames")));
			
			//write contents of StringBuffer to a file
			bwr2.write(stringBuffer2.toString());
			
			//flush the stream
			bwr2.flush();
			
			//close the stream
			bwr2.close();
			
			
BufferedWriter bwr3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\parameters")));
			
			//write contents of StringBuffer to a file
			bwr3.write(stringBuffer3.toString());
			
			//flush the stream
			bwr3.flush();
			
			//close the stream
			bwr3.close();
		
			
BufferedWriter bwr4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\return")));
			
			//write contents of StringBuffer to a file
		bwr4.write(stringBuffer4.toString());
			
			//flush the stream
		bwr4.flush();
			
			//close the stream
		bwr4.close();
		BufferedReader[] readers = new BufferedReader[4]; 
		readers[0] = new BufferedReader(new FileReader("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\classnames"));
		readers[1] = new BufferedReader(new FileReader("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\methodnames"));
		readers[2] = new BufferedReader(new FileReader("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\parameters"));
		readers[3] = new BufferedReader(new FileReader("C:\\Users\\mouna\\git\\ParseFile\\ParseFile\\src\\return"));	

		boolean noMoreLine = false;
		while (!noMoreLine)  {
		
	        String myline = readers[0].readLine();
	        String myline2 = readers[1].readLine();
	        String myline3 = readers[2].readLine();
	        String myline4 = readers[3].readLine();
	        if (myline == null){
	           noMoreLine = true;
	          
	           break;
	        }
	       // System.out.println("CLASS  "+ myline);
	        //System.out.println("METHOD "+ myline2);
	       // System.out.println("PARAMETERS "+ myline3);
	        //System.out.println("RETURN  "+ myline4+"\n\n");
	       if(myline4!="") {
	    	   myline4=myline4.replace("/", "."); 
	    	   myline4=myline4.replace("L", ""); 
	    	   myline4=myline4.replace(";", ""); 
	    	   myline4=myline4.replace("\"", ""); 
	       }
	      
	      
	        String[]tokens = myline3.split(";");
	        
	       for(int i=0; i<tokens.length; i++) {
	    	   if(tokens[i]!="") {
	    		
		    	    tokens[i]= tokens[i].replace("/", "."); 
		    	    tokens[i]=tokens[i].replace("L", ""); 
		    	    tokens[i]=tokens[i].replace(";", ""); 
		    	    tokens[i]=tokens[i].replace("\"", ""); 
	    	   }
	    	
	    	   System.out.println("((SELECT methods.id FROM methods INNER JOIN classes ON methods.methodname='"+myline2+"' AND classes.classname='"+myline+"'"
	    	   		+ "where classes.id=methods.classid),("
	    	   		+ "SELECT classes.id FROM classes where classname='"+tokens[i]+"'),false),");
	       }
	       System.out.println("((SELECT methods.id FROM methods INNER JOIN classes ON methods.methodname='"+myline2+"' AND classes.classname='"+myline+"'where classes.id=methods.classid"
	       		+ "),("
	    	   		+ "SELECT classes.id FROM classes where classname='"+myline4+"'),true),");
		}	
		
		
			//System.out.println("Contents of file:");
		//	System.out.println(stringBuffer.toString());
			fileReader.close();
			
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
