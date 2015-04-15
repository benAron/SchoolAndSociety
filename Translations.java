
public class Translations { 
	ArrayList<String> holdSearch = new ArrayList<String>();
	ArrayList<String> holdReplace = new ArrayList<String>();
	ArrayList<String> holdInput = new ArrayList<String>();

	public void set(ArrayList<String> searchList, ArrayList<String> replaceList, ArrayList<String> inputList) { 
		holdSearch = searchList;
		holdReplace = replaceList;
		holdInput = inputList;
		
		System.out.println("Translations.java set");
	}
	
	//every word of input will be cycled through translate by rate.java
	public String translate(int wordNumber, boolean shouldTranslate) { 
		if(shouldTranslate) { 
			
		
		
		}	
		
	} 
}