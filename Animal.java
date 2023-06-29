
/**
 * An abstract class representing an animal.
 */
public abstract class Animal {

	/* Represents if the animal is a mammal. */
	private boolean mammals;
	/* Represents if the animal is a mammal. */
	private boolean carnivorous;
	/* Represents the mood of the animal. */
	protected int mood;
	/* Represents the value for a happy mood.*/
	protected final int MOOD_HAPPY = 1;
	/* Represents the value for a scare mood.*/
	protected final int MOOD_SCARE = 0;

	/**
	 * Constructs an animal with the given characteristics.
	 *
	 * @param mammals     if the animal is a mammal or not.
	 * @param carnivorous if the animal is carnivorous or not.
	 * @param mood        a number indicating the mood of the animal.
	 */
	public Animal(boolean mammals, boolean carnivorous, int mood) {
		this.mammals = mammals;
		this.carnivorous = carnivorous;
		this.mood = mood;
	}

	@Override
	public String toString() {
		return "mammals=" + mammals + ", carnivorous=" + carnivorous + ", MOOD_HAPPY=" + MOOD_HAPPY + ", MOOD_SCARE="
				+ MOOD_SCARE + ", mood=" + mood;
	}

	/**
	 * Prints a greeting from the animal.
	 */
	public void sayHello() {
		System.out.println("Hello");
	};

	/**
	 * Prints a greeting from the animal based on the given mood.
	 *
	 * @param moodArg the mood to be set for the animal.
	 */
	public abstract void sayHello(int mood);

	// Getter & Setter
	/**
	 * Checks if the animal is a mammal.
	 *
	 * @return true if the animal is a mammal, false otherwise.
	 */
	public boolean isMammals() {
		return mammals;
	}

	/**
	 * Sets the mammal status of the animal.
	 *
	 * @param mammals true if the animal is a mammal, false otherwise.
	 */
	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}

	/**
	 * Checks if the animal is carnivorous.
	 *
	 * @return true if the animal is carnivorous, false otherwise.
	 */
	public boolean isCarnivorous() {
		return carnivorous;
	}

	/**
	 * Sets the carnivorous status of the animal.
	 *
	 * @param carnivorous true if the animal is carnivorous, false otherwise.
	 */
	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

}
