

public class pokemonGet 
{
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
	itsAnArray.add(new Pokemon("Charmander", 40, 10));
	itsAnArray.add(new Pokemon("Bulbasuar", 40, 10));
	itsAnArray.add(new Pokemon("Squirtle", 40, 10));
	for(int i = 0; i < itsAnArray.size(); i++)
		{
	System.out.println(itsAnArray.get(i).getName() + " ");
	System.out.println(itsAnArray.get(i).getHealth() + " ");
	System.out.println(itsAnArray.get(i).getAttack() + " ");
	System.out.println();
	
		}
	