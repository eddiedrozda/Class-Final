import java.util.ArrayList;
import java.util.Scanner;

public class PokemonPlayer
	{
	public static void giveName()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello. Welcome to the Poke Arena. What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello " + name + ", please pick your pokemon...");	
		System.out.println("1 = Charmander");
		System.out.println("2 = Bulbasaur");
		System.out.println("3 = Squirtle");
		
		
		int pokemonChoice = userInput.nextInt();		
		double attack = 0;
		
		System.out.println("Pick your move!");
		System.out.println("1- " + "Tackle");
		System.out.println("2- " + "Slash");
		System.out.println("3- " + "Rage");
		System.out.println("4- " + "Leaf blade");
		int moveChoice = userInput.nextInt();
		
		if(moveChoice == 1)
			{
			System.out.println("Tackle does" + getDamage(pokemonChoice) + "damage to" + Pokemon Pokemon2);	
			}
		else if(moveChoice == 2)
			{
			System.out.println();
			}
		else if(moveChoice == 3)
			{
			System.out.println();
			}
		else if(moveChoice == 4)
			{
			System.out.println();
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





