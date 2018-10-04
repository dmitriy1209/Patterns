package structural.proxy;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class Service implements ServiceDB {

	@Override
	public void save() {
		System.out.println("Saving to DB");
	}

	@Override
	public void read() {
		System.out.println("Reading from DB");
	}

	@Override
	public void write() {
		System.out.println("Writing ot DB");
	}
}
