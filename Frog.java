/**
 * A class representing a frog.
 */
public class Frog extends Animal implements Land,Water {
	
	/* Represents the number of legs of the frog. */
	private int numberOfLegs=4;

	/**
	 * Constructs a frog with the given characteristics.
	 *
	 * @param mammals     if the frog is a mammal or not.
	 * @param carnivorous if the frog is carnivorous or not.
	 * @param mood        a number indicating the mood of the frog.
	 */
	public Frog(boolean mammals, boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
	}

	
	@Override
	public void sayHello(int mood) {
		if (mood == MOOD_HAPPY) {
			System.out.println("quack quack quack");
		}
		// mood == MOOD_SCARE
		else
			System.out.println("plop into the water");
	}
	
	
	@Override
	public String toString() {
		return "Frog [" + super.toString() +" numberOfLegs="+ numberOfLegs+"]";
	}
	
	@Override
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	@Override
	public boolean hasGills() {
		return true;
	}

	@Override
	public boolean hasLaysEggs() {
		return true;
	}

	
}
