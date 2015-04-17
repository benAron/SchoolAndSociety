import java.util.*;

public class SchoolAndSociety { 
	
	public static void main(String []args) { 
		ArrayList<String> searchCollector = new ArrayList<String>();
		ArrayList<String> replaceCollector = new ArrayList<String>();
		ArrayList<String> inputCollector = new ArrayList<String>();
		String toOutput = ""; //will hold final str to be printed
		
		//Import documents
		FileToArrayList textDocs = new FileToArrayList();
		textDocs.loadAll();
		
		//Capture returns to main 
		searchCollector = textDocs.getSearch();
		replaceCollector = textDocs.getReplace();
		inputCollector = textDocs.getInput();
		
		//Set Translations.java
		Translations jargon = new Translations();
		jargon.set(searchCollector, replaceCollector, inputCollector);
		
		//Now that Translations is set, construct Rate.java
		Rate bookCycle = new Rate();
		
		//Loop through all of the cycles -- 25 words each
		int wordsAll = inputCollector.size();
		int perCycle = 25;
		int cycles = wordsAll / 25;
		
		for(int i = 0; cycles > i; i++) { 
			toOutput += bookCycle.cycle(perCycle, 5, searchCollector, inputCollector);
			toOutput += " ";	
		}
		System.out.println(toOutput);
	}

}
