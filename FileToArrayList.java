import java.io.*;
import java.util.*;

public class FileToArrayList { 
	ArrayList<String> returnSearch = new ArrayList<String>();
	ArrayList<String> returnReplace = new ArrayList<String>();
	ArrayList<String> returnInput = new ArrayList<String>();

	public void loadAll() { //Method to originally load the file to be converted to arraylist
		String thisLine = ""; //Holds incoming line
		
		String searchCollector = "";
		String replaceCollector = "";
		String inputCollector = "";
		
		BufferedReader br = null;
		BufferedReader br2 = null;
		BufferedReader br3 = null;
		
		//load search.txt
		try{
        		br = new BufferedReader(new FileReader(new File("search.txt")));
         		while ((thisLine = br.readLine()) != null) {
            		searchCollector += thisLine;
       			}       
      		}catch(Exception e){
         		e.printStackTrace();
     		}
     	
     	//load replace.txt
		try{
        		br2 = new BufferedReader(new FileReader(new File("replace.txt")));
         		while ((thisLine = br2.readLine()) != null) {
            		replaceCollector += thisLine;
       			}       
      		}catch(Exception e){
         		e.printStackTrace();
     		}	
     	
     	//load input.txt
		try{
        		br3 = new BufferedReader(new FileReader(new File("input.txt")));
         		while ((thisLine = br3.readLine()) != null) {
            		inputCollector += thisLine;
       			}       
      		}catch(Exception e){
         		e.printStackTrace();
     		}	
     		
     	//Strings to ArrayList
     	String[] searchSplit = searchCollector.split(" ");
     	String[] replaceSplit = replaceCollector.split(" ");
     	String[] inputSplit = inputCollector.split(" ");
     	
     	ArrayList<String> saveSearch = new ArrayList<String>(Arrays.asList(searchSplit));
		ArrayList<String> saveReplace = new ArrayList<String>(Arrays.asList(replaceSplit));
		ArrayList<String> saveInput = new ArrayList<String>(Arrays.asList(inputSplit));
		
		//Save to class 
		returnSearch = saveSearch;
		returnReplace = saveReplace;
		returnInput = saveInput;
     } //end of load()
     
     //Return methods
     public ArrayList<String> getSearch() { 
     	return returnSearch;
     }
     
     public ArrayList<String> getReplace() { 
     	return returnReplace;
     }
     
     public ArrayList<String> getInput() { 
     	return returnInput;
     }
}