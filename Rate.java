import java.util.Random;

public class Rate { 
  int scope; //how many words per cycle
  int altered; //how many words translated per cycle
  int inputAmount; // total amount of words in input
  
  Random rand = new Random(); 
  
  public String cycle (int currentScope, int currentAlt, ArrayList<String> fullInput) { //uses translate.java to produce translation
    scope = currentScope;
    altered = currentAlt; 
    inputAmount = fullInput.size();
    
    int currentRand;
    ArrayList<Integer> randomVals = new ArrayList<Integer>;
    
    //Generate random values 
    while(randomVals.size() < altered) { 
      currentRand = rand.nextInt(scope + 1); //create random number
      if(randomVals.contains(currentRand) != true) { //only include non-repeating
        randVals.add(currentRand); 
      }
    }
    System.out.println("Random numbers generated.");
    
    
    
    
    
  }
}
