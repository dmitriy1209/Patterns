package structural.proxy;

/**
 * 
 * @author softgroup_dmitriy
 *
 */

 class ProxyService implements ServiceDB {

	private ServiceDB service;
	private final int OPERATIONS_AMOUNT = 3;
	private int numbeeConnects;

	public ProxyService(ServiceDB service) {
		this.service = service;
	}

	@Override
	public void save() {
		if (numbeeConnects < OPERATIONS_AMOUNT) {
			service.save();
			numbeeConnects++;
		} else {
			System.out.println("You reached your limit");
		}
	}

	@Override
	public void read() {
		if (numbeeConnects < OPERATIONS_AMOUNT) {
			service.read();
			numbeeConnects++;
		} else
			System.out.println("You reached your limit");
	}

	@Override
	public void write() {
		if (numbeeConnects < OPERATIONS_AMOUNT) {
			service.write();
			numbeeConnects++;
		} else {
			System.out.println("You reached your limit");
		}
	}
}
