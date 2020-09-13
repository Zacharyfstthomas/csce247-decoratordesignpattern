package decoratordesignpattern;
/**
 * Mage is one of the three concrete classes that inherit from the Player class.
 * Like the other two, it assigns values to the parent's variables, name, intellect,
 * attack, defense, weapon, and armor.
 * the parent's toString is also appended with the class name.
 * @author zacharystthomas
 */
public class Mage extends Player{
	/**
	 * Constructor. Sets the values of the abstract parent Player's variables.
	 * @param name: the parent's name variable is set to this parameter.
	 */
	public Mage(String name) {
		super.name = name;
		super.intellect = 7;
		super.attack = 3;
		super.defense = 4;
		super.weapon="Staf";
		super.armor="Robe";
	}
	
	/**
	 *@return Returns the text "Mage: " alongside the parent's toString. 
	 */
	public String toString() {
		
		
		return "Mage: "+super.toString();
	}
}
