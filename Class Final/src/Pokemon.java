import java.util.ArrayList;
public class Pokemon 
{
	
	public String name;
	public int health;
	public int attack;
		
		public Pokemon (String na, int he, int at)
			{	
			name = na;
			health = he;
			attack = at;
			}
		
	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public int getAttack() {
			return attack;
		}
		public void setAttack(int attack) {
			this.attack = attack;
		}

}
