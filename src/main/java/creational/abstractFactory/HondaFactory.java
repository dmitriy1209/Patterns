package creational.abstractFactory;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

class HondaFactory implements CarAbstractFactory {

	private String label;
	private String transmision;
	private String enginePower;

	public HondaFactory(String label, String transmision, String enginePower) {
		this.label = label;
		this.transmision = transmision;
		this.enginePower = enginePower;
	}

	@Override
	public Car createCar() {
		return new Ford(label, transmision, enginePower);
	}
}
