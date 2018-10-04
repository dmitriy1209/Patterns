package structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * 
 * 
 * PotionFactory is the Flyweight factory in this code;
 * 
 * @author softgroup_dmitriy
 * 
 * 
 */

class CarFactory {

	private Map<CarType, Car> cars;

	public CarFactory() {
		cars = new EnumMap<>(CarType.class);
	}

	Car buildCar(CarType type) {
		Car car = cars.get(type);

		if (car == null) {

			switch (type) {
				case CLASSIC:
					car = new ClassicCar();
					cars.put(type, car);
					break;
				case OLD:
					car = new OldCar();
					cars.put(type, car);
					break;
				case SPORT:
					car = new SportCar();
					cars.put(type, car);
					break;
				default:
					break;
			}
		}
		return car;
	}
}
