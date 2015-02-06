import java.util.ArrayList;
import java.util.Scanner;

public class PokemonPlayer
	{
	static int tackleDamage = 10;
	int slashDamage = 12;
	int rageDamage = 9;
	int growlDamage = - 10;
	public static void greetGive()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String name = userInput.nextLine();	
		String compliment [] = {"Hello beautiful " + name, " thats a nice name " + name,  "You are looking lovely as ever "+ name,  "I like your shirt "+ name,  "Nice hair doo "+ name };   
		System.out.println("Lets play Pokemon, choose your Pokemon");
		int randomNumber = (int) ((Math.random() * 5));
		System.out.println(compliment[randomNumber]);

		System.out.println("1- Charmander");
		System.out.println("2- Bulbasaur");
		System.out.println("3- Squirtle");
	}
	public static void playerAttack()
	{
		int pokemonChoice = userInput.nextInt();		
		double attack = 0;
	
		System.out.println("Pick your move!");
		System.out.println("1- " + "Tackle");
		System.out.println("2- " + "Slash");
		System.out.println("3- " + "Rage");
		System.out.println("4- " + "Growl");
		int moveChoice = userInput.nextInt();
	
		if(moveChoice == 1)
			{
			System.out.println("Tackle does" + tackleDamage +" damage to" + AIPokemon);	
			}
		else if(moveChoice == 2)
			{
			System.out.println("Slash does 10" + " damage to" + PokemonMain.ai.getName());
			}
		else if(moveChoice == 3)
			{
			System.out.println("Rage does 10" + " damage to" + AIPokemon);
			}
		else if(moveChoice == 4)
			{
			System.out.println("Growl takes 3" + " damage points away from" + AIPokemon);
			}
		
		}
		public void battle (Pokemon Pokemon1, Pokemon Pokemon2)
		{
		  
		    System.out.println(Pokemon1+" begins the fight against "+Pokemon2);
		    Pokemon2.health = Pokemon2.health - Pokemon1.attack;

		    System.out.println(Pokemon1 +" does "+ Pokemon1.attack +" damage to "+
		    Pokemon2 +" and "+ Pokemon2 +" has "+ Pokemon2.health +" left.");

		    Pokemon1.health = Pokemon1.health - Pokemon2.attack;

		    System.out.println(Pokemon2 +" does "+ Pokemon2.attack +" damage to "+ 
		    Pokemon1 +" and "+ Pokemon1 +" has "+ Pokemon1.health +" left.");
		    
		    
		}
	}				
	


//Each of the following features must be included:

//at least one array (an ArrayList is a type of array)
//at least one regular for loop, for­each or while loop





