import java.util.*;

public class Rate { 
  int scope; //how many words per cycle
  int altered; //how many words translated per cycle
  int inputAmount; // total amount of words in input
  String wordForTranslate = "";
  
  Random rand = new Random(); 
  
  public String cycle (int currentScope, int currentAlt, ArrayList<String> fullSearch, ArrayList<String> fullInput) { //use Translations.java to produce translation
    scope = currentScope;
    altered = currentAlt; 
    inputAmount = fullInput.size();
    
    int currentRand;
    ArrayList<Integer> randomVals = new ArrayList<Integer>();
    
    //Generate random values 
    while(randomVals.size() < altered) { 
      currentRand = rand.nextInt(scope + 1); //create random number
      if(randomVals.contains(currentRand) != true) { //only include non-repeating
        randVals.add(currentRand); 
      }
    }
    System.out.println("Random numbers generated.");
    
    //Cycle through segment of book and put through translate
    boolean translateOption = true;
    
    for(int i = 0; inputAmount > i; i++) { 
      wordForTranslate = fullInput.get(i); //pick word from input
      
      if(fullSearch.contains(wordForTranslate) != true) {
        translateOption = false; 
      }
      
      jargon.translate(i, translateOption);
    }
}
