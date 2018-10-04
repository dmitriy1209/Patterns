package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class CarShop implements Cloneable {

	private List<String> carList;

	public CarShop() {
		this.carList = new ArrayList<>();
	}

	public CarShop(List<String> arr) {
		this.carList = arr;
	}

	/*
	 * imitate loading data from database;
	 * 
	 */
	public void loadDataFromDB() {
		carList.add("Honda");
		carList.add("Ford");
		carList.add("Mersedes");
	}

	public List<String> getCarList() {
		return carList;
	}

	/*
	 * 
	 * Here we do deep cloning;
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> newList = new ArrayList<>(carList);
		return new CarShop(newList);
	}
}
