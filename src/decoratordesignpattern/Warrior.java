package decoratordesignpattern;
/**
 * Warrior is one of the three concrete classes that inherit from the Player class.
 * Like the other two, it assigns values to the parent's variables, name, intellect,
 * attack, defense, weapon, and armor.
 * the parent's toString is also appended with the class name.
 * @author zacharystthomas
 */
public class Warrior extends Player{

	/**
	 * Constructor. Sets the values of the abstract parent Player's variables.
	 * @param name: the parent's name variable is set to this parameter.
	 */
	public Warrior(String name) {
		super.name = name;
		super.intellect=2;
		super.attack=8;
		super.defense=5;
		super.weapon="Sword";
		super.armor="Breast Plate";
	}
	/**
	 *@return Returns the text "Warrior: " alongside the parent's toString. 
	 */
	public String toString() {	
		return "Warrior: "+super.toString();
	}
	
	
}
