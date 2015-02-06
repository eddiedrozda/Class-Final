import java.util.ArrayList;

public class pokemonGet 
	{
	static ArrayList <Pokemon> roster = new ArrayList <Pokemon>();
	public static void stats()
		{
		roster.add(new Pokemon("Charmander", 48, 9));
		roster.add(new Pokemon("Bulbasaur", 44, 10));
		roster.add(new Pokemon("Squirtle", 40, 13));
		
		Pokemon p = new Pokemon(" ", 0, 0);
		for(int i = 0; i < roster.size(); i++)
			{
			int choice = 0;
			int randomNumber = (int) ((Math.random() * 3) + 1);
			if(choice == 1)
				{
				p.setName("Charmander");
				System.out.println("Charmander");
				}
			else if (choice == 2)
				{
				p.setName("Bulbasaur");
				System.out.println("Bulbasaur");
				}
			else if (choice == 3)
				{
				p.setName("Squirtle");
				System.out.println("Squirtle");
				}
			}
		}
	
		public static void displayList()
			{
			for(int i = 0; i < roster.size(); i++)
				{
				System.out.println(roster.get(i).getName() + " ");
				System.out.println(roster.get(i).getHealth() + " ");
				System.out.println(roster.get(i).getAttack() + " ");
				System.out.println();
				}	
			}
	}
