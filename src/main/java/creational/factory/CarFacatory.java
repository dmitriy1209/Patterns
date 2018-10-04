package creational.factory;
/**
 * 
 * @author softgroup_dmitriy
 *
 */
 class CarFacatory {

	public static Car getCar(String type, String label, String transmision, String enginePower) {

		if ("Ford".equalsIgnoreCase(type)) {
			return new Ford(label, transmision, enginePower);
		}

		else if ("Honda".equalsIgnoreCase(type)) {
			return new Ford(label, transmision, enginePower);
		}
		return null;
	}
}
