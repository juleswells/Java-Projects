/*
 * The game of Hangman.
 * Gets guesses from user for word selected from list of predefined words.
 * Answered for : http://www.cramster.com/answers-apr-12/computer-science/java-hangman-program-killing-mewrite-hangman-ga_2481167.aspx
 * Answered on : 30/04/12
 */
package hangman;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * The Class Hangman.
 */
public class hangman {
	
	/** The word list. */
	String[] wordList = {"world","hello","program","hangman","game","random"};
	
	/** The guess word. */
	String guessWord;
	
	/** The no of misses. */
	int noOfMisses = 0;
	
	/** The allowed misses. */
	static final int allowedMisses = 5;
	
	/** The found char to mark characters found in the guessed word. */
	boolean[] foundChar;
	
	/** The random value that will be used to get a word from list. */
	static Random r = new Random();
	
	/**
	 * Check if game is completed.
	 *
	 * @return true, if successful
	 */
	public boolean checkCompleted(){
		for(int i=0;i<foundChar.length;i++)
			if(!foundChar[i])
				return false;
		return true;
	}
	
	/**
	 * Prints the completed chars.
	 */
	public void printCompletedChars(){
		for(int i=0;i<guessWord.length();i++){
			if(foundChar[i])
				System.out.print(guessWord.charAt(i));
			else
				System.out.print("*");
		}
		System.out.println();
	}
	
	/**
	 * Try to guess each character in the game.
	 */
	public void tryToGuess(){
		Scanner input = new Scanner(System.in);
		foundChar = new boolean[guessWord.length()];
		boolean completed = false;
		while( (noOfMisses < allowedMisses) && !completed){
			System.out.print("(Guess) Enter a letter in word ");
			printCompletedChars();
			System.out.println("> ");
			char guess = input.next().charAt(0);
			if(guess=='?'){
				System.out.println("Number of incorrect guesses till now: "+noOfMisses);
				System.out.println("Total allowed "+hangman.allowedMisses);
				continue;
			}
			if(guessWord.contains(guess+"")){
				for(int i=0;i<guessWord.length();i++){
					if(guessWord.charAt(i)==guess)
						foundChar[i] = true;
				}				
			}else{
				noOfMisses++;
			}
			completed = checkCompleted();
		}
		if(completed){
			System.out.println("You guessed correctly. ");
		}
		System.out.println("Correct answer is "+guessWord);		
		System.out.println("Total number of incorrect guesses "+noOfMisses);
	}
	
	/**
	 * Instantiates a new hangman game.
	 */
	public hangman(){
		
		System.out.println("==================");
		System.out.println("Welcome to HANGMAN");
		System.out.println("==================");
		System.out.println("Incorrect guesses allowed "+allowedMisses);
		System.out.println("Start guessing..");		
		guessWord = wordList[r.nextInt(wordList.length)];
		tryToGuess();
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		int choice = 0;
		boolean finished = false;
		while(!finished){
			new hangman();
			System.out.println("Do you want to continue? (y/n) ");
			try {
				choice = System.in.read();
			} catch (IOException e) { }
			if(choice=='y'){
				continue;
			}
			finished = true;
		}
	}
}