/**
 * A class representing a dog.
 */
public class Dog extends Animal implements Land {

	/* Represents the number of legs of the dog. */
	private int numberOfLegs = 4;

	/**
	 * Constructs a dog with the given characteristics.
	 *
	 * @param mammals     if the dog is a mammal or not.
	 * @param carnivorous if the dog is carnivorous or not.
	 * @param mood        a number indicating the mood of the dog.
	 */
	public Dog(boolean mammals, boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
	}

	@Override
	public void sayHello() {
		if (mood == MOOD_HAPPY)
			System.out.println("bark loudly:hav hav");
		else if (mood == MOOD_SCARE)
			System.out.println("swhooping swhooping");
		else
			System.out.println("wagging their tails");
	}

	@Override
	public void sayHello(int moodArg) {
		mood = moodArg;
		sayHello();
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + " numberOfLegs=" + numberOfLegs + "]";
	}

	@Override
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

}
