package creational.abstractFactory;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class CarFacatory {

	public static Car getCar(CarAbstractFactory carFactory) {
		return carFactory.createCar();
	}
}
