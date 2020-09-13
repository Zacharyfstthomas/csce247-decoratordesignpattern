package decoratordesignpattern;
/**
 * Player is an Abstract class that is meant to store the shared variables between the three  
 * concrete Mage, Warrior and Healer classes, which inherit from this class, as well as both calculate the base power level for the class, and 
 * return the generic part of the message for a player (ex. carries a ___, wears a ___)
 * name represents the entered name by the driver.
 * intellect,defense,and attack all are integers determined by which child concrete class is object is.
 * weapon and staff are both Strings determined by which child concrete class the object is.
 * @author zacharystthomas
 */
public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	/**
	 * 
	 * Returns the power for any player, calculated by multiplying the attack value by three,  
	 * adding the defense value, and the intellect value divided by two. 
	 * @return the result of the above calculation.
	 */
	public double getPower() {
	double power = (this.attack)*3 + this.defense + (this.intellect)/2;
	return power;	
	}	
	/**
	 * @return Returns the name value, followed by a new line 
	 * and then the weapon value and the armor value 
	 * framed as the equipment of the player.
	 */
	public String toString() {
		return this.name+"\nCarries a "+this.weapon+ ", and wears a "+ this.armor;
	}
	
	
	

}
