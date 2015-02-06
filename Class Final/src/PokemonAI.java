import java.util.Scanner;

public class PokemonAI 
{
	public static void AIChoose()
		{
		Pokemon ai = new Pokemon(" ", 0, 0);
		int choice = (int) ((Math.random() * 3) + 1);
		
		if(choice == 1)
			{
			ai.setName("Charmander");
			System.out.println("Charmander");
			}
		else if (choice == 2)
			{
			ai.setName("Bulbasaur");
			System.out.println("Bulbasaur");
			}
		else if (choice == 3)
			{
			ai.setName("Squirtle");
			System.out.println("Squirtle");
			}
		}
	public static void AIAttack()
		{
		int choice = (int) ((Math.random() * 4) + 1);		
		double attack = 0;
	
		System.out.println("Pick your move!");
		System.out.println("1- " + "Tackle");
		System.out.println("2- " + "Slash");
		System.out.println("3- " + "Rage");
		System.out.println("4- " + "Growl");
		Scanner userInput = new Scanner(System.in);
		int moveChoice = userInput.nextInt();
	
		if(moveChoice == 1)
			{
			System.out.println("Your enemies tackle does" + PokemonPlayer.tackleDamage +" damage to" + AIPokemon);	
			}
		else if(moveChoice == 2)
			{
			System.out.println("Your enemies slash does 10" + " damage to" + AIPokemon);
			}
		else if(moveChoice == 3)
			{
			System.out.println("Your enemies rage does 10" + " damage to" + AIPokemon);
			}
		else if(moveChoice == 4)
			{
			System.out.println("Your enemies growl takes 3" + " damage points away from" + AIPokemon);
			}
			
		}
	}
}




