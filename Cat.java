/**
 * A class representing a cat.
 */
public class Cat extends Animal implements Land {
	
	/* Represents the number of legs of the cat. */
	private int numberOfLegs = 4;
	
	/**
	 * Constructs a cat with the given characteristics.
	 *
	 * @param mammals     if the cat is a mammal or not.
	 * @param carnivorous if the cat is carnivorous or not.
	 * @param mood        a number indicating the mood of the cat.
	 */
	public Cat(boolean mammals, boolean carnivorous, int mood) {
		super(mammals, carnivorous, mood);
	}

	@Override
	public void sayHello() {
		if (mood == MOOD_HAPPY)
			System.out.println("purr, purr");

		else if (mood == MOOD_SCARE)
			System.out.println("hiss");

		else
			System.out.println("meow~");
	}

	@Override
	public void sayHello(int moodArg) {
		mood = moodArg;
		sayHello();
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + " numberOfLegs=" + numberOfLegs + "]";
	}

	@Override
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

}
