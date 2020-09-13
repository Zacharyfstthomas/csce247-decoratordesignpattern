package decoratordesignpattern;
/**
 * Healer is one of the three concrete classes that inherit from the Player class.
 * Like the other two, it assigns values to the parent's variables, name, intellect,
 * attack, defense, weapon, and armor.
 * the parent's toString is also appended with the class name.
 * @author zacharystthomas
 */
public class Healer extends Player{
	/**
	 * Constructor. Sets the values of the abstract parent Player's variables.
	 * @param name: the parent's name variable is set to this parameter.
	 */
	public Healer (String name) {
		super.name = name;
		super.intellect = 8;
		super.attack = 2;
		super.defense = 3;
		super.weapon = "Staf";
		super.armor = "Robe";
	}
	/**
	 *@return Returns the text "Healer: " alongside the parent's toString. 
	 */
	public String toString() {
		
		return "Healer: "+super.toString();
	}
	
	
	
	
}
