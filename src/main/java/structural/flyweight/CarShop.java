package structural.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 
 * @author softgroup_dmitriy
 *
 */

class CarShop {

	private List<Car> expensiveCars;
	private List<Car> cheapCars;

	public CarShop() {
		this.expensiveCars = new ArrayList<>();
		this.cheapCars = new ArrayList<>();
		fillTheShop();
	}

	private void fillTheShop() {

		CarFactory carFactory = new CarFactory();

		expensiveCars.add(carFactory.buildCar(CarType.SPORT));
		expensiveCars.add(carFactory.buildCar(CarType.CLASSIC));
		expensiveCars.add(carFactory.buildCar(CarType.SPORT));
		expensiveCars.add(carFactory.buildCar(CarType.CLASSIC));

		cheapCars.add(carFactory.buildCar(CarType.OLD));
		cheapCars.add(carFactory.buildCar(CarType.OLD));
	}

	/**
	 * Get a read-only list of all expensive cars
	 *
	 * @return The expensive cars
	 */
	public final List<Car> getExpensiveCars() {
		return Collections.unmodifiableList(this.expensiveCars);
	}

	/**
	 * Get a read-only list of all cheap cars
	 *
	 * @return The cheap cars
	 */
	public final List<Car> getCheapCars() {
		return Collections.unmodifiableList(this.cheapCars);
	}


	/**
	 * Enumerate cars
	 */
	public void enumerate() {

		System.out.println("Enumerating expensive cars");

		for (Car car : expensiveCars) {
			car.drive();
		}

		System.out.println("Enumerating cheap cars");

		for (Car car : cheapCars) {
			car.drive();
		}
	}
}
