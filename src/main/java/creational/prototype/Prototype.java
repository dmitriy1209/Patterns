package creational.prototype;

import java.util.List;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class Prototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		CarShop carShop = new CarShop();
		carShop.loadDataFromDB();

		List<String> listOldCars;
		List<String> listCarShop;

		listCarShop = carShop.getCarList();
		listCarShop.add("Lexus");

		// Do deep cloning
		CarShop oldCars = (CarShop) carShop.clone();

		// adding some new elements to list
		listOldCars = oldCars.getCarList();
		listOldCars.add("Dodge");
		listCarShop.forEach(item -> System.out.println(item));
		System.out.println("_______________________________________________");
		listOldCars.forEach(item -> System.out.println(item));
	}
}
