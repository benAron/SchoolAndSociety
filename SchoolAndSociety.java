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
		
		//Now that Translations is set, construct Rate.java
		Rate bookCycle = new Rate();
		bookCycle.set(searchCollector, replaceCollector, inputCollector);
		
		//Loop through all of the cycles -- 25 words each
		int wordsAll = inputCollector.size();
		int perCycle = 25;
		int cycles = wordsAll / 25;
		
		for(int i = 0; cycles > i; i++) { 
			System.out.println("On cycle "+ i +" out of "+ cycles);
			toOutput += bookCycle.cycle(perCycle, 5, searchCollector, replaceCollector, inputCollector);
			toOutput += " ";	
		}
		System.out.println(toOutput);
	}

}
