import java.io.*;
import java.util.*;

public class SchoolAndSociety { 
	
	public static void main(String []args) { 
		ArrayList<String> searchCollector = new ArrayList<String>();
		ArrayList<String> replaceCollector = new ArrayList<String>();
		ArrayList<String> inputCollector = new ArrayList<String>();
		
		//Import documents
		FileToArrayList textDocs = new FileToArrayList();
		textDocs.loadAll();
		
		//Capture returns to main 
		searchCollector = textDocs.getSearch();
		replaceCollector = textDocs.getReplace();
		inputCollector = textDocs.getInput();
		
		
		
		
		
		
		
	}

}