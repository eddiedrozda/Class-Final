import java.util.Scanner;

public class PokemonMain 
{
	static boolean playing = true;
	public static void main(String[] args)
		{
		PokemonPlayer.greetGive();
		pokemonGet.stats();

		Pokemon ai = new Pokemon(" ", 0, 0);
		PokemonAI.AIChoose();
		
		int counter = 0;
		while(playing)
			{
			PokemonPlayer.playerAttack();
			PokemonAI.AIAttack();
			PokemonPlayer.diplayHealth();
			
			counter = counter + 1;
			if(playerWins == true)
				{
				System.out.println("You Win! Goodbye");
				System.exit(0);
				}
			else(playerWins == false)
				{
				System.out.println("You lose. Goodbye");
				System.exit(0);
				}
			}
		}
	}
