package creational.factory;

/**
 * 
 * @author softgroup_dmitriy
 *
 */
 class Factory {


	public static void main(String[] args) {

		Car honda = CarFacatory.getCar("honda", "civik", "manual", "2.0");
		Car ford = CarFacatory.getCar("ford", "focus", "manual", "1.2");

		System.out.format("%nhonda conf ->%s%n", honda);
		System.out.format("%nford conf ->%s%n", ford);
	}
}
