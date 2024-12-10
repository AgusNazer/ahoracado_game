import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // permite q el usuario escriba
        Scanner scanner = new Scanner(System.in);
        // cambiar la manera para crear la palabra a adivinar, buscar algun metodo que
        // genere palabras random
    String secretWord = "fundamentals";
    int maxAtemps = 10;
    int atemps = 0;
    boolean foundedWord = false;

    char[] foundedChar = new char[secretWord.length()];

      for( int i = 0; i < foundedChar.length; i++){
        foundedChar[i] = '_';
        
    }
      while(!foundedWord && atemps < maxAtemps){
        System.out.println("Word to guess..." + String.valueOf(foundedChar));
        System.out.println("Fill with any letter");
        
        char letter = scanner.next().charAt(0);
        boolean correctLetter = false;
        
        for(int i = 0; i < secretWord.length(); i++){
            if(secretWord.charAt(i) == letter){
                foundedChar[i] = letter;
                correctLetter = true;
            }
        }
        if(!correctLetter){
            atemps++;
            System.out.println("Incorrect, left " + (maxAtemps - atemps) + " atemps.");
        }
        if(String.valueOf(foundedChar).equals(secretWord)){
            foundedWord = true;
            System.out.println("Well done, you has been guess the secret word: " + secretWord);
        }
      }
      if(!foundedWord){
        System.out.println("You lose! LOSER!@");
      }
    }
}
