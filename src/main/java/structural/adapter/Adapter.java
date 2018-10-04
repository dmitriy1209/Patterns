package structural.adapter;

/**
 * Lets imagine that our driver Alex can drive only a van, but during the trip the van broke down
 * and we need to get to the service station. Thanks God we have a bicycle in our van, but it has
 * another way of driving. Adapter lets classes work together that couldn't otherwise because of
 * incompatible interfaces.
 * 
 * @author softgroup_dmitriy
 *
 */

 class Adapter {

	public static void main(String... args) {
		Driver Alex = new Driver(new BicycleAdapter());
		Alex.drive();
	}
}
