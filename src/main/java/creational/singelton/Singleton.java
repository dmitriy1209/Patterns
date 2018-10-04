package creational.singelton;

class Singleton {

	public static void main(String[] args) {
		EagerInit instanceOne = EagerInit.getInstance();
		EagerInit instanceTwo = EagerInit.getInstance();

		LazyInit instanceThree = LazyInit.getInstance();
		LazyInit instanceFour = LazyInit.getInstance();

		printInstance(instanceOne, instanceTwo);
		printInstance(instanceThree, instanceFour);

	}

	private static void printInstance(Object one, Object two) {
		System.out.format("%nTwo reference point to the same instance %n %s %n %s %n", one, two);
	}
}
