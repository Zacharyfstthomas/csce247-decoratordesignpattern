package decoratordesignpattern;
/**
 * ArmorUpgrade is one of the children of PlayerDecorator, 
 * which adds an extra line to the player's toString and adds to the calculated power.
 * @author zacharystthomas
 */
public class ArmorUpgrade extends PlayerDecorator{

	private Player player;
	
	/**
	 * Constructor.
	 * @param player: Either a Warrior, Mage, or Healer, given to be set to this class's player variable.
	 */
	public ArmorUpgrade(Player player){
		
		this.player = player;
		
	}
	
	/**
	 * Adds a new line with the phrase "Upgraded armor" to the player's toString.
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return player.toString() + "\nUpgraded armor";
	}

	/**
	 * Adds three to the calculated value of the Player's power.
	 */
	public double getPower() {
		// TODO Auto-generated method stub
		return player.getPower() + 3;
	}
	
	
	
	
}
