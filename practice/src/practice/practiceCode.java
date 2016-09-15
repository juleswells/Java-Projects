/**
 * 
 */
package practice;

/**
 * @author juleswells
 *
 */

//imported library
import java.util.*;
public class practiceCode {
	
	
	//creation of a static final double variable
	public static final double FAVNUMBER = 1.234;
	
	
	//create variables of real world model
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	//protected variable meaning accessible by all src classes, gave a value
	protected static int numberOfAnimals = 0;
	
	
	
	//create new object
	static Scanner userInput = new Scanner(System.in);
	
       
	
	//Constructor
	    public practiceCode() {
	//increment numOfAnimals
	    numberOfAnimals++;
		
		
		
		//math functions and printing to screen
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);
		
		System.out.println("Enter Name:  /n");
		
		//hasNextint,hasNextFloat,hasNextDouble,hasNextChar,etc
		if(userInput.hasNextLine()){
		// could be nextInt,nextDouble,nextFloat,etc
		this.setName(userInput.nextLine());
		
			//method overloading-meaning the method can have more than one value, see the setters below: 
		// this is where the method is define. Here it is being called in the constructor
		this.setFavoriteChar();
		this.setUniqueID();
			
			
		}
		
		}
	//generated method
	private String userInput() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//setters and getters-generated by right clicking go to src-generate

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}
   //same method as below
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("This uniqueID is: " + this.uniqueID);
	}
	//method overloading
	public void setUniqueID() {
	long minNumber = 1;
	long maxNumber = 1000000;
	// the (long) in the equation is for casting
	this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
	}
	
	/*casting is for casting primitives to a string such as String stringNumber = long.tostring(maxNumber)
	you can also convert from a string to a primitive ex. int intNumber = Integer parseInt(stringNumber)
	likewise: same with other primitives
	*/
	
	

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int)(Math.random() * 126) + 1;
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber == 32){
			System.out.println("Favorite character set to Space");
		}
			else if (randomNumber == 10){
				System.out.println("Favorite character is set to New Line");
			}
			else{
				System.out.println("favorite character is set to" + this.favoriteChar);
			
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	

	public static void main(String[] args) {
		practiceCode k = new practiceCode();
		
		
		
		
		
	}

	

	}


