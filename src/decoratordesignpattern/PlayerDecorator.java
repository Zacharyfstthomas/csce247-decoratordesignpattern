package decoratordesignpattern;
/**
 * 
 * PlayerDecorator is a Abstract class which contains abstract methods. These methods are defined he,
 * to be used in the children of this class.
 * This class is also the child of Player, but because it is abstract, 
 * it does not need to implement its methods.
 * @author zacharystthomas
 *
 */
public abstract class PlayerDecorator extends Player{

	public abstract String toString();
	public abstract double getPower();
	 
}
