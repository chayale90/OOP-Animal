
public class Main {

	public static void main(String[] args) {

		// Dog
		Dog d = new Dog(true, true, 1);
		System.out.println(d);
		System.out.println(d.isMammals());
		d.setCarnivorous(false);
		d.setCarnivorous(true);
		d.sayHello();
		d.sayHello(0);
		d.sayHello(6);

		System.out.println("");
		// Cat
		Cat c = new Cat(true, true, 5);
		System.out.println(c);
		c.sayHello();
		c.sayHello(0);
		c.sayHello(1);
		System.out.println(c.getNumberOfLegs());

		System.out.println("");
		// Frog
		Frog f = new Frog(false, false, 3);
		System.out.println(f);
		f.sayHello();
		f.sayHello(1);
		System.out.println(f.hasGills());
		System.out.println(f.hasLaysEggs());

	}

}
