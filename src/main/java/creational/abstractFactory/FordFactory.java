package creational.abstractFactory;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class FordFactory implements CarAbstractFactory {

	private String label;
	private String transmision;
	private String enginePower;

	public FordFactory(String label, String transmision, String enginePower) {
		this.label = label;
		this.transmision = transmision;
		this.enginePower = enginePower;
	}

	@Override
	public Car createCar() {
		return new Ford(label, transmision, enginePower);
	}
}
