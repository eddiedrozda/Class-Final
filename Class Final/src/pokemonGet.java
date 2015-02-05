import java.util.ArrayList;
public class pokemonGet 
{

public static void PokemonAssign()
{
	ArrayList <Pokemon> roster = new ArrayList <Pokemon>();
	roster.add(new Pokemon("Charmander", 40, 10));
	roster.add(new Pokemon("Bulbasaur", 40, 10));
	roster.add(new Pokemon("Squirtle", 40, 10));
	
	
	for(int i = 0; i < roster.size(); i++)
	{
	int choice = 0;
	int randomNumber = (int) ((Math.random() * 3) + 1);
		{
	if(choice == 1)
		{
		System.out.println("Charmander");
		}
	else if (choice == 2)
		{
		System.out.println("Bulbasaur");
		}
	else if (choice == 3)
		{
		System.out.println("Squirtle");
		}
	roster.add(new Pokemon("Charmander", 40, 10));
	roster.add(new Pokemon("Bulbasuar", 40, 10));
	roster.add(new Pokemon("Squirtle", 40, 10));
	for(int i = 0; i < roster.size(); i++)
		{
	System.out.println(roster.get(i).getName() + " ");
	System.out.println(roster.get(i).getHealth() + " ");
	System.out.println(roster.get(i).getAttack() + " ");
	System.out.println();
}
		